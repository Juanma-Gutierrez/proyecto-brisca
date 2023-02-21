<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelos.*"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma.min.css"
        />
        <link rel="stylesheet" href="assets/css/style.css" />

        <title>Brisca</title>
    </head>
    <body>
        <h1>PARTIDA</h1>
        <% Deck deck = new Deck();
        out.print(new CardTemplate(deck.extrae()));%>
    </body>
</html>
