package baseline;
import static java.lang.Math.*;
public class PaymenetCalculator {
    //defining all the stuff
    private double months;
    private double dailyRate;
    private double balance;
    private double monthlyPayment;

    PaymenetCalculator( int dailyRate,int balance, int monthlyPayment){
        //takes the input and initializes all the private variables

    }

    public double calculateMonthsUntilPaidOff(){
        //try and use the formula to solve
        //-(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //return amount of months

    }
}
