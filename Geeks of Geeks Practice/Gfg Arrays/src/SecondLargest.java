import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int x = secondLargest(arr, n );

        System.out.println(x);
    }

    private static int secondLargest(int[] arr, int n) {
            // code here
            Arrays.sort(arr);
            int ans =0;

            // if elements are same
            if(arr[n-1] == arr[0]){
                return -1;
            }

            int i=n-1;
            //if there are same largest elements            while(arr[i] == arr[i-1] && i>0){
                i--;

                return n;
            }


}
