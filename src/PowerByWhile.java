import java.util.Scanner;

public class PowerByWhile {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(power(x,y));
        sc.close();
    }

    static int power(int x, int y) {

//        int result = 1;
//        while(y!=1){
//            if(y%2 == 0){
//                result = result*x*x;
//                y=y/2;
//            }
//            else{
//                result=result*x;
//                y=y-1;
//            }
//        }
//        return result;

        if(y == 1) return x;
        if(y%2 == 0) return x*x*power(x, y/2);

        return x * power(x, y-1);

    }


}
