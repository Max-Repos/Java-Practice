import java.util.Scanner;

public class FunctionPractice3 {
    public void squirePrint(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public void trianglePrint(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        FunctionPractice3 functionPractice3 = new FunctionPractice3();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int rows = sc.nextInt();

        //functionPractice3.squirePrint(rows);

        functionPractice3.trianglePrint(rows);

    }
}
