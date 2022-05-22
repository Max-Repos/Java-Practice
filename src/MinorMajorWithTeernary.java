import java.util.Scanner;

public class MinorMajorWithTeernary {
    public static void main(String args[])
    {
        // int age = 25;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();


        System.out.println(age>18? "Major" : "Minor");

    }
}
