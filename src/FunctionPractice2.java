import java.util.Scanner;

public class FunctionPractice2 {
    public int giveMax(int a, int b){

        return (Math.max(a, b));
    }

    public static void main(String[] args){

        FunctionPractice2 functionPractice2 = new FunctionPractice2();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(functionPractice2.giveMax(a,b));
    }
}
