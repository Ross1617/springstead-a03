package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Solution35 {

    Random rand = new Random();
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt) {
        String name ;
        do {
            //prompt the user
            System.out.println(prompt);
            //make sure it isn't a blank string
            name = in.nextLine();
            if (!name.isBlank() && !name.isEmpty()) {
                //return the user input
                return name;
            }
        }while(name.isBlank()&&name.isEmpty());

        return "AAA";
    }
    public String winnerPick(ArrayList names, int randomNumber){
        //takes the string at the index
        String winner = (String) names.get(randomNumber);
        //returns the name chosen
        return winner;
    }

    public static void main(String[] args) {
        Solution35 sol = new Solution35();
        //ask the user how many names they want to add
        int amountOfNames = Integer.valueOf(sol.readInput("How many people do you have?"));
        //create an arrayList
        ArrayList<String> names = new ArrayList<String>();
        //for a loop for however many names
        for (int i = 0; i <amountOfNames; i++){
            //add the name
            String name = sol.readInput("Name:");
            names.add(name);
        }
        int randomNumber = sol.rand.nextInt(amountOfNames);
        //calculate random number using amount of names
        //call winnerPick
        String winner = sol.winnerPick(names,randomNumber);
        System.out.printf("The Winner is %s",winner);


    }

}
