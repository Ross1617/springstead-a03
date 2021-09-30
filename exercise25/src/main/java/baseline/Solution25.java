/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 25
 *  Copyright 2021 Ross Springstead
 */

package baseline;
import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    private String readInput(String prompt){
        //prompts the user with the string that was provided
        //returns the users next Line
    }
/*
A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
 */
    private int passwordValidator (String password){
        //takes a password as the input and returns a number 1-5 depending on the strength

        //create a variable that gets the length of the password
        //create a booleans that hold the value of if there is a number, letter, special character

        //checks to see if are any numbers in the password
            //if so set number to true

        //check to see if there are any letters
            //if so set letter to true
        
        //checks to see if there are any special characters
            //if so sets specialCharacter to true

        //if password is longer than eight keep going
            //check to see if the password has letters, numbers, and special character
                //if so return 4 for very strong
            //else
                //check to see if password has letters and numbers
                    //if it does return 3
                //else
                    // return 5 for case where this result was not specified
        //else
            //if the password is only made out of numbers
                //return 1 for the case of very weak password
            //else
                //if the password contains  special characters
                    //return 5 for test case not defined
                //else
                    //return 2 for weak password


    }
    public static void main(String[] args) {
        Solution25 sol = new Solution25();
        //calls readInput with the prompt asking the user for a password

        //takes the users input and saves it to String

        //calls passwordValidator with the String that was provided

        //create an empty String for the result

        //if the result is 1
            //add very weak password to result string
        //if the result is 2
            //add weak password to result string
        //if the result is 3
            //add strong password to result string
        //if result is 4
            //add very strong password to result string
        //if result is 5
            //add case not specified to result string
        //print result string

    }
}
