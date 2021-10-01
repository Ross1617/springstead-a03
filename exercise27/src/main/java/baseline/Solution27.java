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
        System.out.println(prompt);
        //returns the user next line
        return in.nextLine();
    }
    public int validateInput(String firstName, String lastName, String zipCode, String ID){
        //create a counter
        int counter = 0;
        //calls the four validate functions below with the correct parameter
        counter += validateFirstName(firstName);
        counter += validateLastName(lastName);
        counter += validateZipCode(zipCode);
        counter += validateID(ID);
        //counter += to each of the functions
        //if counter is = 0 print there is no errors
        if (counter ==0){
            System.out.printf("No errors found.\n");
        }
        return counter;
    }
    private int validateFirstName(String firstName){
        //checks to see if the input is at least two characters long
        int length = firstName.length();
        if (length == 0){
            System.out.printf("The first name must be filled in.\n");
        }
        if (length>=2){
            //if longer than it print nothing and return 0
            return 0;
        }
        else{
            //else print the error message and return 1
            System.out.printf("The first name must be at least 2 characters long.\n");
            return 1;
        }

    }
    private int validateLastName(String lastName){
        //checks to see if the input is at least two characters long
        int length = lastName.length();
        if (length == 0){
            System.out.printf("The last name must be filled in\n");
        }
        if  (length>=2){
            //if longer than it print nothing and return 0
            return 0;
        }
        else{
            //else print the error message and return 1
            System.out.printf("The last name must be at least 2 characters long.\n");
            return 1;
        }
    }
    private int validateZipCode(String zip){
        //check to see the length is 5
        int length = zip.length();
        if (length != 5){
            System.out.printf("Zipcode must be a 5 digit number\n");
            return 1;
        }
        //check each index and make sure it is a number
        for (int i = 0; i<5; i++){
            //if all of them are numbers return 0
            if((Character.isDigit(zip.charAt(i)) != true)){
                System.out.printf("Zipcode must be a 5 digit number\n");
                return 1;
            }
            else {
                return 0;
            }
        }
        return 0;
    }
    private int validateID(String ID){
        //check to see if the length of string is 8
        int length = ID.length();
            //if not 8 return 1 and print error
        if (length !=7 ){
            System.out.printf("The employee ID must be in the format of AA-1234\n");
            return 1;
        }
        char hyphen = '-';
        //check to see if first index is a number
        //if so check to see if the second index is a number
        //if check to see if third index is a -
        // check to see if the last four indexes are numbers
        //if all these cases are true return 0
        //else return 1 and print error

        if((Character.isLetter(ID.charAt(0)) == true)){
            if((Character.isLetter(ID.charAt(1)) == true)){
                if(ID.charAt(2) == hyphen ){
                    for(int j = 3; j<7;j++){
                        if((Character.isDigit(ID.charAt(j)) == true)){
                            return 0;
                         }

                        }
                    }

                }
            }

        System.out.printf("The employee ID must be in the format of AA-1234\n");
        return 1;


    }


    public static void main(String[] args) {
        Solution27 sol = new Solution27();
        //use readInput and prompt the user for firstName and store the value
        String firstName = sol.readInput("What is your first name?");
        //use readInput and prompt the user for lastName and store the value
        String lastName = sol.readInput("What is your last name?");
        //use readInput and prompt the user for employeeId and store the value
        String zipCode= sol.readInput("What is your zip code?");
        //calls validateInput function with all 4 inputs
        String ID = sol.readInput("What is your employeeID?");
        //use readInput and prompt the user for zipCode and store the
        sol.validateInput(firstName,lastName,zipCode,ID);

    }



}
