import java.util.Arrays;
import java.util.Scanner;

public class SwapIt {

    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr = new int[length];
        for(int i=0; i<length;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0; i<length+1; i++){
            for(int j =i; j<length; j++){
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<length+1; i++){
            if(arr[i]>=arr[i+1]){
                System.out.println("NO");
                break;
            }
            else{
                System.out.println("YES");
                break;
            }

        }

//        Scanner sc  = new Scanner(System.in);
//        int length = sc.nextInt();
//
//        int[] arr = new int[length];
//        for(int i=0; i<length;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        int temp=arr[0];
//        arr[0]=arr[length-1];
//        arr[length-1]=temp;
//
//
//        for(int i=0; i<length; i++){
//            if(arr[i]>=arr[i+1]){
//                System.out.println("NO");
//                break;
//            }
//            else{
//                System.out.println("YES");
//                break;
//            }
//        }

    }

}

