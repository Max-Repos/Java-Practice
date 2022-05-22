import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertEle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i =0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Initial array:" + Arrays.toString(arr));
        int posi = sc.nextInt();
        int ele = sc.nextInt();

        int[] new_arr = new int[len+1];
        for(int i=0; i<len+1; i++){
            if(i<posi){
                new_arr[i]=arr[i];
            }
            else if(i==posi){
                new_arr[i]=ele;
            }
            else{
                new_arr[i]=arr[i-1];
            }
        }

        System.out.println("Final array:" + Arrays.toString(new_arr));
    }

}
