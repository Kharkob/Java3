package com.java3;

import java.util.ArrayList;
import java.util.List;

public class Player {
private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.score = 0;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println(name + " has the following cards:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        return hand.remove(0);
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void incrementScore() {
        score++;
    }
}
