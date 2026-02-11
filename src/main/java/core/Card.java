/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent one playing card.

    You MAY change this to a record/enum as you see fit.
 */
package core;

import static core.CardStack.handValue;

public class Card {
    String suit;
    static String rank;

    public Card(String Suit, String Rank) {
        this.suit = Suit;
        this.rank = Rank;
    }

    public String getRank() {
        String rankStr = "";
        switch (rank) {
            case "ONE":
                rankStr += "1";
            case "TWO":
                rankStr += "2";
            case "THREE":
                rankStr += "3";
            case "FOUR":
                rankStr += "4";
            case "FIVE":
                rankStr += "5";
            case "SIX":
                rankStr += "6";
            case "SEVEN":
                rankStr += "7";
            case "EIGHT":
                rankStr += "8";
            case "NINE":
                rankStr += "9";
            case "JACK":
                rankStr += "J";
            case "KING":
                rankStr += "K";
            case "QUEEN":
                rankStr += "Q";
            case "ACE":
                rankStr += "A";
        }
    }

    ;

    public String getSuit() {
        String suitStr = "";
        switch (suit) {
            case "HEARTS":
                suitStr += "♥";
            case "SPADES":
                suitStr += "♠";
            case "CLUBS":
                suitStr += "♣";
            case "DIAMONDS":
                suitStr += "♦";
        }
    }

    public static int getValue(int handValue) {
        int rankValue = 0;
        switch (rank) {
            case "ONE":
                rankValue = 1;
            case "TWO":
                rankValue = 2;
            case "THREE":
                rankValue = 3;
            case "FOUR":
                rankValue = 4;
            case "FIVE":
                rankValue = 5;
            case "SIX":
                rankValue = 6;
            case "SEVEN":
                rankValue = 7;
            case "EIGHT":
                rankValue = 8;
            case "NINE":
                rankValue = 9;
            case "JACK":
                rankValue = 10;
            case "KING":
                rankValue = 10;
            case "QUEEN":
                rankValue = 10;
            case "ACE":
                if ((handValue + 11)>21){
                    rankValue = 1;
                }
                if ((handValue + 11)==21){
                    rankValue = 11;
                }
                if ((handValue + 11)<21){
                    rankValue = 11;
                };
        }
        return rankValue;
    }



    String cardStr() {
        String cardStr = "";
        cardStr += getRank();
        cardStr += getSuit();
        return cardStr;
    }

}
