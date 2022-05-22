import java.util.Scanner;

public class FindElementBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) arr[i] = sc.nextInt();

        int k =sc.nextInt();

        int pos = binarySearch(arr,len,k);

        System.out.println(pos);
    }

    private static int binarySearch(int[] arr,int len, int k) {

        int low=0;
        int high=len-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == k){
                return mid+1;
            }

            if(k < arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
