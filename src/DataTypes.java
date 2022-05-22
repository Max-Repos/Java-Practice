import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args){

//        Scanner sc = new Scanner(System.in);
//        int in = sc.nextInt();
//        long lg = sc.nextLong();
//        float f = sc.nextFloat();
//        double d = sc.nextDouble();
//        char c = sc.next().charAt(0);
//
//        System.out.println(in);
//        System.out.println(lg);
//        System.out.println(f);
//        System.out.println(d);
//        System.out.println(c);

        Scanner sc = new Scanner(System.in);

//        boolean i;
//        while(i = true){
//            int n = sc.nextInt();
//            System.out.print(n+" ");
//            if(n==0){
//                break;
//            }
//        }
//        int n = sc.nextInt();
//
//        switch(n){
//            case 1: return "one"; break;
//            case 2: return "two"; break;
//            case 3: return "three"; break;
//            case 4: return "four"; break;
//            case 5: return "five"; break;
//            default: return "Greater than 5";
//
//        }
//    }
//        Scanner sc = new Scanner(System.in);
//        long d =sc.nextLong();
//        long q = sc.nextLong();
//        int div=0;
//        try{
//            div= (int) (d/q);
//            System.out.println(div);
//        }catch(ArithmeticException ex)
//        {
//            System.out.println(-1);
//        }
//
//        sc.close();
        String S = sc.nextLine();
        int N = sc.nextInt();

        System.out.println(StringToInt(S));
        System.out.println(IntToString(N));

    }

    static int StringToInt(String S){
//Enter your code here
        int N = StringToInt(S);
        return N;
    }

    static String IntToString(int N){
//Enter your code here
        String S = IntToString(N);
        return S;
    }

}
