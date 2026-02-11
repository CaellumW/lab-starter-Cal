/*
    NOTE:

    Add to this type any variables and/or methods required
    to represent/manipulate a stack (deck/hand) of playing cards.

    You MAY change this to a record/enum as you see fit.
 */
package core;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static core.Card.*;


public class CardStack {
    static ArrayList<Card> deck = new ArrayList<>();
    public static ArrayList<Card> playerDeck = new ArrayList<>();
    public static ArrayList<Card> dealerDeck = new ArrayList<>();
    public static int playerHandValue;
    public static int dealerHandValue;

    public static void shuffleDeck() {
        ArrayList<String> Ranks = new ArrayList<String>(Arrays.asList("ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "KING", "QUEEN", "ACE"));
        ArrayList<String> Suits = new ArrayList<String>(Arrays.asList("HEARTS", "CLUBS", "SPADES", "DIAMONDS"));
        for (String rank : Ranks) {
            for (String suit : Suits) {
                deck.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(deck);
    }


    public static void makeHands(){
        playerDeck.add(deck.getFirst());
        deck.removeFirst();
        playerDeck.add(deck.getFirst());
        deck.removeFirst();

        dealerDeck.add(deck.getFirst());
        deck.removeFirst();
        dealerDeck.add(deck.getFirst());
        deck.removeFirst();
    }


    public static void addPlayerCard(){
        playerDeck.add(deck.getFirst());
        deck.removeFirst();
    }


    public static void addDealerCard(){
        dealerDeck.add(deck.getFirst());
        deck.removeFirst();
    }


    public static void playerStackValue(){
         playerHandValue = getValue(playerHandValue);
        }

    public static void dealerStackValue(){
        dealerHandValue = getValue(dealerHandValue);
    }
    }


