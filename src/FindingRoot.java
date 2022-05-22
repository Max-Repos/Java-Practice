import java.util.Scanner;

public class FindingRoot {


        //find roots of a quadratic equation
        //float values a, b, c of ax^2+bx+c
        //root = (-b _+ sqrt(discriment))/2a where discriment=b^2-4ac
        // Case 1: If discriminant is positive. Then there are two real distinct roots given by.
        // root1 = (-b + sqrt(discriminant)) / (2 * a);
        // root2 = (-b - sqrt(discriminant)) / (2 * a);
        // Case 2: If discriminant is zero. Then it have exactly one real root given by.
        // root1 = root2 = -b / (2 * a);
        // Case 3: If discriminant is negative. Then it will have two distinct complex roots given by.
        // root1 = root2 = -b / (2 * a);
        // imaginary = sqrt(-discriminant) / (2 * a);

        // 1. take inputs a, b, c from user
        // 2. get discriment =b^2-4ac
        // 3 switch(discriment>0) then
        //      case 1 : calculate root1 =(-b + sqrt(discriminant)) / (2 * a); and root2=(-b - sqrt(discriminant)) / (2 * a);
        //      case 0 : switch(discriment==0)
        //              case 1 : calculate root1 and root2
        //              case 0 : calculate roots and imaginary
        // 4. print root1 and root2


        public static void main (String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            double root1, root2;

            int discriment = b*b-4*a*c;

            int D = Check(discriment);

            switch(D){
                case 1 :
                    root1 = (-b + Math.sqrt(discriment))/(2*a);
                    root2 = (-b + Math.sqrt(discriment))/(2*a);
                    System.out.println(String.format("%.2f",root1));
                    System.out.println(String.format("%.2f",root2));
                    break;
                case 0 :
                    root1 = -b / (2 * a);
                    root2 = -b / (2 * a);
                    System.out.println(String.format("%.2f",root1));
                    System.out.println(String.format("%.2f",root2));
                    break;
                case -1 :
                    root1 = -b / (2 * a);
                    root2 = -b / (2 * a);
                    double imaginary = Math.sqrt(-discriment)/(2 * a);
                    System.out.println(String.format("%.2f",root1) + " + i"+String.format("%.2f",imaginary));
                    System.out.println(String.format("%.2f",root1) + " - i"+String.format("%.2f",imaginary));
                    break;
            }

        }

        private static int Check(int discriment) {
            if(discriment>0) return 1;
            else if(discriment==0) return 0;
            else return -1;
        }
    }


