/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;
import java.util.Scanner;
public class Solution28 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt){
        //prompts the user for an int
        System.out.println(prompt);
        //returns the user next INt
        return in.nextLine();
    }
    public int counter(){
        //create a counter
        int counter = 0;
        int value = 0;
        //runs 5 times
        while (counter <5 ){
            // ask the user for a number by calling readINput
            //value += input
            value += Integer.valueOf(readInput("Give me a number:"));
            counter ++;
        }
        //print the output counter
        //return counter
        System.out.printf("The total is %d.",value);
        return value;


    }
    public static void main(String[] args) {
        //calls the int counter function
        Solution28 sol = new Solution28();
        sol.counter();

    }
}
