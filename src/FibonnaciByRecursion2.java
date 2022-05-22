import java.util.Scanner;

public class FibonnaciByRecursion2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(findFibonacci(index));

    }

    static int findFibonacci(int index) {

        //base condition
        if(index == 1){
            return 0;
        }
        if(index == 2){
            return 1;
        }

        //recursion logic
        return findFibonacci(index-1) + findFibonacci(index-2);

    }

}
