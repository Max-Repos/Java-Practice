import java.util.HashSet;
import java.util.Scanner;

public class PosNeg {
    /*
    arr = 5 1 2 3 -1 6 -5 -2
    len = 8

    hm = [ 5 1 2 3 6 2 ]
    -1 -5 -2

     */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i]=sc.nextInt();

        pairs(arr, len);

    }

    private static void pairs(int[] arr, int len) {
        HashSet<Integer> hm = new HashSet<>();

        for(int i=0; i<len; i++){
            if(arr[i]<0){
                hm.add(arr[i]);
            }
        }

        for(int i=0; i<len; i++){
            if(arr[i]>=0){
                if(hm.contains(-arr[i])){
                    System.out.println(arr[i]+" "+-arr[i]);
                }
            }
        }
    }
}
