import java.util.Scanner;

public class SubstringAll {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i=0; i<input.length(); i++){
            for(int j=i+1; j<=input.length(); j++){
                System.out.print(input.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
