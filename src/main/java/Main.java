/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //first method
        /**int sum = sumOfNumbers(number);
         //System.out.println(sum);*/

        TwoMethodTimeComparison timeComparison = new TwoMethodTimeComparison();
        int number = timeComparison.getInputNumber();
        int number1 = timeComparison.gaussianSumOfNumbers(6);
        System.out.println(number);
        System.out.println(number1);

    }


}
