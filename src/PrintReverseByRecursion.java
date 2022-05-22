import java.util.Scanner;

public class PrintReverseByRecursion {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversedNum = printReverse(num, 0);
        System.out.println(reversedNum);
        sc.close();

    }

    static int printReverse(int num, int result){


        if(num == 0){
            return result;
        }

        else {
            int remainder = num%10;
            result = result * 10 + remainder;
            num = num/10;
            return printReverse(num, result);
        }
    }
}
