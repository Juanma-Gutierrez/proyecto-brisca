package modelos;

public class Card {

    public static final String[] suit = {"Oros", "Copas", "Espadas", "Bastos"};
    public static final String[] name = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo",
        "Rey"};
    public static final int[] value = {11, 0, 10, 0, 0, 0, 0, 2, 3, 4};
    public static final int[] order = {9, 0, 8, 1, 2, 3, 4, 5, 6, 7};
    private int id;

    public Card(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getSuit() {
        return Card.suit[(int) (this.id / 10)];
    }

    public int getSuitNumber() {
        return (int) (this.id / 10);
    }

    String getNumberAsString() {
        return Card.name[(int) (this.id % 10)];
    }

    public int getValue() {
        return Card.value[(int) (this.id % 10)];
    }

    public int getOrder() {
        return Card.order[(int) (this.id % 10)];
    }

    int getNumeroAsInt() {
        return (int) (this.id % 10);
    }
}
