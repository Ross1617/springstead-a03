/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ross Springstead
 */
package baseline;
import java.util.Scanner;
public class Solution31 {
    private static final Scanner in = new Scanner(System.in);
    private  int readInput(String prompt){
        int number;
        do {
            //prompts the user for an input
            System.out.printf("%s",prompt);
            while (!in.hasNextInt()) {
                //prompts the user again for a new number
                String input = in.next();
                System.out.printf("\"%s\" is not a valid number.\n", input);
            }
            number = in.nextInt();
            //checks to see if the value is a positive number
        } while (number <= 0);
        //returns a positive number
        return number;
        }


    public double karvonenHeartRate(int pulse, int age){
        //use this formula that was provided
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        //printing formating
        System.out.printf("Intensity | Rate \n");
        //define intensity
        double intensity = .55;
        char percent = '%';
        //while loop that runs between 55 -95
        while(intensity<.96) {
            double targetHeartRate = (((220 - age) - pulse) * intensity) + pulse;
            double percentageIntensity = 100 * intensity;
            //prints the intensity as a % and rate
            System.out.printf("%.0f%c       | %.0f bpm\n", percentageIntensity, percent, targetHeartRate);
            intensity = intensity +.05;
        }
        //returns the last value for targetHeartRate
        return 1;
    }

    public static void main(String[] args) {
        Solution31 sol = new Solution31();
        //prompts the user for resting pulse
        int restingPulse = sol.readInput("Enter your resting pulse");
        //prompts the user for age
        int age = sol.readInput("Enter your age");
        //calls heartRate and prints the chart
        double value = sol.karvonenHeartRate(restingPulse,age);
    }
}
