# Juego de la Brisca

## Proyecto final de Programación: HTML, CSS, Java y JSP
### Grado Superior en Desarrollo de Aplicaciones Multiplataforma
### 1º de Programación 🧰

Ejercicio final de curso de la asignatura de Programación en Java y JSP.

![image](https://user-images.githubusercontent.com/101201349/231456513-f12d3872-0319-4189-9bd0-7fc2b3775d72.png)

## Índice
1. [Visión general](#visión-general-)
2. [Especificaciones](#especificaciones-)
3. [Comenzando](#comenzando-)
4. [Galería de imágenes](#galería-de-imágenes)
4. [Lenguajes empleados](#lenguajes-empleados)
5. [Construido con](#construido-con-%EF%B8%8F)
6. [Autor](#autor-%EF%B8%8F)

## Visión general 👀

Realizar en Java y JSP un juego de cartas a elección del alumno.

## Especificaciones ⚙
- Realizar un pequeño juego de cartas en JSP.
- La temática corre de tu imaginación, no te compliques mucho en el juego.
- El juego debe tener una pantalla inicial donde se avanzará al juego en sí.
- El juego debe poder reiniciarse.
- Utiliza las cartas que te suministró el profesor en clase.

### Información sobre el juego realizado
- El juego es para un jugador contra el ordenador.
- Puede escoger jugar contra dos, tres o cuatro jugadores.
- Desde el inicio, se muestra en la parte superior izquierda el palo del triunfo de la partida.
- El jugador que comienza la partida es elegido aleatoriamente.
- Tras cada mano, se muestra quién es el jugador que gana dicha mano.
- Al final de la partida se muestran las cartas ganadas por cada jugador, los puntos que han obtenido cada uno de ellos y el ganador de la partida.

## Comenzando 🚀
El juego está listo para poder ser ejecutado, ya que está disponible en docker hub: https://hub.docker.com/repository/docker/jumangum/brisca/general

### Requisitos
Para ejecutar este proyecto, necesitas Docker instalado en tu sistema.

### Configuración
Para configurar el proyecto, descarga la última versión del proyecto desde el repositorio:
```
docker pull jumangum/brisca
```
### Ejecución
Una vez descargado, construye la imagen de Docker con el siguiente comando en la terminal:
```
docker build -t jumangum/brisca
```

Una vez construida la imagen, ejecuta el contenedor con el siguiente comando:
```
docker run -it -p 8081:8080 jumangum/brisca
```
Ahora, abre tu navegador web y escribe la dirección URL: http://localhost:8081/brisca

## Galería de imágenes
![image](https://user-images.githubusercontent.com/101201349/231456744-6256b5a5-2c4e-46d9-bd30-a945b68652eb.png)
![image](https://user-images.githubusercontent.com/101201349/231456576-8f40778b-ca48-44c6-88dc-183e72deffa5.png)
![image](https://user-images.githubusercontent.com/101201349/231456615-30898eaa-b799-4284-97fb-1334e485655b.png)
![image](https://user-images.githubusercontent.com/101201349/231456664-6e9ad37f-f762-442b-abfb-6dd2e8adbd41.png)
![image](https://user-images.githubusercontent.com/101201349/231456707-247eb3c4-1555-41e8-a0db-1442a28ba783.png)


## Lenguajes empleados:

<img src="https://img.shields.io/badge/-HTML5-014267?logo=html5&style=for-the-badge"> <img src="https://img.shields.io/badge/-CSS3-014267?logo=css3&style=for-the-badge"> <img src="https://img.shields.io/badge/-Java-014267?style=for-the-badge"> <img src="https://img.shields.io/badge/-JSP-014267?style=for-the-badge"> 


## Construido con 🛠️

<img src="https://img.shields.io/badge/-Visual Studio Code-0273b4?logo=visualstudiocode&style=for-the-badge">



## Autor ✒️

-   **Juanma Gutiérrez** - [Juanma-Gutierrez](https://github.com/Juanma-Gutierrez)
