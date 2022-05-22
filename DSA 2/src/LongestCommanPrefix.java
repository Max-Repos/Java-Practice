import java.util.Scanner;

public class LongestCommanPrefix {

    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        int len = sc.nextInt();
        String[] str = new String[len];
        for(int i=0; i<len; i++) str[i] = sc.next();


        String result = prefix(str,len);

        System.out.println(result);
    }

    private static String prefix(String[] str, int len) {

        String prefix =str[0];
        for(int i=0; i<len; i++){
            prefix = compare(prefix, str[i]);
        }
        return prefix;
    }

    private static String compare(String s1, String s2) {

        String res = "";
        for(int i=0, j=0; i<s1.length() && j<s2.length(); i++, j++){
            if (s1.charAt(i) != s2.charAt(j)) {
                break;
            }
            res += s1.charAt(i);
        }
        return res;
    }
}
