package modelos;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {

	private int numPlayers; // Número de jugadores
	private ArrayList<Deck> playersDecks; // Mazos de los 4 jugadores
	private ArrayList<Deck> savedDecks; // Mazos de ganancias de los 4 jugadores
	private Deck mainDeck; // Mazo principal
	private Deck triumph; // Carta del triunfo
	private String triumphSuit; // Palo del triunfo
	private int triumphSuitNumber; // Número del palo del triunfo
	private Deck handDeck; // Mazo con la mano en juego
	private int cardInPlay; // Carta en juego
	private int handPlayer; // Jugador que es mano
	private int playerInGame; // Jugador inicial
	private boolean showCards; // booleano para mostrar cartas o no
	private boolean endGame = false; // Controla el final de la partida

	private int[] points;

	public Game(int numPlayers) {
		this.numPlayers = numPlayers;
		this.points = new int[numPlayers];
		this.showCards = false;
		initPoints();
		this.init();
	}

	public void initPoints() {
		for (int i = 0; i < points.length; i++) {
			points[i] = 0;
		}
	}

	public void init() {
		// Construcción de los mazos
		this.playersDecks = new ArrayList<>();
		this.savedDecks = new ArrayList<>();
		this.mainDeck = new Deck(true, false); // true false
		this.triumph = new Deck(false, false); // false false
		this.handDeck = new Deck(false, false); // false false

		// Mazos de los jugadores
		for (int i = 0; i < this.numPlayers; i++) {
			this.playersDecks.add(new Deck(true, false)); // tf Añadimos un nuevo mazo completo
			this.savedDecks.add(new Deck(true, false)); // tf Añadimos un nuevo mazo de cartas guardadas al completo
			this.playersDecks.get(i).emptyDeck(); // Vaciamos el mazo
			this.savedDecks.get(i).emptyDeck(); // Vaciamos el mazo de cartas guardadas
			for (int j = 0; j < 3; j++) { // Cogemos 3 cartas del mazo principal
				this.playersDecks.get(i).addCard(this.mainDeck.removeCard());
			}

			// Iniciamos el mazo del jugador
			this.playersDecks.get(0).setReverse(false);
			// Selección aleatoria del jugador que comienza la partida
			this.playerInGame = (int) (Math.random() * numPlayers);
			// Si inicia el jugador 0 lo ponemos clickable, si no, no clickable
			if (this.playerInGame != 0)
				this.playersDecks.get(0).setClickable(false);
			else
				this.playersDecks.get(0).setClickable(true);
			this.handPlayer = playerInGame;
		}
		// Mazo del triunfo
		this.triumph.emptyDeck(); // Vaciamos todas las cartas
		this.triumph.addCard(this.mainDeck.removeCard());
		this.triumphSuit = this.triumph.getCard(0).getSuit();
		this.triumphSuitNumber = this.triumph.getCard(0).getSuitNumber();

		// Mazo de la mano jugada
		this.handDeck.emptyDeck(); // Vaciamos todas las cartas

	}

	public void setCardInPlay(int cardInPlay) {
		this.cardInPlay = cardInPlay;
	}

	public void playCard() { // Jugar la carta en cada turno
		if (handPlayer < numPlayers) {
			// Mueve la carta del jugador handPlayer a handDeck
			if (handDeck.getLenght() < numPlayers) { // Saca una carta de uno de los jugadores
				this.handDeck.addCard(this.playersDecks.get(handPlayer).removeCardNumber(cardInPlay));
				advanceTurn();
			}
			if (handDeck.getLenght() == numPlayers) { // Muestra las cartas del embite
				this.showCards = true;
				handPlayer = -1;
			} else {
				this.showCards = false;
			}
		}
	}

	public void advanceTurn() { // Avanzar el turno durante la mano
		if (!this.showCards) // Avance del turno
		{
			handPlayer++;
		}
		if (handPlayer > (numPlayers - 1)) { // Reinicia el contador de jugador a 0
			handPlayer = 0;
		}
		checkClickable();
	}

	private void checkClickable() {
		if (handPlayer == 0 && handDeck.getLenght() != numPlayers) {
			this.playersDecks.get(0).setClickable(true);
		} else {
			this.playersDecks.get(0).setClickable(false);
		}
	}

	private void checkCards() { // Comprobar el ganador de la ronda
		// Chequeamos cuál el el jugador ganador
		int winner = this.handDeck.checkWinner(this.triumphSuit, this.handDeck.getCard(0).getSuit(), this.playerInGame,
				this.numPlayers);
		int numCards = handDeck.getLenght();
		for (int i = 0; i < numCards; i++) {
			savedDecks.get(winner).addCard(handDeck.removeCard()); // paso al jugador 0
		}
		playerInGame = winner + numPlayers;
		handPlayer = (playerInGame % numPlayers);
		checkClickable();
	}

	private void dealCards() { // Repartir nuevas cartas
		for (int i = 0; i < numPlayers; i++) {
			if (this.mainDeck.getLenght() > 0) { // Si aún quedan cartas en el mazo
				this.playersDecks.get(i).addCard(this.mainDeck.removeCard());
			} else if (this.triumph.getLenght() > 0) { // Si no quedan cartas en el mazo pero sí la de triunfo
				this.playersDecks.get(i).addCard(this.triumph.removeCard());
			}
		}
	}

	// ************************ Bloque de impresión ********************
	public String toString() {
		String res = "";
		res += printTriumph(); // Imprimir carta del triunfo
		res += printMainDeck();// Imprimir mazo principal
		res = printPlayersDecks(res); // Imprimir las cartas de los jugadores
		res += printHandDeck();// Imprimir cartas jugadas en este embite (handDeck)
		res += printTriumphSuitInfo(); // Imprime el palo del triunfo
		res = printButtons(res);// Imprimir botones
		res = checkAllCardsDealed(res); // Comprobar si ya se han recogido todas las cartas
		res += printExitButton(); // Botón de salir
		if (!endGame) {
			res += printPlayersNames(); // Imprime nombres de jugadores
		}
		return res;
	}

	public String printTriumph() {
		return String.format(
				"<div id='triumph' class='myContainer centered'><div class=' myContainer triumph centered'>%s</div></div>",
				triumph.showCards());
	}

	public String printMainDeck() {
		return String.format(
				"<div id='mainDeck' class='myContainer mainDeck piledDeck'>%s</div>",
				mainDeck.showCards());
	}

	public String printPlayersDecks(String res) {
		for (int i = 0; i < this.numPlayers; i++) {
			String winnedCards = String.format(
					"<div id='savedDeck" + (i + 1) + "' class='myContainer savedDeck piledDeck'>%s</div>",
					savedDecks.get(i).showCards());
			int pos = (numPlayers == 2 && i == 1) ? i + 1 : i; // Recolocación para modo 2 jugadores
			String dealer = this.handPlayer == i ? "<img class='dealer' src='assets/img/ficha.png' >" : "";
			res += String.format("<div class='deck player%d'>%s%s%s</div>", pos, dealer,
					playersDecks.get(i).showCards(), winnedCards);
		}
		return res;
	}

	public String printHandDeck() {
		String res = "";
		if (this.showCards) {
			int winner = this.handDeck.checkWinner(this.triumphSuit, this.handDeck.getCard(0).getSuit(),
					this.playerInGame,
					this.numPlayers);
			res += "<div class='winner'>Gana la ronda el jugador " + (winner + 1) + "</div>";
		}
		res += String.format(
				"<div id='handDeck' class='deck myContainer handDeck'>%s</div>",
				handDeck.showCards());
		return res;
	}

	public String printButtons(String res) {
		res += "<div id='buttonsLine' class='inGameButtons'>";
		// Si queda alguna carta suelta porque son impares
		int withoutCards = 0;
		for (int i = 0; i < numPlayers; i++) {
			if (this.playersDecks.get(i).getLenght() != 0) {
				withoutCards++;
			}
		}
		if (withoutCards != numPlayers && showCards) {
			for (int i = 0; i < numPlayers; i++) {
				if (this.playersDecks.get(i).getLenght() != 0) { // Si aún tiene cartas el jugador
					this.savedDecks.get(i).addCard(this.playersDecks.get(i).removeCard());
				}
			}
		}
		// Si se están mostrando todas las cartas del embite
		if (this.showCards) {
			res += String.format("<a href='partida.jsp?inPlay=1&card=99&players=" + numPlayers
					+ "'><button class='button playButton'>Recoger cartas</button></a>");
			checkCards(); // Comprueba el ganador del embite
			dealCards(); // Repartimos nuevas cartas
			this.showCards = false;
		} else {
			// El botón de jugar carta se muestra si no juega el jugador 0
			if (handPlayer != 0) {
				res += String.format("<a href='partida.jsp?inPlay=1&card=0&players=" + numPlayers
						+ "'><button class='button playButton'>Jugar carta</button></a>");
			}
		}
		return res;
	}

	private String checkAllCardsDealed(String res) {
		boolean endGame = false;
		for (int i = 0; i < numPlayers; i++) {
			if (this.playersDecks.get(i).getLenght() == 0 && handDeck.getLenght() == 0) {
				endGame = true;
			}
		}
		if (endGame) { // Si ya se han ganado todas las cartas, muestro botón de mostrar ganador
			res = printEndOfGame();
		}
		return res;
	}

	private String printTriumphSuitInfo() {
		String res = "<img src='assets/img/" + triumphSuitNumber + ".png' class='triumphInfo'>";
		return res;
	}

	public String printExitButton() {
		return String.format(
				"<a href='index.jsp'><button class='button backButton'><i class='fa fa-home' aria-hidden='true'></i></button></a></div>");
	}

	public String printPlayersNames() {
		String res = "";
		switch (numPlayers) {
			case 2:
				res += "<div class='player0Name'>Jugador 1</div>";
				res += "<div class='player2Name'>Jugador 2</div>";
				break;
			case 3:
			case 4:
				for (int i = 0; i < numPlayers; i++) {
					res += "<div class='player" + i + "Name'>Jugador " + (i + 1) + "</div>";
				}
				break;
		}
		return res;
	}

	public String printEndOfGame() {
		// Ponemos los mazos ganados boca arriba
		for (int i = 0; i < numPlayers; i++) {
			this.savedDecks.get(i).setReverse(false);
		}
		String res = "";
		res += "<div class='centered winners vertical'>";
		int maxPoints = 0;
		int winner = -1;
		for (int i = 0; i < numPlayers; i++) {
			int points = savedDecks.get(i).getPoints();
			res += "<div class='playerPoints'>";
			res += "<div class='vertical'><p class='playerName'>Jugador " + (i + 1) + "</p>";
			res += "<p class='points'>" + points + "</p></div>";
			res += String.format(savedDecks.get(i).showCards());
			res += "</div>";
			if (points > maxPoints) {
				maxPoints = points;
				winner = i;
			}
		}
		res += "<div class='finalWinner'>El ganador es el jugador " + (winner + 1) + "</div>";
		res += "</div>";

		// Bloque para generar el confetti
		res += "<div class='confetti-container'>";
		res += "<div class='confetti'>";
		String color[] = { "yellow", "white", "green", "blue", "red", "pink" };
		for (int i = 0; i < 100; i++) {
			String _color = color[(int) (Math.random() * color.length)];
			int _vel = ((int) (Math.random() * 40) + 10);
			int _size = ((int) (Math.random() * 25) + 10);
			res += "<div style='--speed: " + _vel +
					"; --bg: " + _color +
					"; width: " + _size + "px" +
					"; height: " + _size + "px" +
					"' class='circle'></div>";
		}
		res += "</div></div>";

		// Marcamos fin de la partida
		this.endGame = true;
		return res;
	}

	public void printHelpers() { // Impresión de ayudas por consola
		// Salida por consola para control
		System.out.println("______________________________");
		System.out.printf("HandPlayer: %d\n", handPlayer);
		System.out.printf("cardInPlay: %d ** handDeck.length: %d\n", cardInPlay, handDeck.getLenght());
		System.out.printf("showCards: %b \n", showCards);
	}
}
