import javax.swing.text.Style;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.*;

class Main{


    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int x =power(4,3);
        out.println(x);
    }


        static int power(int a, int b){

        if(b == 1){
            return b;
        }

        return a*power(a,b-1);
        }






    }
