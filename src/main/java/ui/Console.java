import core.CardStack;

public void Main() {
    System.out.println("Welcome to blackjack. First player will be the 'player' and second player will be the 'dealer'");
    System.out.println("You will both be dealt a hand of two cards to start with, and you will both know each other's hands");
    System.out.println("Currently, the hands are as follows:");
    CardStack.shuffleDeck();
    CardStack.makeHands();
    System.out.println(CardStack.playerDeck);
    System.out.println(CardStack.dealerDeck);
}

public static void PlayerTurn(){
    String playerDecisionStr = "";
    while (true) {
        if (playerDecisionStr.equals("h")) {
            CardStack.addPlayerCard();
            break;
        }
        if (playerDecisionStr.equals("s")) {
            break;
        }
        System.out.println("Player, please choose: h/s");
        Scanner playerDecision = new Scanner(System.in);
        playerDecisionStr = playerDecision.toString().toLowerCase();
    }
    System.out.println("Player, your deck is now as follows:");
    System.out.println(CardStack.playerDeck);
}


public static void DealerTurn(){
    System.out.println("Dealer, it is your turn.");
    System.out.println("Here is your current deck dealer:");
    System.out.println(CardStack.dealerDeck);

    String dealerDecisionStr = "";
    while (true) {
        if (dealerDecisionStr.equals("h")) {
            CardStack.addDealerCard();
            break;
        }
        if (dealerDecisionStr.equals("s")) {
            break;
        }
        System.out.println("Player, please choose: h/s");
        Scanner dealerDecision = new Scanner(System.in);
        dealerDecisionStr = dealerDecision.toString().toLowerCase();
    }
}
public int playerHandValue(){
        CardStack.playerStackValue();
        return CardStack.playerHandValue;
    }
public int dealerHandValue(){
        CardStack.dealerStackValue();
        return CardStack.dealerHandValue;
    }

