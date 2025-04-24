
# 🔐 Criptografía en Java - Encriptador con Interfaz Gráfica

Este proyecto realiza un **cifrado personalizado**, utilizando técnicas como **transposición de texto**. Desarrollado con **Java Swing (JFrame)**, permite encriptar y desencriptar mensajes de forma visual e interactiva.

---

## 🛠️ Tecnologías utilizadas

- Java SE 8+
- Swing (JFrame)
- NetBeans (IDE recomendado)
- Diseño modular (paquetes separados por funcionalidad)
- Iconos y carga de imágenes

---

## 📦 Estructura del proyecto

```
Criptografia/
├── src/
│   ├── criptografia/
│   │   ├── Clave.java              # Lógica para la clave
│   │   ├── Criptografia.java       # Controlador principal de lógica
│   │   ├── Main.java               # Clase principal que lanza el JFrame
│   │   └── Transposicion.java      # Algoritmo de transposición de texto
│   └── imagenes/
│       ├── Logo2.png
│       ├── LogoTH.jpg
│       ├── exit_icon-icons.png
│       └── stop_exit_close.png
```

---

## 🚀 ¿Cómo ejecutar el proyecto?

Primero se debe copiar el repositorio a su equipo
```
git clone https://github.com/huerta13/Criptografia.git
```
Despues tiene 2 opciones para ejecutar:

### ✅ Opción 1: Desde NetBeans

1. Abre NetBeans.
2. Selecciona `Archivo > Abrir Proyecto`.
3. Selecciona la carpeta `Criptografia`.
4. Ejecuta desde `Main.java`.

### ✅ Opción 2: Desde terminal

Navegar hasta la ruta 
```
...\Criptografia\dist
```
y ejecutar el siguiente comando en su terminal:
```bash
java -jar Criptografia.jar
```

> Asegúrate de tener Java instalado y agregado al PATH.

---

## 🔑 Funcionalidades

- ✔️ Encriptar y desencriptar texto
- ✔️ Interfaz amigable
- ✔️ Validación de campos vacíos
- ✔️ Ventanas emergentes con animaciones de carga (mensajes divertidos tipo “Hackeando…”)
- ✔️ Uso de íconos personalizados
- ✔️ Cambio de modo entre Encriptar / Desencriptar con `JToggleButton`

---

## 🧠 Autores

- 🧑‍💻 Jose Antonio Huerta Salguero
- 💬 ¡Contribuciones, ideas y forks son bienvenidos!

---

## 📄 Licencia

Este proyecto se distribuye bajo la licencia MIT.  
Puedes usarlo, modificarlo y compartirlo libremente.

---

## 🌐 Enlaces útiles

- [Java Swing Docs](https://docs.oracle.com/javase/tutorial/uiswing/)
- [NetBeans IDE](https://netbeans.apache.org/)