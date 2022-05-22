import java.util.Scanner;

public class ArmstrongNumber {

//    Write a program to determine if a given number is Armstrong number

    // 1. take input from user
    // 2. put digits of input in array
    // 3. calculate sum of cube of each element in array
    // 4. compare sum with user input


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean isArmstrong = isArmstrong(input);
        if(isArmstrong) {
            System.out.println("isArmstrong "+input);
        } else {
            System.out.println("not Armstrong");
        }
    }

    static boolean isArmstrong(int input){
        //153 = 1*1*1 + 5*5*5 + 3*3*3
        int[] digits = new int[3];
        digits = getdigit(input);
        // System.out.println(digits);
        // digit = [1,5,3]
        int sum =0;
        for(int i=0; i<digits.length; i++){
            sum += Math.pow(digits[i],3);
        }
        if(input == sum){
            return true;
        }else{
            return false;
        }
    }

    static int[] getdigit(int input){
        int[] arr = new int[3];

        for(int i =0; i< arr.length;i++){
            arr[i] = input%10;
            input = input/10;
        }
        return arr;
    }
//    public static void main(String args[]) throwsIOException {
//        int input = 153;
//        boolean isArmstrong = isArmstrongNumber(input);
//        if(isArmstrong) {
//            System.out.println("isArmstrong "+input);
//        } else {
//            System.out.println("not Armstrong");
//        }
//    }
//
//    public static boolean isArmstrongNumber(int number) {
//        // ...
//        // 153 = 1*1*1 + 5*5*5 + 3*3*3
//        int[] digitsArr = new int [3];
//        digitsArr = getDigits(number);
//        // digitsArr = [1,5,3];
//        int sum = 0;
//        for(int i = 0; i < digitsArr.length; i++) {
//            int element = digitsArr[i];
//            int product = (int) Math.pow(element, 3);
//            sum = sum + product;
//        }
//        if(sum == number) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static int[] getDigits(int number) {
//        // ...
//        // 1. Apply your brain (15 mins)
//        // 2. Google the problem :: How to get the digits of a number in java // Geeks for geeks and stackoverflow
//        // 3. Ask you friends and colleagues. Ask on slack general channel.
//        // 4. Ask mentor about the problem.
//
//         return [1,5,3];
//
//    }

}
