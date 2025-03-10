# BibliotecaTaller - Sistema de Gestión de Biblioteca

![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.8.4-green)
![License](https://img.shields.io/badge/License-MIT-yellow)

Este proyecto es un sistema de gestión de biblioteca desarrollado en Java utilizando JFrame para la interfaz gráfica. Permite a los usuarios realizar préstamos, devoluciones y gestionar libros y usuarios de manera eficiente.

## Características Principales

- **Gestión de Libros**: Añadir, prestar y devolver libros.
- **Gestión de Usuarios**: Crear y gestionar usuarios.
- **Interfaz Gráfica**: Interfaz intuitiva y fácil de usar.
- **Persistencia de Datos**: Almacenamiento de datos en memoria.

## Requisitos Previos

- **Java 17**: Asegúrate de tener Java 17 instalado en tu sistema.
- **Maven**: Necesitarás Maven para gestionar las dependencias y construir el proyecto.

## Configuración del Proyecto

1. **Clonar el Repositorio**:
   ```bash
   git clone https://github.com/JuanJoseBastoGonzalez/Menu-BIioteca-Jframe.git
   cd Menu-BIioteca-Jframe

1. **Compilar el Proyecto**:

   bash

   Copy

   ```bash
   mvn clean install
   ```

2. **Ejecutar la Aplicación**:

   bash

   Copy

   ```bash
   mvn exec:java -Dexec.mainClass="com.mycompany.bibliotecataller.BibliotecaTaller"
   ```

## Estructura del Proyecto

- `src/main/java/com/mycompany/bibliotecataller`: Contiene el código fuente de la aplicación.
  - `BibliotecaTaller.java`: Clase principal que inicia la aplicación.
  - `Recurso.java`: Clase abstracta que representa un recurso de la biblioteca.
  - `Libro.java`: Clase que extiende `Recurso` para representar un libro.
  - `Usuario.java`: Clase que representa a un usuario de la biblioteca.
  - `MenuJframe.java`: Interfaz gráfica principal.
  - `Op1Menu.java`, `Op2Menu.java`, `Op3Menu.java`, `Op4Menu.java`: Interfaces gráficas para las diferentes operaciones.
- `pom.xml`: Archivo de configuración de Maven.

## Contribuciones

¡Las contribuciones son bienvenidas! Si deseas contribuir al proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añade nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](https://LICENSE) para más detalles.

## Contacto

- **Juan José Basto González**
- LinkedIn: [Juan José Basto González](https://www.linkedin.com/in/juan-jose-basto-gonzalez-49945023a/)
- GitHub: [JuanJoseBastoGonzalez](https://github.com/JuanJoseBastoGonzalez)