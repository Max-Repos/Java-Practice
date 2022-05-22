import java.util.Scanner;

public class PrimeNumber {

    static int i=2;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }

    private static boolean isPrime(int num) {


        if(num == 0 || num == 1){
            return false;
        }

        if(num == i){
            return true;
        }

        if(num%i== 0){
            return false;
        }
        i++;

        return isPrime(num);
    }

}
