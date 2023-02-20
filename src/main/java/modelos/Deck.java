package modelos;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck;

	public Deck() {
		this.deck = new ArrayList<>();
	}

	public Card addCard(Card card) {
		this.deck.add(card);
		return card;
	}

	public void createDeck() {
		this.deck.add(new Card(0, "As", "Oros", 11, "../../webapp/assets/img/deck/1-oros.png"));
		this.deck.add(new Card(1, "Dos", "Oros", 0, "../../webapp/assets/img/deck/2-oros.png"));
		this.deck.add(new Card(2, "Tres", "Oros", 10, "../../webapp/assets/img/deck/3-oros.png"));
		this.deck.add(new Card(3, "Cuatro", "Oros", 0, ""));
		this.deck.add(new Card(4, "Cinco", "Oros", 0, ""));
		this.deck.add(new Card(5, "Seis", "Oros", 0, ""));
		this.deck.add(new Card(6, "Siete", "Oros", 0, ""));
		this.deck.add(new Card(7, "Sota", "Oros", 2, ""));
		this.deck.add(new Card(8, "Caballo", "Oros", 3, ""));
		this.deck.add(new Card(9, "Rey", "Oros", 4, ""));
	}

	public String toString() {
		String res = "";
		for (Card c : deck) {
			res += c.getName() + " de " + c.getSuit() + c.toString() + "<br>";
		}
		return res;
	}
}
