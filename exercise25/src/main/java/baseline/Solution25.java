/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 25
 *  Copyright 2021 Ross Springstead
 */

package baseline;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    private String readInput(String prompt){
        //prompts the user with the string that was provided
        System.out.println(prompt);
        //returns the users next Line
        return in.nextLine();
    }
/*
A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
 */
    private int passwordValidator (String password){
        //takes a password as the input and returns a number 1-5 depending on the strength
        //char[] passwordArray = password.toCharArray();
        //create a variable that gets the length of the password
        int length = password.length();
        //create a booleans that hold the value of if there is a number, letter, special character
        boolean number = false, letter = false, specialCharacter = false;
        for(int i = 0; i < length; i++){
            //check to see if there are any letters
            if ((Character.isLetter(password.charAt(i)) == true)) {
                //if so set letter to true
                letter = true;
            }
            //checks to see if are any numbers in the password
            if((Character.isDigit(password.charAt(i)) == true)){
                //if so set number to true
                number = true;
            }
            //checks to see if there are any special characters
            if (password.contains("@") == true || password.contains("!") == true || password.contains("#") == true|| password.contains("$") == true || password.contains("%") == true || password.contains("^") == true || password.contains("&") == true || password.contains("*") == true || password.contains("(") == true || password.contains(")") == true || password.contains("-") == true || password.contains("?") == true || password.contains("<") == true || password.contains(">") == true || password.contains("/") == true || password.contains(",") == true || password.contains(".") == true || password.contains("|") == true){
                //if so sets specialCharacter to true
                specialCharacter = true;
            }

        }
        //if password is longer than eight keep going
        if (length > 7){
            //check to see if the password has letters, numbers, and special character
            if(number == true && letter == true && specialCharacter == true){
                //if so return 4 for very strong
                return 4;
            }
            //check to see if password has letters and numbers
            if(number == true && letter == true ){
                //if it does return 3
                return 3;
            }
            else{
                // return 5 for case where this result was not specified
                return 5;
            }

        }
        else{
            //if the password is only made out of numbers
            if(number == true && letter == false && specialCharacter == false){
                //return 1 for the case of very weak password
                return 1;
            }
            else {
                //if the password contains  special characters
                if (specialCharacter == true ){
                    //return 5 for test case not defined
                    return 5;
                }
                else{
                    //return 2 for weak password
                    return 2;
                }
            }
        }

    }
    public static void main(String[] args) {
        Solution25 sol = new Solution25();
        //calls readInput with the prompt asking the user for a password
        //takes the users input and saves it to String
        String password = sol.readInput("What is your password? ");
        //calls passwordValidator with the String that was provided
        //creates variable for int return
        int result = sol.passwordValidator(password);
        //create a String for the result
        String printResult = "The password ";
        //if the result is 1
        if(result == 1){
            //add very weak password to result string
            printResult = printResult + password + " is a very weak password.";
        }
        //if the result is 2
        if(result ==2){
            //add weak password to result string
            printResult = printResult + password + " is a weak password.";
        }

        //if the result is 3
        if(result ==3){
            //add strong password to result string
            printResult = printResult + password + " is a strong password.";
        }

        //if result is 4
        if(result ==4){
            //add very strong password to result string
            printResult = printResult + password + " is a very strong password.";
        }

        //if result is 5
        if(result ==5){
            //add case not specified to result string
            printResult = printResult + " is unknown strength.";
        }

        //print result string
        System.out.printf("%s",printResult);
    }
}
