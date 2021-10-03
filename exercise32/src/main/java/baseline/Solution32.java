/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ross Springstead
 */
package baseline;
import java.util.Random;
import java.util.Scanner;
//had to redesign my code so it would run a test
public class Solution32 {
    Random rand = new Random();
    private static final Scanner in = new Scanner(System.in);

    private int readYN(String prompt){
        System.out.println(prompt);
        //prompts the user with prompt
        return in.nextInt();
        //returns the string entered
    }

    public boolean game(int secretNumber,int intGuess){

        //while loop that goes until the user gets the number
        if (secretNumber == intGuess){
                return true;
            }
            else if(secretNumber> intGuess){
                System.out.printf("Guess is to low\n");
            }
            else{
                System.out.printf("Guess is to high\n");
            }
        //returns false to keep the game going

        return false;

    }

    public static void main(String[] args) {
        Solution32 sol = new Solution32();
        int continueGame = 1;
        //have a while loop that goes until the user enters 0
        while (continueGame == 1){
            //prompt the user for the difficulty
            int difficulty = Integer.valueOf(sol.readYN("What difficulty 1, 2, or 3"));
            //call the game function depending on the user input
            //int value = sol.game(difficulty);
            //generates a random number depending on the difficulty
            int secretNumber = sol.rand.nextInt(difficulty*10)+1;
            //create a counter
            int counter =0;
            boolean done = false;
            while(done == false) {
                System.out.println("Please enter an integer");
                while (!in.hasNextInt()){
                    in.next();
                    System.out.println("Please enter an integer");
                    //increase counter for every Input the user enters
                    counter ++;
                }
                //increase counter for every Input the user enters
                counter ++;
                int intGuess = in.nextInt();
                done = sol.game(secretNumber,intGuess);


            }
            //prints the amounts of guesses
            System.out.printf("It took %d amount of guesses\n",counter);
            //ask the user if they want to continue
           System.out.printf("Do you wish to play again?\n");
            continueGame = sol.readYN("Enter 1 to play again or enter 0 to stop");
        }


    }
}
