import java.util.Scanner;

public class ArrayDelEle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr = new int[length];
        for(int i=0; i<length;i++){
            arr[i]= sc.nextInt();
        }

        int ele = sc.nextInt();

        for(int i=0; i< arr.length; i++){
            if(ele == arr[i]){
                for(int j=i; j< arr.length-1; j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }

        for(int i=0; i< arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }

    }

}
