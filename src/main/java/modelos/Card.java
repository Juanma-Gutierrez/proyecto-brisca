package modelos;

public class Card {
	private int id;
	private String name;
	private String suit;
	private int value;
	private String image;

	public Card(int number, String name, String suit, int value, String image) {
		this.id = number;
		this.name = name;
		this.suit = suit;
		this.value = value;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

	public String getImage() {
		return image;
	}

	public String toString() {
		return "<img src='" + this.image + "'>";
	}
}
