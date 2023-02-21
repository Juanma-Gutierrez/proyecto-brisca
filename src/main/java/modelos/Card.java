package modelos;

public class Card {/*
					 * private int id;
					 * private String name;
					 * private String suit;
					 * private int value;
					 * private String image;
					 * 
					 * public Card(int number, String name, String suit, int value, String image) {
					 * this.id = number;
					 * this.name = name;
					 * this.suit = suit;
					 * this.value = value;
					 * this.image = image;
					 * }
					 * 
					 * public int getId() {
					 * return id;
					 * }
					 * 
					 * public String getName() {
					 * return name;
					 * }
					 * 
					 * public String getSuit() {
					 * return suit;
					 * }
					 * 
					 * public int getValue() {
					 * return value;
					 * }
					 * 
					 * public String getImage() {
					 * return image;
					 * }
					 * 
					 * public String toString() {
					 * return "<img src='" + this.image + "'>";
					 * }
					 */

	public static final String[] suit = { "Oros, Copas, Espadas, Bastos" };
	public static final String[] name = { "Uno, Dos, Tres, Cuatro, Cinco, Seis, Siete, Sota, Caballo, Rey" };
	private int id;

	public Card(int id) {
		this.id = id;
	}

	int getId() {
		return this.id;
	}

	String getPalo() {
		return Card.suit[(int) (this.id / 10)];
	}

	String getNumeroAsString() {
		return Card.name[(int) (this.id % 10)];
	}

	int getNumeroAsInt() {
		return (int) (this.id % 10);
	}
}
