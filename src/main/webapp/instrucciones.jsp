<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="assets/css/style.css" />
        <title>Brisca</title>
    </head>
    <body>
        <div class="wrapper">
            <h2 class="subrayada" id="objective">Objetivo del juego</h2>
            <p>
                La <strong>brisca</strong> es un juego de cartas jugado en
                España e Italia. Se disputa a un número determinado de rondas
                señalado previamente y gana la partida el primero que consigue
                ganar ese número de rondas (por defecto la partida es a una
                ronda).
            </p>

            <h3 id="cards">Valor de las cartas (de mayor a menor)</h3>
            <p>El valor de las cartas es igual que en el tute:</p>
            <ul>
                <li>As: 11 puntos</li>
                <li>Tres: 10 puntos</li>
                <li>Rey: 4 puntos</li>
                <li>Caballo: 3 puntos</li>
                <li>Sota: 2 puntos</li>
                <li>Siete, Seis, Cinco, Cuatro, Dos: 0 puntos</li>
            </ul>
            <p>
                Las cartas que no tienen valor alguno en puntos se les denomina
                <em>cartas blancas</em>.
            </p>

            <h2 class="subrayada" id="play">Cómo jugar a la brisca</h2>
            <h3 id="start">Reparto de cartas</h3>
            <p>
                Al principio de la partida se decide por sorteo automático el
                jugador que es mano, es decir, el que empieza a jugar. En la
                siguiente ronda (si la hay) empezaría el jugador situado a la
                derecha del actual.
            </p>
            <p>
                Se reparten 3 cartas por jugador. Tras repartir, la siguiente
                carta es la que marcará el <strong>triunfo</strong> o la que
                <strong>pinta</strong>. El resto se dejará en un montón boca
                abajo para robar.
            </p>

            <h3 id="flow">Desarrollo del juego</h3>
            <p>
                Empieza el jugador que va de mano jugando cualquiera de sus
                cartas. Los demás deben tirar una de las suyas en base a la
                primera. Al grupo de cartas que se juegan en una mano se le
                llama
                <strong>baza.</strong>
            </p>
            <p>
                El siguiente jugador al que le toca puede tirar cualquiera de
                sus cartas.
            </p>

            <h3 id="end1">Finaliza una baza</h3>
            <p>
                Gana la baza el jugador que haya colocado al triunfo de valor
                más alto o si no hay triunfos la carta del palo de inicio (la
                primera que se ha tirado) de valor más alto.
            </p>
            <p>
                Este jugador recoge la baza, es decir, las cartas que han tirado
                el resto de jugadores en esa mano, y las guarda hasta el final
                de la ronda. Al finalizar la baza todos los jugadores roban del
                montón mientras queden cartas.
            </p>
            <p>
                El jugador que gana la baza empieza tirando en la siguiente
                mano.
            </p>

            <h3 id="end2">Finaliza una ronda</h3>
            <p>
                Una ronda finaliza cuando no les quedan cartas a los jugadores.
                Se hará el recuento de puntos con las cartas que ha conseguido
                cada jugador. En caso de empate gana el que haya ganado la
                última baza.
            </p>
            <p>
                El primero que gane el total de rondas,
                <strong>gana la partida</strong>.
            </p>

            <div class="container centered">
                <a href="index.jsp"><button class="button">Volver</button></a>
            </div>
        </div>
    </body>
</html>
