package criptografia;
import javax.swing.JOptionPane;

public class Clave {

    public String getClave() {
        while (true) {
            String clave = JOptionPane.showInputDialog(
                null,
                "Introduce la clave para cifrar/descifrar:",
                "Clave requerida",
                JOptionPane.QUESTION_MESSAGE
            );

            if (clave == null) {
                // Usuario canceló
                JOptionPane.showMessageDialog(
                    null,
                    "Operación cancelada.",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE
                );
                return null;
            }

            clave = clave.trim();

            // Validaciones
            if (clave.length() < 6) {
                mostrarError("La clave debe tener al menos 6 caracteres.");
                continue;
            }

            if (!clave.matches(".*[A-Z].*")) {
                mostrarError("La clave debe contener al menos una letra mayúscula.");
                continue;
            }

            if (!clave.matches(".*[a-z].*")) {
                mostrarError("La clave debe contener al menos una letra minúscula.");
                continue;
            }

            if (!clave.matches(".*[0-9].*")) {
                mostrarError("La clave debe contener al menos un número.");
                continue;
            }

            if (!clave.matches(".*[!@#$%^&*()\\-_=+{}\\[\\]:;\"'<>,.?/~`].*")) {
                mostrarError("La clave debe contener al menos un símbolo.");
                continue;
            }

            if (clave.contains(" ")) {
                mostrarError("La clave no debe contener espacios.");
                continue;
            }

            if (esClaveComun(clave)) {
                mostrarError("La clave ingresada es demasiado común. Elige una más segura.");
                continue;
            }

            // Clave válida
            return clave;
        }
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Clave inválida", JOptionPane.ERROR_MESSAGE);
    }

    private boolean esClaveComun(String clave) {
        String[] comunes = {
            "123456", "password", "qwerty", "abc123", "admin", "clave",
            "12345678", "111111", "1234567", "123123", "dragon", "baseball",
            "football", "letmein", "monkey", "696969", "shadow", "master",
            "666666", "qwertyuiop", "123321", "mustang", "1234567890", 
            "michael", "trustno1", "sunshine", "iloveyou", "princess", 
            "welcome", "login", "admin123", "passw0rd", "123456789", 
            "superman", "1qaz2wsx", "starwars", "whatever", "contraseña",
            "123qwe", "liverpool", "adobe123", "photoshop", "azerty",
            "000000", "root", "access", "secret", "thunder",
            "default", "chocolate", "soccer", "asdfgh", "jordan23"
        };
        for (String c : comunes) {
            if (clave.equalsIgnoreCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static String aplicarClave(String mensaje, String clave) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            char k = clave.charAt(i % clave.length());
            resultado.append((char)(c + k % 10));
        }
        return resultado.toString();
    }

    public static String quitarClave(String mensaje, String clave) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            char k = clave.charAt(i % clave.length());
            resultado.append((char)(c - k % 10));
        }
        return resultado.toString();
    }
}
