import java.util.HashSet;
import java.util.Scanner;

public class Insertion {

//  abcabbccaaddd

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count=0;
        for(int i=0; i<line.length(); i++){
           for(int j=i; j<line.length(); j++){
               if(line.charAt(i) == line.charAt(j)){
                   count++;

               }
               System.out.print(line.charAt(i)+" "+count);
           }
        }

    }



}