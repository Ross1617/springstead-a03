package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ross Springstead
 */
import java.util.*;
import java.util.Scanner;
public class Solution38 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt){
        //prompt the user
        System.out.println(prompt);
        //return the user input
        return in.nextLine();
    }
    public Integer[] filterEvenNumbers(String values[]){
        //creates an array to hold the values
        ArrayList<Integer> listOfEven = new ArrayList<>();
        //get the length of the input
        int length = values.length;
        //for the length of the input
        for(int i = 0; i < length; i++){
            //takes each value and converts it to int
            int number = Integer.parseInt(values[i]);
            //if it is even add it
            if(number % 2 == 0){
                listOfEven.add(number);
            }
        }
        //returning an array of integers
        Integer[] newArrayOfEven = new Integer[listOfEven.size()];
        newArrayOfEven = listOfEven.toArray(newArrayOfEven);
        //return the new array
        return newArrayOfEven;
    }

    public static void main(String[] args) {
        Solution38 sol = new Solution38();
        //ask the user to enter numbers with spaces
        String values = sol.readInput("Enter a list of numbers, separated by spaces:");
        //create a blank string array
        // add each number into the array
        String listOfNumbers[] = values.split(" ");
        //call the filterEvenNumbers
        Integer evenList[] = sol.filterEvenNumbers(listOfNumbers);
        //calculate the length of the new array
        int length = evenList.length;
        //print the results
        System.out.printf("Only the even numbers ");
        for(int i = 0; i< length; i++ ){
            System.out.print(evenList[i] + " " );
        }
    }
}
