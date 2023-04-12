# Juego de la Brisca

Te presento el juego de cartas de la Brisca, un proyecto personal para el curso de **1º de Desarrollo de Aplicaciones Multiplataforma**, realizado en **Java** y **JSP** y que se puede ejecutar desde un contenedor **Docker**.

# Requisitos
Para ejecutar este proyecto, necesitas **Docker** instalado en tu sistema.

# Configuración
Para configurar el proyecto, descarga la última versión del proyecto desde el repositorio:

```
docker pull jumangum/brisca
```

# Ejecución
Una vez descargado, construye la imagen de Docker con el siguiente comando en la terminal:

```
docker build -t jumangum/brisca .
```

Una vez construida la imagen, ejecuta el contenedor con el siguiente comando:

```
docker run -it -p 8081:8080 jumangum/brisca
```

Ahora, abre tu navegador web y escribe la dirección URL: http://localhost:8081/brisca.

¡Disfruta jugando a la Brisca!
***
Más información: https://github.com/Juanma-Gutierrez
