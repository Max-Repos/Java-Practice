import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr = new int[length];
        for (int i =0;i<length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The sourse array: "+ Arrays.toString(arr));

        int[] new_arr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            new_arr[i]=arr[i];
        }
        System.out.println("The new array :"+ Arrays.toString(new_arr));

    }


}
