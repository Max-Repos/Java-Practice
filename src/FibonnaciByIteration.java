import java.util.Scanner;

public class FibonnaciByIteration {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(findFibonacci(index));

    }

    static int findFibonacci(int index){

        int[] fibo = new int[index];
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i =2; i<=index; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return fibo[index];

    }

}
