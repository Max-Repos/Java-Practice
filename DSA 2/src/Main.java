import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
public class Main {
    /*
    Given an array which may contain duplicates, print all elements sorted in the increasing order by their frequencies.

Examples:

Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 20, 10, 5

Input : arr[] = {10, 20, 20}
Output : 20, 10


     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i] = sc.nextInt();

        int max=0;
        int result=0;
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0; i<len; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]+1));
            }else {
                hm.put(arr[i],1);
            }
        }

        int[] temp = new int[len];

        for(Map.Entry<Integer,Integer> val : hm.entrySet()){

        }

        System.out.println(result);
    }
}
/*
10, 20, 20, 10, 10, 20, 5, 20
 i
hm = (10,4) (20,4) (5,1)

1 4 4

    get(arr[i])

 */