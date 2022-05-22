import java.util.HashSet;
import java.util.Scanner;

public class PairSum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i]=sc.nextInt();

        int sum = sc.nextInt();

        pairOfSum(arr,len,sum);
    }

    private static void pairOfSum(int[] arr, int len, int sum) {
        HashSet<Integer> hm = new HashSet<>();

        for(int i=0; i<len; i++){
            int temp = sum - arr[i];
            if(hm.contains(temp)){
                System.out.println(temp+" "+arr[i]);
            }
            hm.add(arr[i]);
        }
    }
}
