import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        if(isPalindrome(S)){
            System.out.println("is Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
