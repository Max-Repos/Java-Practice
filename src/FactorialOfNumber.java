import java.util.Scanner;

public class FactorialOfNumber {

    // print factorial of a given number N
    // For e.g for N = 5, factorial will be 5*4*3*2*1 = 120.

    // 1. take input from user
    // 2. Start multiplying input with factorial(input-1) --> factorial(1) = 1 and factorial(0) = 1;
    // 3. and store it in result
    // 4. print result

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = factorialByRecursion(input);
        // int result = factorialByIteration(input);

        System.out.println(result);

    }

    private static int factorialByIteration(int input) {

        int result =1;
        for (int i=1; i<=input; i++){

            result = result*i;
        }
        return result;
    }

    private static int factorialByRecursion(int input) {

        if(input == 0 || input == 1){
            return 1;
        }

        return input*factorialByRecursion(input-1);

    }


}
