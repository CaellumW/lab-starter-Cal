import java.io.Console;
import java.io.Console.*;

public class Main {


static void main() {
    Console.Main();
    Console.PlayerTurn();
    int playerHand = Console.playerHandValue();
    while (playerHand>=0){
        if (playerHand<21){
            Console.PlayerTurn();
        }
        while (playerHand>=21){
            if (playerHand == 21){
                System.out.println("Player has reached 21, and won");
                break;
            }
            else if (playerHand>21){
                System.out.println("Player has bust. Dealer wins.");
                break;
            }
        }
    }

    }
}
