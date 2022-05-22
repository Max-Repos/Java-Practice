import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.print("Even");
        }
        if(isOdd(n)){
            System.out.print("Odd");
        }
    }

    private static boolean isOdd(int n) {
        if(n%2 != 0){
            return true;
        }
        return false;
    }

    private static boolean isEven(int n) {
        if(n%2 == 0){
            return true;
        }
        return false;
    }
}
