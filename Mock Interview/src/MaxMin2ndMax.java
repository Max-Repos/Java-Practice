import java.util.Arrays;
import java.util.Scanner;

public class MaxMin2ndMax {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i] = sc.nextInt();

        int max = maxElement(arr,len);
        int min = minElement(arr,len);
        int smax = secondMax(arr,len);

        System.out.println(max+" "+min+" "+smax);
    }

    private static int secondMax(int[] arr, int len) {
        Arrays.sort(arr);
        return arr[len-2];
    }

    private static int minElement(int[] arr, int len) {
        int min=arr[0];
        for(int i=1; i<len; i++){
            if(min>arr[i]) min = arr[i];
        }
        return min;
    }

    private static int maxElement(int[] arr, int len) {
        int max =arr[0];
        for(int i=1; i<len; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
