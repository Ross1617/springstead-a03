package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ross Springstead
 */
import java.util.Scanner;
import java.util.Map;
import java.util.*;
public class Solution40 {
    private static final Scanner in = new Scanner(System.in);

    private String readInput(String prompt) {
        //prompt the user
        System.out.println(prompt);
        //return the user input
        return in.nextLine();
    }

    public static void main(String[] args) {
        Solution40 sol = new Solution40();
        //create a hash map with the person class
        Map<Integer, Person> map = new Hashtable<>();
        //do this by manually typing in names
        //messed with the numbers to show that it works
        Person person1 = new Person("Jacquelyn", "Jackson", "DBA");
        Person person2 = new Person("Jake", "Jacobson", "Programmer");
        Person person3 = new Person("John", "Johnson", "Manager", "2016-12-31");
        Person person4 = new Person("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Person person5 = new Person("Sally", "Weber ", "Web Developer", "2015-12-18");
        Person person6 = new Person("Tou", "Xiong", " Software Engineer", "2016-10-05");
        //add all the people into the hash map
        //do this by manually typing in names
        map.put(1, person1);
        map.put(2, person2);
        map.put(3, person3);
        map.put(4, person4);
        map.put(5, person5);
        map.put(6, person6);
        // prompt the user for something they want to look up
        //save the string they enter
        String input = sol.readInput("What do you want to look up");
        //for everyone in the map
        //call findName function
        System.out.printf("Name                   Job          Seperation Date\n");
        for (int i = 1; i < 7; i++) {
            String ahh = map.get(i).findName(input);
        }


    }
}


