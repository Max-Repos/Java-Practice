import java.util.Arrays;
import java.util.Scanner;

public class CountDuplicate {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i]= sc.nextInt();
        }

        int[] brr = new int[length];
        int count = 0;

        for(int i=0; i<length; i++){
            for(int j=i+1; j<length;j++){
                if(arr[i]==arr[j]){
                    brr[i]=arr[j];
                    count++;
                    break;
                }
            }
        }
        Arrays.sort(brr);
        for(int i=0; i< brr.length; i++){
            if(brr[i]!=0) System.out.println(brr[i]+" "+count);
        }

    }

}
