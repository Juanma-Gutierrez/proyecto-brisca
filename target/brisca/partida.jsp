<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelos.*"%>


<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="assets/css/style.css" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Brisca</title>
    </head>
    <body>
        <div class="myContainer centered vertical fullY board">
            <%
            int players = Integer.parseInt(request.getParameter("players"));
            int inPlay = Integer.parseInt(request.getParameter("inPlay"));
                        if (inPlay == 0){
                                inPlay = 1;
                                Game game = new Game(players); // Nueva partida con players jugadores
                                session.setAttribute("game", game);
                                out.print(game);
            }
            else { // Continuar la partida
                                Game game = (Game) session.getAttribute("game");
                int card = Integer.parseInt(request.getParameter("card"));
                                if (card != 99){
                        game.setCardInPlay(card);
                                        game.playCard();
                                }
                                out.print(game);
                        }
            %>
        </div>
    </body>
</html>