import java.util.Arrays;
import java.util.Scanner;

public class MaxFreq {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);

//        System.out.println(Arrays.toString(arr));

        int curr_count=1;
        int max_count=1;
        int res=arr[0];

        for(int i=1; i<len; i++){
            if(arr[i]==arr[i-1]){
                curr_count++;
            }
            else{
                if(curr_count>max_count){
                    max_count=curr_count;
                    res = arr[i-1];
                }
                curr_count=1;
            }
        }

        if(curr_count>max_count){
            max_count=curr_count;
            res = arr[len-1];
        }

        System.out.println(res);

    }

}
