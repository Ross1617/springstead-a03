package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ross Springstead
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Solution36 {
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
    public double average(ArrayList listOfNumbers, int length){
        //create a value
        double value = 0;

        //for every number in the array list add it up
        for(int i = 0; i<length; i++ ){
            value += (double) listOfNumbers.get(i);
        }
        value = value / length;
        //divide by the total amount of numbers
        //return the amount
        return value;
    }
    public double max(ArrayList listOfNumbers, int length){
        //for every index of the array list
        double maxValue = 0;
        for (int i =0; i< length; i++){
            //get the value at the index
            double value = (double) listOfNumbers.get(i);
            //check to see if the index is the largest
            if (value > maxValue){
                //if largest set it to
                maxValue = value;
            }
        }
        //return the largest
        return maxValue;
    }
    public double min(ArrayList listOfNumbers, int length){
        //for every index of the array list
        double minValue = 100000000;
        for (int i =0; i< length; i++){
            //check to see if the index is the smallest
            double value = (double) listOfNumbers.get(i);
            if (value < minValue){
                minValue = value;
            }
        }
        //return the smallest
        return minValue;
    }
    public double std(ArrayList listOfNumbers, int length){
        //calculate the sum of the arrayList by using a for loop
        double value = 0;
        double standardDeviation =0;
        for(int i = 0; i<length; i++ ){
            value += (double) listOfNumbers.get(i);
        }
        //calculate the mean
        double mean = value / length;
        //use a for loop that takes each index of the list and applies the formula
        for (int j=0; j<length; j++){
            double number =(double) listOfNumbers.get(j);
            standardDeviation += Math.pow(number- mean, 2);
        }
        standardDeviation = standardDeviation/length;
        standardDeviation = Math.sqrt(standardDeviation);

        //returns std
        return  standardDeviation;
    }

    public static void main(String[] args) {
        //create a while loop that runs until user enters done
        Solution36 sol = new Solution36();
        //creating array List
        ArrayList<Double> numbers = new ArrayList<Double>();
        String valueOfUser;
        double tester = 0;
        int length = 0;
        while (tester == 0){
            //prompt the user to enter number
            valueOfUser = sol.readInput("Enter a number");
            //if user enters done break the loop
            if (valueOfUser.equals("done")){
                //this will end the while loop
                tester = 1;
            }
            int number = 1;

            for(int i=0;i<valueOfUser.length();i++)
            {
                //making sure all the characters of the input are a number
                if(Character.isDigit(valueOfUser.charAt(i)))
                {
                    continue;
                }
                else{
                    //if not all number continue the while loop
                    number = 0;
                }
            }
            if(number == 1){
                //if all are numbers add it to the arrayList
                numbers.add(Double.parseDouble(valueOfUser));
                length ++;
            }
        }
        //call average, max, min, and std
        double average = sol.average(numbers,length);
        double max = sol.max(numbers,length);
        double min = sol.min(numbers,length);
        double std = sol.std(numbers,length);

        System.out.printf("Average: %.2f \nMax : %.2f \nMin : %.2f \nStandard Deviation : %.2f",average,max,min,std);

    }

}
