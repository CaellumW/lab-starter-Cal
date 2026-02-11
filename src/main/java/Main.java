import java.io.Console;
import java.io.Console.*;

public class Main {


static void main() {
    Console.main();
    Console.PlayerTurn();
    int playerHand = Console.playerHandValue();
    while (playerHand>=0){
        if (playerHand<21){
            Console.PlayerTurn();
            playerHand = Console.playerHandValue();
        }
        while (playerHand>=21){
            if (playerHand == 21){
                System.out.println("Player has reached 21, and won");
                playerHand = Console.playerHandValue();
                break;
            }
            else if (playerHand>21){
                System.out.println("Player has bust. Dealer wins.");
                playerHand = Console.playerHandValue();
                break;
            }
        }
    }
    Console.DealerTurn();
    int dealerHand = Console.dealerHandValue();
    while (dealerHand>=0){
        if (dealerHand<21){
            Console.DealerTurn();
            dealerHand = Console.dealerHandValue();
        }
        while (dealerHand>=21){
            if (dealerHand == 21){
                System.out.println("Dealer has reached 21, and won.");
                dealerHand = Console.dealerHandValue();
                break;
            }
            else if (dealerHand>21){
                System.out.println("Dealer has bust. Player wins.");
                dealerHand = Console.dealerHandValue();
                break;
            }
        }
    }

    }
}
