# 1.1-Llistar-Directori-Nivell1

## 📄 Descripción - Enunciado del ejercicio

Este proyecto consiste en el desarrollo de una clase en Java que lista alfabéticamente el contenido de un directorio recibido como parámetro. El programa:

1,Recibe una ruta de directorio como parámetro (por argumentos de línea de comandos o una ruta predeterminada).

2,Verifica si la ruta existe y es un directorio válido.

Lista alfabéticamente los nombres de los archivos y subdirectorios en el directorio especificado.

3,Maneja casos de error, como rutas inexistentes, rutas que no son directorios o directorios vacíos.

## 💻 Tecnologías Utilizadas
Java 17

IntelliJ IDEA (opcional, como entorno de desarrollo)

## 📋 Requisitos
Java JDK 17 o superior instalado.

Un IDE o editor de texto compatible con Java (IntelliJ IDEA, Eclipse, VS Code, etc.).

## 🛠️ Instalación
Clona este repositorio:
```
git clone https://github.com/jrffruit518-enrich/javaSpring1_5.git
```
Accede al directorio del proyecto:
```
cd 1.1-Llistar-Directori-Nivell1
```
Asegúrate de tener el JDK configurado correctamente.

## ▶️ Ejecución
Compila los archivos Java:
```
javac spring1Tasca_S105Nivell1_1/*.java
```
Ejecuta el programa principal, especificando una ruta de directorio como argumento (o usa la ruta predeterminada src/main/resources si no se proporciona ningún argumento):
```
java spring1Tasca_S105Nivell1_1.DirListMain1 <ruta-del-directorio>
```
Ejemplo:
```
java spring1Tasca_S105Nivell1_1.DirListMain1 src/main/resources
```
## 🌐 Desplegament
No aplica para este ejercicio, ya que es un programa local para consola.

Opcionalmente, se puede empaquetar como un archivo .jar ejecutable:
```
jar cfe LlistarDirectori.jar spring1Tasca_S105Nivell1_1.DirListMain1 -C out .
```
## 🤝 Contribucions
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
Abre un pull request para revisión.