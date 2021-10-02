package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ross Springstead
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Solution34 {
    private static final Scanner in = new Scanner(System.in);
    private String readInput(String prompt){
        //prompt the user
        System.out.println(prompt);
        //return the user input
        return in.nextLine();
    }
    public ArrayList arrayListDelete(ArrayList listOfNames,String name){
        //take the string name and delete it from the arrayList
        listOfNames.remove(name);
        return listOfNames;
        //return the new ArrayList
    }

    public static void main(String[] args) {
        Solution34 sol = new Solution34();
        //create the array list with all the names
        ArrayList<String> names = new ArrayList<String>();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        //print the array list
        System.out.printf("The employees are:\n");
        for(int i=0; i<5;i++){
            System.out.printf("%s\n",names.get(i));
        }

        //prompt the user what name they want deleted
        String removeName = sol.readInput("What name do you want to remove?");
        names = sol.arrayListDelete(names,removeName);
        //print the new array list
        System.out.printf("The employees are:\n");
        for(int i=0; i<4;i++){
            System.out.printf("%s\n",names.get(i));
        }
    }

}
