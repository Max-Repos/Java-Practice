import java.util.Scanner;

public class ImplementBubbleSort {
    /*
    Bubble Sort :
    It is a kind of sorting technique in which we pick pairs of element and arrange them in ascending order
     */

    //Implementation of bubble sort

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i] = sc.nextInt();

        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
