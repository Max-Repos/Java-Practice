import java.util.Scanner;

public class SumArray {

    public static void main(String[] args){

        System.out.println("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Enter the array element: ");
        int[] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }

        //Sum of array
        int result = 0;
        for(int i =0; i<arr.length; i++){
            result = result + arr[i];
        }
        System.out.println("The sum of array: "+result);

    }

}
