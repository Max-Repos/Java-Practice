import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] arggs){

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if(isAnagram(a,b)){
            System.out.println("is Anagram");
        }else{
            System.out.println("not Anagram");
        }
    }

    private static boolean isAnagram(String a, String b) {

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        if(x.length!= y.length){
            return false;
        }

        Arrays.sort(x);
        Arrays.sort(y);

        for(int i=0; i< x.length; i++){
            if(x[i]!=y[i]){
                return false;
            }
        }

        //System.out.println(x);

        return true;
    }
}
