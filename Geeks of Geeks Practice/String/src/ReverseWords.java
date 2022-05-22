import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        String c = reverseWords(S);

        System.out.println(c);
    }

    private static String reverseWords(String s) {

        // code here
        String ns = s.replace("."," ");
        String[] words = ns.split(" ");
        System.out.println(Arrays.toString(words));

        String rev = "";

        for(int i= words.length-1; i>=0; i--){
            if(i>0){
                words[i]+=".";
            }

            rev+=words[i];

        }

        return rev;

    }
}
