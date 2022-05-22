import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {

    // remove duplicate from array of integer

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i]=sc.nextInt();

        removeDuplicate(arr,len);
    }

    private static void removeDuplicate(int[] arr, int len) {
        Arrays.sort(arr);

        int[] temp = new int[len];
        int k=0;
        for(int i=0; i<len-1; i++){
            if(arr[i]!=arr[i+1]){
                temp[k++] = arr[i];
            }
        }

        temp[k++] = arr[len-1];

        for(int i=0; i<k; i++) arr[i] = temp[i];

        for(int i=0; i<k; i++) System.out.print(arr[i]+" ");
    }
}
