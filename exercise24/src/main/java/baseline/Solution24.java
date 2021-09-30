/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ross Springstead
 */
package baseline;
import java.util.Arrays;
import java.util.Scanner;
public class Solution24 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt){
        //prompts user with string that was provided
        System.out.println(prompt);
        //returns the users next line
        return in.nextLine();
    }
    //need to make public so I can test it
    public boolean isAnagram(String word1, String word2){
        //create a function isAnagram that takes in two strings
        //set all the letters to lower case and store them in char[]
        char[] arrayWord1 = word1.toLowerCase().toCharArray();
        char[] arrayWord2 = word2.toLowerCase().toCharArray();
        //sort them for both strings
        Arrays.sort(arrayWord1);
        Arrays.sort(arrayWord2);
        //compare the new strings
        boolean status = Arrays.equals(arrayWord1, arrayWord2);
        //return status
        return status;
    }


    public static void main(String[] args) {
        Solution24 sol = new Solution24();
        //prompt the user on the concept of the program

        //calls the readInput and passes the prompt for the user to give a word
        //store the value
        String word1 = sol.readInput("Enter the first string: ");
        //calls the readInput and passes the prompt for the user to give another word
        //store the value
        String word2 = sol.readInput("Enter the second string: ");
        //call function isAnagram
        //if the function returns true print they are anagrams
        //else print they are not
        if (sol.isAnagram(word1,word2) == true ){
            System.out.printf("\"%s\" and \"%s\" are anagrams.",word1,word2);
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.",word1,word2);

        }

    }

}
