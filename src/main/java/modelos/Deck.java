package modelos;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck;
	private String path = "";

	public Deck() {
		this.deck = new ArrayList<>();
		this.path = "assets/img/deck/";
	}

	public Card addCard(Card card) {
		this.deck.add(card);
		return card;
	}

	public void createDeck() {
		this.deck.add(new Card(0, "As", "Oros", 11, this.path + "1-oros.png"));
		this.deck.add(new Card(1, "Dos", "Oros", 0, this.path + "2-oros.png"));
		this.deck.add(new Card(2, "Tres", "Oros", 10, this.path + "3-oros.png"));
		this.deck.add(new Card(3, "Cuatro", "Oros", 0, this.path + ""));
		this.deck.add(new Card(4, "Cinco", "Oros", 0, this.path + ""));
		this.deck.add(new Card(5, "Seis", "Oros", 0, this.path + ""));
		this.deck.add(new Card(6, "Siete", "Oros", 0, this.path + ""));
		this.deck.add(new Card(7, "Sota", "Oros", 2, this.path + ""));
		this.deck.add(new Card(8, "Caballo", "Oros", 3, this.path + ""));
		this.deck.add(new Card(9, "Rey", "Oros", 4, this.path + ""));
		this.deck.add(new Card(0, "As", "Copas", 11, this.path + "1-Copas.png"));
		this.deck.add(new Card(1, "Dos", "Copas", 0, this.path + "2-Copas.png"));
		this.deck.add(new Card(2, "Tres", "Copas", 10, this.path + "3-Copas.png"));
		this.deck.add(new Card(3, "Cuatro", "Copas", 0, this.path + ""));
		this.deck.add(new Card(4, "Cinco", "Copas", 0, this.path + ""));
		this.deck.add(new Card(5, "Seis", "Copas", 0, this.path + ""));
		this.deck.add(new Card(6, "Siete", "Copas", 0, this.path + ""));
		this.deck.add(new Card(7, "Sota", "Copas", 2, this.path + this.path + ""));
		this.deck.add(new Card(8, "Caballo", "Copas", 3, this.path + ""));
		this.deck.add(new Card(9, "Rey", "Copas", 4, this.path + ""));
		this.deck.add(new Card(0, "As", "Espadas", 11, this.path + "1-Espadas.png"));
		this.deck.add(new Card(1, "Dos", "Espadas", 0, this.path + "2-Espadas.png"));
		this.deck.add(new Card(2, "Tres", "Espadas", 10, this.path + "3-Espadas.png"));
		this.deck.add(new Card(3, "Cuatro", "Espadas", 0, this.path + ""));
		this.deck.add(new Card(4, "Cinco", "Espadas", 0, this.path + ""));
		this.deck.add(new Card(5, "Seis", "Espadas", 0, this.path + ""));
		this.deck.add(new Card(6, "Siete", "Espadas", 0, this.path + ""));
		this.deck.add(new Card(7, "Sota", "Espadas", 2, this.path + ""));
		this.deck.add(new Card(8, "Caballo", "Espadas", 3, this.path + ""));
		this.deck.add(new Card(9, "Rey", "Espadas", 4, this.path + ""));
		this.deck.add(new Card(0, "As", "Bastos", 11, this.path + "1-Bastos.png"));
		this.deck.add(new Card(1, "Dos", "Bastos", 0, this.path + "2-Bastos.png"));
		this.deck.add(new Card(2, "Tres", "Bastos", 10, this.path + "3-Bastos.png"));
		this.deck.add(new Card(3, "Cuatro", "Bastos", 0, this.path + ""));
		this.deck.add(new Card(4, "Cinco", "Bastos", 0, this.path + ""));
		this.deck.add(new Card(5, "Seis", "Bastos", 0, this.path + ""));
		this.deck.add(new Card(6, "Siete", "Bastos", 0, this.path + ""));
		this.deck.add(new Card(7, "Sota", "Bastos", 2, this.path + ""));
		this.deck.add(new Card(8, "Caballo", "Bastos", 3, this.path + ""));
		this.deck.add(new Card(9, "Rey", "Bastos", 4, this.path + ""));
	}

	public String toString() {
		String frameworkStart = "<figure class='image is-128x128'>";
		String frameworkEnd = "</figure>";
		String res = "";
		for (Card c : deck) {
			res += frameworkStart;
			res += c.getName() + " de " + c.getSuit() + c.toString();
			res += frameworkEnd;
		}
		return res;
	}
}
