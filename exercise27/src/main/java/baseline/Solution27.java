/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ross Springstead
 */
package baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt){
        //prompts the user for a string
        //returns the user next line

    }
    public void validateInput(String firstName, String lastName, String zipCode, String ID){
        //create a counter
        //calls the four validate functions below with the correct parameter
        //counter += to each of the functions
        //if counter is = 0 print there is no errors
    }
    private int validateFirstName(String firstName){
        //checks to see if the input is at least two characters long
            //if longer than it print nothing and return 0
        //else print the error message and return 1
    }
    private int validateLastName(String lastName){
        //checks to see if the input is at least two characters long
            //if longer than it print nothing and return 0
        //else print the error message and return 1

    }
    private int validateZipCode(String zip){
        //check to see the length is 5
        //check each index and make sure it is a number
            //if all of them are numbers return 0
        //else return 1 and print error message
    }
    private int validateID(String ID){
        //check to see if the length of string is 8
            //if not 8 return 1 and print error

        //check to see if first index is a number
            //if so check to see if the second index is a number
                //if check to see if third index is a -
                    // check to see if the last four indexes are numbers
                        //if all these cases are true return 0
        //else return 1 and print error

    }

    public static void main(String[] args) {
        //use readInput and prompt the user for firstName and store the value
        //use readInput and prompt the user for lastName and store the value
        //use readInput and prompt the user for employeeId and store the value
        //use readInput and prompt the user for zipCode and store the value
        //calls validateInput function with all 4 inputs

    }



}
