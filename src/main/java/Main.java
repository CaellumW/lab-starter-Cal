import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 * calls all functions in the program and runs them in order
 * @param no parameters
 * @return nothing, it simply calls other methods that print things
 */
void main(){
    System.out.println("Hi, this was hard.");
    evenOrOdd();
    numList();
    System.out.println("Now, what's your favourite dessert?");
    Scanner dessertInput = new Scanner(System.in);
    String dessert = dessertInput.nextLine();
    bullyBot(dessert);
    listMaker();
    int x = 0;
    int y = 0;
    int z = 0;
    try {
        System.out.println("I'm gonna ask for a bunch of numbers again. First one?");
        Scanner firstNum = new Scanner(System.in);
        x = firstNum.nextInt();
        System.out.println("Second one?");
        Scanner secondNum = new Scanner(System.in);
        y = secondNum.nextInt();
        System.out.println("Third one?");
        Scanner thirdNum = new Scanner(System.in);
        z = thirdNum.nextInt();
        System.out.println("Let's see...the average of those numbers is: ");
        System.out.println(numAvg(x, y, z));
    } catch (Exception e) {
        System.out.println("Well, somewhere along the way you didn't put numbers. Now look what you've done.");
        throw new RuntimeException(e);
    }
    numAvg(x, y, z);
    System.out.println("That's all this program is. Hope you had fun.");
}

/**
 * Checks a user provided integer if it is even or odd
 * @param no parameters
 * @return doesn't return anything, prints results
 */
void evenOrOdd(){
    //takes user input to see if the integer is odd or even.
    System.out.println("Please enter an integer. Please only an integer, this isn't fool proof.");
    Scanner userInput = new Scanner(System.in);
    try {
        int num = userInput.nextInt();
        if (num > 0) {
            int x = num % 2;
            if (x == 1) {
                System.out.println("The remainder is: " + x + ". That is an odd number");
            }
            if (x == 0) {
                System.out.println("The remainder is: " + x + ". That is an even number");
            }
        }
    }
    catch (Exception TypeError)   {
            System.out.println("That's literally not an integer.");
        }
        }

/**
 * lists numbers from the user provided number down to 1
 * @param no parameters
 * @return returns nothing, prints results
  */
void numList(){
    //takes user input and lists every number from the one provided down to zero
    System.out.println("Please enter another integer.");
    Scanner userInput = new Scanner(System.in);
    try {
        int listNum = userInput.nextInt();
        if (listNum == 0) {
            System.out.println("That's literally zero. What do you want me to do with that?");
        }
        if (listNum > 0) {
            while (listNum > 0) {
                System.out.println(listNum);
                listNum--;
            }
        }
    }
    catch (Exception TypeError){
        System.out.println("That doesn't seem to be an integer.");
        }
        }

/**
 * simply makes fun of the user for whatever their favourite dessert is
  * @param userDessert
 * @return returns nothing, prints a mean statement
 */
void bullyBot(String userDessert){
    //just makes fun of the user for their favourite dessert
    System.out.println("So your favourite dessert is " + userDessert + "? Really?");
}

/**
 * constructs an array from user provided numbers
 * @param no parameters
 * @return returns nothing, print results
 */
void listMaker(){
    //takes user input and makes an array out of the three provided integers
    //also tries to write that array into a text file
    System.out.println("Please enter an integer.");
    Scanner userInput = new Scanner(System.in);
    int numOne = userInput.nextInt();
    System.out.println("Please enter another integer.");
    Scanner secondInput = new Scanner(System.in);
    int numTwo = secondInput.nextInt();
    System.out.println("One more please.");
    Scanner ThirdInput = new Scanner(System.in);
    int numThree = ThirdInput.nextInt();
    int[] yourList = {numOne, numTwo, numThree};
    System.out.println("Here is the list you made: " + java.util.Arrays.toString(yourList));
    FileWriter writtenResults = null;
    try {
        writtenResults = new FileWriter("userlists.txt");
        writtenResults.append(java.util.Arrays.toString(yourList));
        writtenResults.close();
    } catch (IOException e) {
        System.out.println("Well, we couldn't write that down, so you'll have to write it down yourself");
        throw new RuntimeException(e);
    }

}

/**
 * finds the average of 3 user provided numbers
 * @param x, y, z are user provided numbers
 * @return the average of the provided numbers
 */
double numAvg(int x, int y, int z){
    double total = x + y + z;
    return total/3;
}