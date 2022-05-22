import java.util.Scanner;

public class MinorMajarWithElseIf {
    public static void main(String args[]) {
        // int age = 25;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();


        if (age<10){
            System.out.println("Super Minor");
        }
        else if(age<20){
            System.out.println("minor");
        }
        else{
            System.out.println("Major");
        }

    }
}
