<%@page contentType="text/html" pageEncoding="UTF-8"%> <%@page
import="modelos.*"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="assets/css/style.css" />
        <title>Brisca</title>
    </head>
    <body>
        <div class="container centered fullX fullY vertical">
            <h1>JUEGO DE LA BRISCA</h1>
            <form action="partida.jsp" method="POST">
                <input type="submit" value="JUGAR" class="button"/>
            </form>
            <a href="instrucciones.jsp"><button class="button">Instrucciones</button></a>
        </div>
    </body>
</html>
