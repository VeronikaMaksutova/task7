package com.company;

public class Card {
    int rank;
    public Card(int rang) {
        this.rank= rang;
    }
    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                '}';
    }
}
