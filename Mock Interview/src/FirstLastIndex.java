import java.util.Scanner;

public class FirstLastIndex {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i]=sc.nextInt();

        int key = sc.nextInt();

        firstlast(arr,len,key);
    }

    private static void firstlast(int[] arr, int len, int key) {
        int start =0;
        for(int i=0; i<len; i++) {
            if(key == arr[i]){
                    start =i;
                    break;
            }
        }
        int end = 0;
        for(int i=len-1; i>=start; i--){
            if(key == arr[i]){
                end =i;
                break;
            }
        }

        System.out.println(start+" "+end);
    }
}
