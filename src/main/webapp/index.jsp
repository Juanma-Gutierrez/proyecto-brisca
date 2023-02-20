<%@page contentType="text/html" pageEncoding="UTF-8"%> <%@page
import="modelos.*"%>

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

    <title>Brisca</title>
  </head>
  <body>
    <h1>juego de la brisca</h1>
    <% Deck deck = new Deck(); deck.createDeck(); out.print(deck);%>
  </body>
</html>
