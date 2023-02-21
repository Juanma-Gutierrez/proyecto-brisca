package modelos;

public class CardTemplate {
    Card card;

    public CardTemplate(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return String.format("<div class='carta'><img src='assets/img/deck/%02d.png'></div>",
                this.card.getId() + 1);

    }
}