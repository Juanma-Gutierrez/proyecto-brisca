package modelos;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;
    private boolean clickable;
    private boolean reverse;

    public Deck(boolean reverse, boolean clickable) {
        this.reverse = reverse;
        this.clickable = clickable;
        this.init();
        this.shuffleDeck();
    }

    private void init() {
        deck = new ArrayList<Card>();
        for (int i = 0; i < 40; i++) {
            deck.add(new Card(i));
        }
    }

    public Card getCard(int num) {
        return deck.get(num);
    }

    public boolean isClickable() {
        return clickable;
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    public int getLenght() {
        return this.deck.size();
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card addCard(Card card) {
        this.deck.add(card);
        return card;
    }

    public void emptyDeck() {
        this.deck.clear();
    }

    public boolean isEmpty() {
        return (this.deck.size() > 0) ? false : true;
    }

    public Card removeCard() {
        return deck.remove(0);
    }

    public Card removeCardNumber(int num) {
        return deck.remove(num);
    }

    /**
     * Devuelve los puntos que tiene el mazo
     *
     * @return
     */
    public int getPoints() {
        int points = 0;
        for (Card c : this.deck) {
            points += c.getValue();
        }
        return points;
    }

    /**
     * Muestra las cartas con formato CardTemplate
     *
     * @return String con la cadena a mostrar
     */
    public String showCards() {
        String res = "";
        for (int i = 0; i < this.deck.size(); i++) {
            CardTemplate card = new CardTemplate(this.deck.get(i), clickable, reverse, i);
            res += card;
        }
        return res;
    }

    /**
     * Devuelve al ganador del embite
     *
     * @param triumphSuit el palo de la partida
     * @param handSuit el palo del embite
     * @return entero con la posición del jugador ganador
     */
    public int checkWinner(String triumphSuit, String handSuit, int playerInGame, int numPlayers) {
        int cards = this.deck.size();
        int winner = -1;
        int maxPoints = -1;
        int points = 0;

        for (int i = 0; i < cards; i++) {
            points = 0;
            Card card = this.deck.get(i);
            String suit = card.getSuit();
            points += card.getOrder();
            // Comprobamos la carta si es del palo del triunfo para añadir 40 puntos al
            // valor
            if (suit.equals(triumphSuit)) {
                points += 40;
            } else if (suit.equals(handSuit)) {
                // Comprobamos la carta si es del palo la mano para añadir 20 puntos al valor
                points += 20;
            }
            System.out.printf("Carta%d jugador %d: %s de %s Valor: %d\n", i, (playerInGame + i), card.getNumberAsString(), suit, points);
            if (points > maxPoints) {
                maxPoints = points;
                winner = i;
            }
        }
        winner = (winner + playerInGame) % numPlayers;
        System.out.printf("Ganador de la mano: %s\n", winner);
        return winner;
    }
}
