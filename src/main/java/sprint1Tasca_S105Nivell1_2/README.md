# 1.2-Llistar-Directori-Nivell1

## 📄 Descripción - Enunciado del ejercicio

Este proyecto consiste en el desarrollo de una clase en Java que lista recursivamente el contenido de un directorio recibido como parámetro, mostrando un árbol de directorios con todos sus niveles. El programa:

1,Recibe una ruta de directorio como parámetro (por argumentos de línea de comandos o una ruta predeterminada).

2,Verifica si la ruta existe y es un directorio válido.

3,Lista alfabéticamente los nombres de los archivos y subdirectorios en cada nivel, indicando:

Si es un directorio (D) o un archivo (F). 

La fecha de última modificación.

4,Maneja casos de error, como rutas inexistentes, rutas que no son directorios o directorios vacíos.

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
cd 1.2-Llistar-Directori-Nivell1
```
Asegúrate de tener el JDK configurado correctamente.

## ▶️ Ejecución
Compila los archivos Java:
```
javac spring1Tasca_S105Nivell1_2/*.java
```
Ejecuta el programa principal, especificando una ruta de directorio como argumento (o usa la ruta predeterminada src/main/resources si no se proporciona ningún argumento):
```
java spring1Tasca_S105Nivell1_2.DirListMain2 <ruta-del-directorio>
```
Ejemplo:
```
java spring1Tasca_S105Nivell1_2.DirListMain2 src/main/resources
```
## 🌐 Desplegament
No aplica para este ejercicio, ya que es un programa local para consola.

Opcionalmente, se puede empaquetar como un archivo .jar ejecutable:
```
jar cfe LlistarDirectori.jar spring1Tasca_S105Nivell1_2.DirListMain2 -C out .
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