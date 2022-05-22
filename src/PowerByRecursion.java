import java.util.Scanner;

public class PowerByRecursion {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(power(x,y));
        sc.close();
    }

    static int power(int x, int y){
        if(y == 0){
            return 1;
        }

        return x * power(x, y-1);
    }

}
