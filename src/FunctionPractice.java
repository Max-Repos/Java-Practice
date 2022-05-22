import java.util.Scanner;

public class FunctionPractice {

//    public boolean checkEven(int num){
//        return num % 2 == 0;
//    }

    public void createPattern(int rows){
        for(int i =rows-1; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){

        FunctionPractice functionPractice = new FunctionPractice();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();

        functionPractice.createPattern(a);
        //System.out.println(functionPractice.createPattern(a));

    }
}
