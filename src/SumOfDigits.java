import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigits {
    private static int[] arr;

    // find the sum of digits of number

    // 1. Take input from user
    // 2. convert number into digit
    // 3. calculate sum of each digit of number
    // 4. print sum

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int sum = SumOfDigits(input);

        System.out.println(sum);
    }

    private static int SumOfDigits(int input) {

        // giver input =123
        int sum=0;
        int x =input;
        while(x>0){
            input= x%10;
            sum += input;
            x = x/10;
        }
        return sum;
    }


}
