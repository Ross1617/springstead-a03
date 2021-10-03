/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ross Springstead
 */
package baseline;
import java.util.Scanner;
public class Solution29 {
    private static final Scanner in = new Scanner(System.in);
    private int readInput(String prompt){
        int number;
        do {
            //prompts the user for an input
            System.out.printf("%s",prompt);
            while (!in.hasNextInt()) {
                //prompts the user again for a new number
                String input = in.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            number = in.nextInt();
            //checks to see if the value is a positive number
        } while (number <= 0);
        //returns a positive number
        return number;
    }
    public double calculate(int number){
        //takes the input and uses the formula 72/ number
        double years = 72/ number;
        //prints the number of years
        System.out.printf("It will take %.2f years to double your initial investment.",years);
        //returns the number of years
        return years;
    }

    public static void main(String[] args) {
        Solution29 sol = new Solution29();
        //calls the readInput function
        int number = sol.readInput("What is the rate of return?");
        //and assigns the number to a variable
        //calls the calculate function
        sol.calculate(number);


    }
}
