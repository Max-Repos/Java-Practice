import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder str = new StringBuilder(input);
        str.reverse();
        System.out.println(String.valueOf(str));

    }
}
