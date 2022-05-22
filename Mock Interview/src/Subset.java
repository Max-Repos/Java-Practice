import java.util.HashSet;
import java.util.Scanner;

public class Subset {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        for(int i=0; i<len1; i++) arr1[i]=sc.nextInt();

        int len2 = sc.nextInt();
        int[] arr2 = new int[len2];
        for(int i=0; i<len2; i++) arr2[i]=sc.nextInt();

        if(isSubset(arr1,arr2,len1,len2)){
            System.out.println("Subset");
        }else {
            System.out.println("Not Subset");
        }
    }

    private static boolean isSubset(int[] arr1, int[] arr2, int len1, int len2) {
        HashSet<Integer> hm = new HashSet<>();
        for(int i=0; i<len1; i++){
            hm.add(arr1[i]);
        }

        for(int i=0; i<len2; i++){
            if(!hm.contains(arr2[i])){
                return false;
            }
        }

        return true;
    }
}
