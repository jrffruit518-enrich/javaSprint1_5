markdown# 1.5-Llistar-Directori-Nivell1-Exercici5

## 📄 Descripción - Enunciado del ejercicio

Este proyecto implementa una aplicación Java que serializa un objeto `Person` a un archivo `.ser` y lo deserializa, mostrando su contenido por consola. El programa:

1. Crea un objeto `Person` con atributos como nombre y edad.
2. Serializa el objeto a un archivo `.ser` especificado (por argumentos de línea de comandos o predeterminado: `output/person.ser`).
3. Deserializa el archivo `.ser` y muestra el contenido del objeto por consola.
4. Maneja errores como archivos inexistentes, problemas de permisos de escritura/lectura, y errores de serialización/deserialización.
5. Usa rutas relativas con `File.separator` para garantizar compatibilidad multiplataforma.

## 💻 Tecnologías Utilizadas
- Java 17
- IntelliJ IDEA (opcional, como entorno de desarrollo)
- Maven (opcional, para estructura de proyecto)

## 📋 Requisitos
- Java JDK 17 o superior instalado.
- Un IDE o editor de texto compatible con Java (IntelliJ IDEA, Eclipse, VS Code, etc.).
- Permisos de escritura en el directorio `output/` para generar el archivo `person.ser`.
- Permisos de lectura para el archivo `.ser`.

## 🛠️ Instalación
1. Clona este repositorio:
```
   git clone https://github.com/jrffruit518-enrich/javaSpring1_5.git
```
2. Accede al directorio del proyecto:
```
   cd 1.5-Llistar-Directori-Nivell1
   ```
3. Asegúrate de tener el JDK configurado correctamente.

## ▶️ Ejecución
### Compilación
Para un proyecto Maven:
```
mvn clean compile
```
Para un proyecto Java estándar:
```
javac -d target src/main/java/sprint1Tasca_S105Nivell1_5/*.java
```
### Ejecución
Ejecuta el programa principal, especificando la ruta del archivo `.ser` como argumento (predeterminada: `output/person.ser`). El programa serializa un objeto `Person` al archivo especificado y lo deserializa, mostrando el resultado por consola.

Comando:
```
java -cp target sprint1Tasca_S105Nivell1_5.PersonMain <ruta-del-archivo-ser>
```
Ejemplo:
```
java -cp target sprint1Tasca_S105Nivell1_5.PersonMain output/person.ser
```
Verifica el archivo generado en `output/person.ser` y la salida en consola para el objeto deserializado.

## 🌐 Desplegament
No aplica, ya que es un programa de consola que genera y lee archivos `.ser` localmente.

Opcionalmente, empaqueta como `.jar`:
jar cfe LlistarDirectoriEx5.jar sprint1Tasca_S105Nivell1_5.PersonMain -C target .
text## 🤝 Contribucions
¡Las contribuciones son bienvenidas! Sigue estos pasos:
1. Haz un fork del repositorio.
2. Crea una nueva rama:
```
   git checkout -b feature/NuevaFuncionalidad
```
3. Realiza tus cambios y haz commit:
```
   git commit -m "Añade nueva funcionalidad"
```
4. Sube los cambios a tu rama:
```
   git push origin feature/NuevaFuncionalidad
 ```
5. Abre un pull request para revisión.

## 📝 Notas
- Usa `File.separator` para rutas relativas, garantizando compatibilidad en Windows y otros sistemas.
- Los mensajes de error son user-friendly. Para depuración detallada, ejecuta en un IDE.
- El programa sigue las mejores prácticas de Sprint 0, incluyendo manejo de errores y uso de `@Serial` para `serialVersionUID`.