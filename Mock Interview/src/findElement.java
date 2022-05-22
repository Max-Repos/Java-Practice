import java.util.Scanner;

public class findElement {

    // Find an element in Array

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i]= sc.nextInt();
        int k =sc.nextInt();

        for (int i=0; i<len; i++){
            if(arr[i]==k){
                System.out.print(i+" ");
            }
        }
    }
}
