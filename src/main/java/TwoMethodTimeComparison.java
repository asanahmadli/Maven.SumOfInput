import java.util.Scanner;

public class TwoMethodTimeComparison {

    public int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        SumOfNnumbers sumOfNnumbers = new SumOfNnumbers();
        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        long elapsedTime, startTime, endTime;
        int sum = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sum = sumOfNnumbers.sumOfNumbers(num);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        // Closing Scanner after the use
        System.out.println("Loop1 elapsed time equal to " + elapsedTime);
        scan.close();
        return sum;
    }


    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        long elapsedTime, startTime, endTime;
        startTime = System.currentTimeMillis();
        int sum = 0;
        sum = n * (n + 1) / 2;
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Loop 2 elapsed time equal to " + elapsedTime);
        return sum;
    }

    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
