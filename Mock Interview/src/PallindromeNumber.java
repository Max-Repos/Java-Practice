import java.util.Scanner;

public class PallindromeNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPallindrome(num)){
            System.out.println("is Pallindrome");
        }else {
            System.out.println("Not Pallindrome");
        }
    }

    private static boolean isPallindrome(int num) {

        String s = String.valueOf(num);
        boolean flag = false;
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i) == s.charAt(j)){
                flag = true;
            }
            else {
                flag = false;
                break;
            }
            i++;
            j--;
        }

        return flag;
    }
}
