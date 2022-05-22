import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(isPallindrome(s)){
            System.out.println(s+" is Pallindrome");
        }else {
            System.out.println("Not pallindrome");
        }
    }

    private static boolean isPallindrome(String s) {

        boolean flag = false;
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i) == s.charAt(j)){
                flag = true;
            }else {
                flag = false;
                break;
            }
            i++;
            j--;
        }

        return flag;
    }
}
