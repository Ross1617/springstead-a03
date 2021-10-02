package baseline;
import java.util.Scanner;
public class Solution30 {
    private static final Scanner in = new Scanner(System.in);
    private int readInput(String prompt){

        //prompts user with string that was provided
        System.out.println(prompt);
        //returns the users next line
        return in.nextInt();
    }
    public int tableMaker(int height, int width){
        //takes the height and does a for loop for it
        int counter = 1;
            //takes the width and does another for loop
            for (int i = 0; i < height; i++){
                for(int j =0 ; j< width;j++){
                    //prints the number of counter
                    if (counter < 10){
                        System.out.printf("%d    ",counter);
                    }
                    else if (9<counter && counter<100){
                        System.out.printf("%d   ",counter);
                    }
                    else{
                        System.out.printf("%d  ",counter);
                    }

                    //increases counter by 1

                    counter++;
                }
                //prints blank line
                System.out.printf("\n");
            }



        //returns 1 if sucessfull
        return 1;
    }

    public static void main(String[] args) {
        //promtps the user for a number and saves the value
        Solution30 sol = new Solution30();

        //prompts the user for another number and saves the value
        int num1 = sol.readInput("Give me the height");
        int num2 = sol.readInput("Give me the width");
        //calls tableMaker with the two values
        sol.tableMaker(num1, num2);

    }
}
