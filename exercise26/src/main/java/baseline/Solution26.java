/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ross Springstead
 */
package baseline;
import java.util.Scanner;
public class Solution26 {
    private static final Scanner in = new Scanner(System.in);
    private int readInt(String prompt){
        //prompts the user for a string
        System.out.println(prompt);
        //returns the user next line
        return in.nextInt();
    }
    public static void main(String[] args) {
        Solution26 sol = new Solution26();
        //prompts the user for their balance, rates, and payments
        int balance = sol.readInt("What is your balance?");
        int dailyRates = sol.readInt("What is the APR on the card (as a percent)?");
        int monthlyPayment = sol.readInt("What is the monthly payment you can make?");
        //call the payment class and initialize all the values
        //call the calculatemonthsuntilpaidoff
        PaymenetCalculator payment = new PaymenetCalculator(dailyRates,balance,monthlyPayment);
        double months = payment.calculateMonthsUntilPaidOff();
        //print the output
        System.out.printf("%f",months);





    }

}
