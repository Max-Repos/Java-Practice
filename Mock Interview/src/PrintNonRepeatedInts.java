import java.util.Arrays;
import java.util.Scanner;

public class PrintNonRepeatedInts {
    /*
    1 2 1 2 3 4 5
    len = 7

    sort: 1 1 2 2 3 4 5
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i]=sc.nextInt();

        nonRepeatedIntegers(arr,len);
    }

    private static void nonRepeatedIntegers(int[] arr, int len) {
        Arrays.sort(arr);
        for(int i=0; i<len;i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
