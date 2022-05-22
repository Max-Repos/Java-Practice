import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here



       int x = intdo(4);


        System.out.println(x);

    }

    private static int intdo(int i) {
        if(i<=1){
            return i;
        }

        return i*intdo(i-1);
    }


}