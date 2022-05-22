import java.util.Scanner;

public class ControlStructure {
    public static void main(String args[])
    {
       // int age = 25;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();


        if(age>18){
            System.out.println("Major");
        }
        else{
            System.out.println("minor");
        }
    }
}
