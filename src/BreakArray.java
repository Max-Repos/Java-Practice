import java.util.Arrays;
import java.util.Scanner;

public class BreakArray {

    public static void main(String[] args){

        // Your code here
        // N =length
        // index --> 1.... N and divide array into 2part
        // find maximum sum of both sub array
        // add both values

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i=0; i<N; i++){
            array[i]= sc.nextInt();
        }

        // Divide array into 2 parts
        int[] arr1 = Arrays.copyOfRange(array,0,array.length/2);
        int[] arr2 = Arrays.copyOfRange(array, array.length/2,array.length);

        // System.out.println(Arrays.toString(arr1) +" "+ Arrays.toString(arr2));

        // find maximum sum of arr1
        int max1 = Integer.MIN_VALUE;
        int sum1=0;
        for(int i=0; i<arr1.length; i++){

            sum1 += arr1[i];
            if(max1<sum1) max1=sum1;
            if(sum1<0) sum1=0;
        }

        // System.out.println(max1);

        // find maximum sum of arr2
        int max2 = Integer.MIN_VALUE;
        int sum2 =0;
        for(int i=0; i<arr2.length; i++){
            // i =0 --> sum2= -1
            // i =1 --> sum2= -1
            sum2 += arr2[i];
            // max2 =0
            if(max2<sum2) max2=sum2;
            if(sum2<0) sum2=0; // sum2=0
                               // sum2=0
        }
        // System.out.println(max2);

        //Addition of both maximum sum
        System.out.println(max1 + max2);


    }

}
