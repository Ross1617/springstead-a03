/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ross Springstead
 */
package baseline;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
public class Solution37 {
    Random rand = new Random();
    private static final Scanner in = new Scanner(System.in);
    private int readInt(String prompt){
        //prompt the user
        System.out.println(prompt);
        //return the user input
        return in.nextInt();
    }

    public String passwordCreator(int minLength, int special, int numbers){
        //create a blank string
        String password ="";
        // add up special charactes and numbers
        int valueOfSpecialandNumber = numbers + special;
        int normalCharacters = 0;
        //make sure that the minLength is achieved
        if (minLength <valueOfSpecialandNumber){
            normalCharacters = valueOfSpecialandNumber;
        }
        else{
            normalCharacters = minLength ;
        }
        //create list for normal, special, and numbers
        List<String> normalLetters=Arrays.asList("a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
        List<String> specialLetters = Arrays.asList("!","@","#","$","%","^","&","*","(",")","+","-","?");
        List<String> numbersLetter = Arrays.asList("1","2","3","4","5","6","7","8","9","0");


        //create a variable for normalletters

        //for amount of normalletters
        int randomNumber;
        for(int i = 0; i < normalCharacters; i++){
            //select a random number
            randomNumber = rand.nextInt(25);
            //use that number and take the index
            String word = normalLetters.get(randomNumber);
            //add the letter to the password
            password = password + word;

        }
        for(int i = 0; i < special; i++){
            //select a random number
            randomNumber = rand.nextInt(12);
            //use that number and take the index
            String word = specialLetters.get(randomNumber);
            //add the letter to the password
            password = password + word;

        }
        for(int i = 0; i < numbers; i++){
            //select a random number
            randomNumber = rand.nextInt(9);
            //use that number and take the index
            String word = numbersLetter.get(randomNumber);
            //add the letter to the password
            password = password + word;

        }
        //returns the string
        return  password;
    }

    public static void main(String[] args) {
        Solution37 sol = new Solution37();
        //prompt the user for minimum numbers
        int min = sol.readInt("What's the minimum length");
        //prompt the user for amount of special characters
        int special = sol.readInt("How many special characters");
        //prompt the user for amount of numbers
        int number = sol.readInt("How many numbers");
        //call password function with all the parameters
        String password = sol.passwordCreator(min, special, number);
        //print the password
        System.out.printf("Your password is %s",password);

    }
}
