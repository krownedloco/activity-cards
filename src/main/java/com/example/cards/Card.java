package com.example.cards;

import java.util.Objects;

public class Card {

    private Suit suit;
    private FaceValue facevalue;

    private Card() {
    }
    public Card(Suit suit, FaceValue facevalue) {
        this.suit = suit;
        this.facevalue = facevalue;
    }

    public Suit getSuit() {
        return suit;
    }

    public FaceValue getFacevalue() {
        return facevalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && facevalue == card.facevalue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, facevalue);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card {");
        sb.append("suit=").append(suit);
        sb.append(", facevalue=").append(facevalue);
        sb.append('}');
        return sb.toString();
    }
}
