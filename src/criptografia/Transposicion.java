package criptografia;

import java.util.Arrays;

/**
 *
 * @author tonoh
 */
public class Transposicion {

    public static String numeros_vocales(String txt) {
        int longitud = txt.length();
        char[] letras = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            char caracter = txt.charAt(i);
            letras[i] = caracter;
        }
        
        for (int j = 0; j < letras.length; j++){
            if (letras[j] == 'a'){
               letras[j] = '1';
            } else if(letras[j] == 'e'){
                letras[j] = '2';
            } else if(letras[j] == 'i'){
                letras[j] = '3';
            } else if(letras[j] == 'o'){
                letras[j] = '4';
            } else if(letras[j] == 'u'){
                letras[j] = '5';
            } else if (letras[j] == '1'){
               letras[j] = 'a';
            } else if(letras[j] == '2'){
                letras[j] = 'e';
            } else if(letras[j] == '3'){
                letras[j] = 'i';
            } else if(letras[j] == '4'){
                letras[j] = 'o';
            } else if(letras[j] == '5'){
                letras[j] = 'u';
            }
        }
        String resultado = new String(letras);
        return resultado;
    }
    
    public static String transponer(String txt) {
        int longitud = txt.length();
        char[] alrevez = new char[longitud];
        boolean mayusculaInicial = false;
        
        // txt = numeros_vocales(txt); 

        if (!txt.isEmpty() && Character.isUpperCase(txt.charAt(0))) {
            mayusculaInicial = true;
        }

        for (int i = 0; i < longitud; i++) {
            alrevez[i] = txt.charAt(longitud - 1 - i);
        }

        String resultado = new String(alrevez);

        if (mayusculaInicial && resultado.length() > 0) {
            resultado = Character.toUpperCase(resultado.charAt(0)) + resultado.substring(1).toLowerCase();
        }

        return resultado;
    }


    public static void main(String[] args) {
        Transposicion trans = new Transposicion(); // Create an instan
        
        
        String res = trans.transponer("¿Por qúe ser es mejor que poseer?\n" +
"\n" +
"En la vida encontrarán muchas adversidades, problemas, dificultades, trampas, errores, como ustedes le quieran llamar, algunas más difícles que otra"); // Call the method on the instance
        res = trans.numeros_vocales(res);
        System.out.println("transponer_palabra()");
        System.out.println(res);
        
        res = trans.numeros_vocales(res);
        res = trans.transponer(res);
        System.out.println(res);
    }
}
