📱 ApliMov_Calculadora

🔍 Descripción General

ApliMov_Calculadora es una aplicación móvil desarrollada en Android Studio que permite realizar operaciones matemáticas básicas como suma, resta, multiplicación y división de forma rápida y precisa. Este proyecto fue realizado como parte de la asignatura de Aplicaciones Móviles, con el objetivo de aplicar los conocimientos adquiridos sobre desarrollo en Android utilizando el lenguaje Kotlin.

La interfaz de usuario fue diseñada con enfoque en la simplicidad, accesibilidad y experiencia de usuario, considerando los lineamientos de diseño de Material Design.

🧱 Estructura del Proyecto
El proyecto sigue una estructura modular organizada por responsabilidades, facilitando la mantenibilidad y escalabilidad del código:

-MainActivity.kt: Actividad principal que gestiona la lógica de la calculadora.

-activity_main.xml: Diseño de la interfaz de usuario que contiene los botones numéricos y operadores.

-drawable/: Recursos visuales (botones personalizados con los bordes redondeados).

-values/: Archivos de configuración como colores, cadenas (strings.xml) y estilos (styles.xml).

🛠️ Tecnologías y Herramientas Utilizadas
Android Studio Electric Eel (o versión usada)

-Lenguaje: Kotlin

-SDK mínimo: 21 (Lollipop)

-Gradle: Para la gestión del build del proyecto

-Git: Para control de versiones

-GitHub: Para alojar el repositorio remoto

📚 Librerías Utilizadas
Este proyecto se basa principalmente en herramientas y componentes nativos de Android, por lo que no se emplearon librerías externas. Todo el desarrollo fue realizado utilizando las clases estándar del SDK de Android y Kotlin.

🔄 Funcionamiento

-El usuario interactúa con los botones numéricos y operadores.

-Cada pulsación es registrada y concatenada en una cadena visible en la pantalla.

-Al presionar el botón "=" se evalúa la operación y se muestra el resultado.

-El botón "C" borra todos los datos ingresados.


🔍 ScreanShots de la Aplicacion Funcionando:


Pantalla Main de la aplicacion de la calculadora:

![WhatsApp Image 2025-07-16 at 23 30 25](https://github.com/user-attachments/assets/007811bc-1664-4e6b-aedc-00edf5bd639d)

Primero se digita los numeros con su operador:

![WhatsApp Image 2025-07-16 at 23 38 19](https://github.com/user-attachments/assets/176f4784-2d0e-44c1-ba78-89024bf5d4c8)

Posteriormente se da un toque al boton "=" que es el que da la respuesta de la operacion y vemos como se digira abajo de la operacion:

![WhatsApp Image 2025-07-16 at 23 39 28](https://github.com/user-attachments/assets/4dc71935-9b47-489c-aaf1-3101e40b6b70)

Ahora para borrar todo lo anteriormente escrito se da un toque al boton "AC" que borra absolutamente todo ya sean resultados u operaciones:

![WhatsApp Image 2025-07-16 at 23 41 05](https://github.com/user-attachments/assets/e6996d01-32d6-4b9c-8fda-02439b551a12)

Tambien con el boton de la "X" que esta enmarcada podemos eliminar el ultimo operador o numero digitado:

![WhatsApp Image 2025-07-16 at 23 42 27 (1)](https://github.com/user-attachments/assets/008a88d4-106a-4d2a-bc6d-e2d9c85b0c06)

Ahora probamos los operadores 1 a 1, empezando por la raiz cuadrada:

![WhatsApp Image 2025-07-16 at 23 44 01](https://github.com/user-attachments/assets/87e9929f-1152-4f82-abc9-3295bc617fb5)

Ahora el operador de porcentaje "%" para esto la primera manera de sacar % es simplemente poniendolo despues de un numero que te da el decimal del %:

![WhatsApp Image 2025-07-16 at 23 44 18](https://github.com/user-attachments/assets/f81260b6-b88a-4a34-acfc-bf6925508fc2)

La otra manera de operar con % es para saber el porcentaje de un numero digitamos el porcentaje que queremos primero  y luego el numero del cual deseamos el procentaje:

![WhatsApp Image 2025-07-16 at 23 44 06](https://github.com/user-attachments/assets/bb38c620-4b81-4376-9d96-c7bbd81f0351)
En este caso fue 5 porciento de 220 lo que nos da por resultado 11 y es correcto.

Probamos el operador de la suma:

![WhatsApp Image 2025-07-16 at 23 47 55](https://github.com/user-attachments/assets/680c2f72-c964-461f-afc0-3e9afe3d9f5e)

Probemos el operador de la resta:

![WhatsApp Image 2025-07-16 at 23 47 59](https://github.com/user-attachments/assets/546334cb-d1a4-40d3-bba9-ad6295d1bc8d)

Probemos el operador de Division:

![WhatsApp Image 2025-07-16 at 23 48 04](https://github.com/user-attachments/assets/50f7b038-dc53-41cc-b76f-562d4c16f4e2)

Y por ultimo probemos la Potencia:

![WhatsApp Image 2025-07-16 at 23 50 06](https://github.com/user-attachments/assets/a48bd29d-cede-4767-8ca3-44b9b89ecb51)

Y vemos el correcto funcionamiento de la aplicacion de la calculadora 

Por ultimo vemos que aplicamos MVVM estructurando el modelo la vista y la vista modelo:

![WhatsApp Image 2025-07-16 at 23 51 24](https://github.com/user-attachments/assets/071edbc1-a881-42c6-a105-5ebdfaf0558a)

