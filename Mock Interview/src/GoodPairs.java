import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoodPairs {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) arr[i]= sc.nextInt();

        int count = goodPairs(arr, len);
        System.out.println(count);
    }

    private static int goodPairs(int[] arr, int len) {
        /*
        1 1 2 3 2 3 4

        hm = (1,2) (2,2) (3,2) (4,1)
        count = 3
         */
        Map<Integer,Integer> hm = new HashMap<>();
        int count=0;
        for(int i=0;i<len; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
                count++;
            }else {
                hm.put(arr[i],1);
            }
        }
        return count;
    }

//    private static int goodPairs(int[] arr, int len) {
//
//        int count=0;
//        for(int i=0; i<len; i++){
//            for(int j=i+1; j<len; j++){
//                if(arr[i] == arr[j] && i<j){
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }
}
