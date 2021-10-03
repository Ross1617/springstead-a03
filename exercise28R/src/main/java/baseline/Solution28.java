/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ross Springstead
 */

package baseline;
import java.util.ArrayList;

import java.util.Scanner;
//had to redesign
public class Solution28 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt){
        //prompts the user for an int
        System.out.println(prompt);
        //returns the user next INt
        return in.nextLine();
    }
    public int counter(ArrayList numbers){

        //print the output counter
        int value = 0;
        int length = numbers.size();
        //for all 5 numbers
        for (int i = 0; i < length; i++){
            //adding them together
            value += (int)numbers.get(i);
        }
        //return counter
        //length of ArrayList
        System.out.printf("The total is %d.",value);
        return value;


    }
    public static void main(String[] args) {
        //calls the int counter function
        Solution28 sol = new Solution28();
        //create a counter
        int counter = 0;
        int value = 0;
        //runs 5 times
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (counter <5 ){
            // ask the user for a number by calling readINput
            //value is equal to the input
            value = Integer.valueOf(sol.readInput("Give me a number:"));
            //adding the input to array list
            numbers.add(value);
            //increasing counter
            counter ++;
        }
        int number = sol.counter(numbers);

    }
}
