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
    <div class="myContainer centered fullX fullY vertical board">
      <h1 class="title is-1 has-text-white">JUEGO DE LA BRISCA</h1>
      <form
        action="partida.jsp?&inPlay=0"
        method="POST"
        class="myContainer centered vertical"
      >
        <select name="players">
          <option value="2">2 Jugadores</option>
          <option value="3">3 Jugadores</option>
          <option value="4">4 Jugadores</option>
        </select>
        <input type="submit" value="JUGAR" class="button" />
      </form>
      <a href="instrucciones.jsp">
        <button class="button">Instrucciones</button>
      </a>
    </div>
    <%
		if (!session.isNew()){
			session.removeAttribute("game");
			session.removeAttribute("inPlay");
		} %>
  </body>
</html>
