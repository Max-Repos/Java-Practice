import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i]=sc.nextInt();


        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<len; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else {
                hm.put(arr[i], 1);
            }
        }


        for(Map.Entry<Integer,Integer> x : hm.entrySet()){
            if(x.getValue() == 1){
                System.out.print(x.getKey()+" ");
            }
        }
    }
}
