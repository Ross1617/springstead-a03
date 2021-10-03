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
        this.months = 0;
        this.dailyRate = dailyRate /36500;
        this.balance = balance;
        this.monthlyPayment = monthlyPayment;
    }

    public double calculateMonthsUntilPaidOff(){
        //trying to calulate this
        //System.out.printf("%f",monthlyPayment);
        //-(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //double value0 = ( Math.pow((1 + dailyRate), 30));
        //double value1 = balance/monthlyPayment;
        //double value2= 1+ (value0 * value1);
        //double value1= Math.log10(1 + ((balance/monthlyPayment) *
        //System.out.printf("%f %f %f ",value0,value1,value2);

        //this should work but doesn't work because calculating a small number to the 30^ truncates it

        months = (-(1/30) * Math.log10(1 + ((balance/monthlyPayment) * (1 - (Math.pow((1 + dailyRate), 30))))) )/ Math.log10(1 + dailyRate);;

        return  months;
    }
}
