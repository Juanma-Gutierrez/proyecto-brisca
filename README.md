# Juego de *La Brisca*

## Proyecto final de Programación: HTML, CSS, Java y JSP
Este repositorio contiene el **proyecto final** de la asignatura de Programación en Java y JSP del **Grado Superior de Desarrollo de Aplicaciones Multiplataforma**.

![demo](https://user-images.githubusercontent.com/101201349/231456615-30898eaa-b799-4284-97fb-1334e485655b.png)


# 👀 Visión general
Realizar en Java y JSP un juego de cartas a elección del alumno.


# ⚙️ Especificaciones
- Realizar un pequeño juego de cartas en JSP.
- La temática corre de tu imaginación, no te compliques mucho en el juego.
- El juego debe tener una pantalla inicial donde se avanzará al juego en sí.
- El juego debe poder reiniciarse.
- Utiliza las cartas que te suministró el profesor en clase ([visibles aquí](https://github.com/Juanma-Gutierrez/proyecto-brisca/tree/main/src/main/webapp/assets/img/deck)).

## Información sobre el juego realizado
- El juego es para un jugador contra el ordenador.
- Puede escoger jugar contra dos, tres o cuatro jugadores.
- Desde el inicio, se muestra en la parte superior izquierda el palo del triunfo de la partida.
- El jugador que comienza la partida es elegido aleatoriamente.
- Tras cada mano, se muestra quién es el jugador que gana dicha mano.
- Al final de la partida se muestran las cartas ganadas por cada jugador, los puntos que han obtenido cada uno de ellos y el ganador de la partida.


# 🚀 Comenzando
El juego está listo para poder ser ejecutado, ya que está **disponible en Docker Hub**: [jumangun/brisca](https://hub.docker.com/r/jumangum/brisca).

## Requisitos
Para ejecutar este proyecto, será necesario tener **Docker instalado** en tu sistema.

## Configuración
Hay 2 formas posibles de usar este proyecto:
1. Descargando la imagen que se encuentra publicada en Docker Hub.
2. Construyendo la imagen localmente usando el *Dockerfile* de este repositorio.

### 01: Docker Hub
Descarga la última versión de la imagen del proyecto:
```
docker pull jumangum/brisca
```

### 02: Dockerfile
Usando el fichero *Dockerfile* proporcionado, ejecuta el siguiente comando:
```
docker build -t jumangum/brisca .
```

> **Note**  
> Ejecuta el comando en la misma ruta del *Dockerfile*.


## Ejecución
Una vez descargada/construida la imagen, levanta un contenedor con el siguiente comando:
```
docker run --rm -p 8081:8080 jumangum/brisca
```

Finalmente, podrás acceder al ejercicio mediante el siguiente enlace: http://localhost:8081/brisca

> **Warning**  
> Recuerda cambiar el mapeo de puertos si pretendes levantar varios contenedores distintos.


# 📷 Galería de imágenes
![menu](https://user-images.githubusercontent.com/101201349/231456513-f12d3872-0319-4189-9bd0-7fc2b3775d72.png)
![partida-1](https://user-images.githubusercontent.com/101201349/236403793-6394205c-ca88-42be-b9fa-2a25038c0047.png)
![partida-2](https://user-images.githubusercontent.com/101201349/231456576-8f40778b-ca48-44c6-88dc-183e72deffa5.png)
![partida-3](https://user-images.githubusercontent.com/101201349/231456664-6e9ad37f-f762-442b-abfb-6dd2e8adbd41.png)
![final](https://user-images.githubusercontent.com/101201349/231456707-247eb3c4-1555-41e8-a0db-1442a28ba783.png)
![instrucciones](https://user-images.githubusercontent.com/101201349/231456744-6256b5a5-2c4e-46d9-bd30-a945b68652eb.png)


# 🛠️ Desarrollo

## Lenguajes empleados
![HTML 5](https://img.shields.io/badge/-HTML5-014267?logo=html5&style=for-the-badge)
![CSS 3](https://img.shields.io/badge/-CSS3-014267?logo=css3&style=for-the-badge)
![Java](https://img.shields.io/badge/-Java-014267?style=for-the-badge)
![JSP](https://img.shields.io/badge/-JSP-014267?style=for-the-badge)

## Herramientas 
![Visual Studio Code](https://img.shields.io/badge/-Visual%20Studio%20Code-0273b4?logo=visualstudiocode&style=for-the-badge)

## Autor
- **Juanma Gutiérrez** - [Juanma-Gutierrez](https://github.com/Juanma-Gutierrez)

