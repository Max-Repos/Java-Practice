import java.util.Scanner;

public class PalindromeNumber {

//    Write a program to print if a given number is a palindrome number.
//    A palindrome number is a number that is same after it has reversed.
//    Given an input integer N, determine if it is a palindrome number or not.
//            E.g: 121, 1331 are palindrome numbers.

    // 1. Take input from user
    // 2. reverse given input
    // 3. compare reverse == input

    public static void main(String[] args) {

        // Enter the given number by user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reverse = reversedNumber(number);

        if(reverse == number){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }

    private static int reversedNumber(int number) {
        int reverse = 0;
        while (number!=0){
            int remainder = number%10;
            reverse = (reverse*10) + remainder;
            number = number/10;
        }
        // System.out.println(reverse);
        return reverse;

    }

}
