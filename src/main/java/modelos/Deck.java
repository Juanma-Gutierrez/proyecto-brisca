package modelos;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck;

	public Deck(){
        this.init();
        this.barajar();
    }

    private void init(){
        deck = new ArrayList<Card>();
        for(int i = 1; i <= 40;i++)
            deck.add(new Card(i));
        
    }

    public void barajar(){
        Collections.shuffle(deck);
    }

    public Card extrae(){
        return deck.remove(0);
    }

}
