package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ross Springstead
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Solution33 {
    Random rand = new Random();
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt){
        //prompt the user
        System.out.println(prompt);
        //return the user input
        return in.nextLine();
    }
    public String magic8(int number){
        //String expression;
        //depending on what the random number print a expression
        //done by using a ArrayList
        ArrayList<String> expressions = new ArrayList<String>();
        //adding each expression to the list
        expressions.add("Yes");
        expressions.add("No");
        expressions.add("Maybe");
        expressions.add("Ask again later");

        //return the expression
        return expressions.get(number);
    }

    public static void main(String[] args) {
        Solution33 sol = new Solution33();
        //ask the user to enter a question
        String question = sol.readInput("What is your question?");
        //generate a random number
        int number = sol.rand.nextInt(3);
        //calls the magic8 function with that number
        String statement = sol.magic8(number);
        //prints the statement
        System.out.printf("%s",statement);


    }
}
