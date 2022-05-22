import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr = new int[length];
        for(int i = 0; i<length; i++){
            arr[i]= sc.nextInt();
        }

        int sum = 0;
        for(int i =0; i<length; i++){
            sum = sum + arr[i];
        }
        int average = sum/length;

        System.out.println("The sum is "+ sum);
        System.out.println("The Average is "+average);

    }

}
