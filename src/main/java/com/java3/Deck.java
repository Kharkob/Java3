package com.java3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {  private List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(new Card(j + 2, values[j] + " of " + suits[i]));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }

}
