# 1.4-Llistar-Directori-Nivell1

## 📄 Descripción - Enunciado del ejercicio

Este proyecto consiste en el desarrollo de una clase en Java que lista recursivamente el contenido de un directorio recibido como parámetro, mostrando un árbol de directorios con todos sus niveles, guardando el resultado en un archivo TXT y permitiendo leer el contenido de cualquier archivo TXT para mostrarlo por consola. El programa:

1,Recibe una ruta de directorio como parámetro (por argumentos de línea de comandos o una ruta predeterminada).

2,Verifica si la ruta existe y es un directorio válido.

3,Lista alfabéticamente los nombres de los archivos y subdirectorios en cada nivel, indicando:

Si es un directorio (D) o un archivo (F).

La fecha de última modificación.

4,Guarda el resultado en un archivo TXT especificado (output/output.txt por defecto).

5,Lee el contenido de un archivo TXT especificado (por argumentos o el archivo generado por defecto) y lo muestra por consola.

6,Maneja casos de error, como rutas inexistentes, rutas que no son directorios, directorios vacíos, problemas de permisos de escritura o lectura, y archivos no válidos.

## 💻 Tecnologías Utilizadas
Java 17

IntelliJ IDEA (opcional, como entorno de desarrollo)

## 📋 Requisitos

Java JDK 17 o superior instalado.

Un IDE o editor de texto compatible con Java (IntelliJ IDEA, Eclipse, VS Code, etc.).

Permisos de escritura en el directorio donde se generará el archivo de salida (output/output.txt).

Permisos de lectura para el archivo TXT que se desea leer.

## 🛠️ Instalación

Clona este repositorio:
```
git clone https://github.com/jrffruit518-enrich/javaSpring1_5.git
```


Accede al directorio del proyecto:
```
cd 1.4-Llistar-Directori-Nivell1
```

Asegúrate de tener el JDK configurado correctamente.

## ▶️ Ejecución

Compila los archivos Java:
```
javac spring1Tasca_S105Nivell1_4/*.java
```


Ejecuta el programa principal, especificando una ruta de directorio como primer argumento (o usa la ruta predeterminada src/main/resources si no se proporciona) y, opcionalmente, un archivo TXT como segundo argumento (o usa output/output.txt por defecto). El programa generará el archivo TXT con el listado del directorio y mostrará el contenido del archivo TXT especificado por consola:

java spring1Tasca_S105Nivell1_4.DirListMain4 <ruta-del-directorio> <ruta-del-archivo-txt>

Ejemplo:
```
java spring1Tasca_S105Nivell1_4.DirListMain4 src/main/resources output/output.txt
```

Verifica el archivo de salida generado en output/output.txt y revisa la salida en consola para el contenido del archivo TXT.

## 🌐 Desplegament

No aplica para este ejercicio, ya que es un programa local para consola que genera y lee un archivo TXT.

Opcionalmente, se puede empaquetar como un archivo .jar ejecutable:
```
jar cfe LlistarDirectori.jar spring1Tasca_S105Nivell1_4.DirListMain4 -C out .
```
🤝 Contribucions

¡Las contribuciones son bienvenidas! Por favor, sigue los siguientes pasos para contribuir:


Haz un fork del repositorio.

Crea una nueva rama:
```
git checkout -b feature/NuevaFuncionalidad
```


Realiza tus cambios y haz commit:
```
git commit -m "Añade nueva funcionalidad"
```


Sube los cambios a tu rama:
```
git push origin feature/NuevaFuncionalidad
```


Abre un pull request para revisión.#