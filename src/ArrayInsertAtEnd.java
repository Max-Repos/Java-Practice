import java.util.Scanner;

public class ArrayInsertAtEnd {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase!=0){
            int length = sc.nextInt();
            int ele = sc.nextInt();

            int[] arr = new int[length];
            for(int i=0; i<length; i++){
                arr[i]= sc.nextInt();
            }

            int[] newArr = new int[length+1];
            for(int i=0; i<length+1; i++){
                if(i<length){
                    newArr[i]=arr[i];
                }
                else {
                    newArr[i]=ele;
                }
            }

            testcase--;

            for (int i = 0; i < length+1; i++) {
                System.out.print(newArr[i]+" ");
            }
            System.out.println();

        }

    }

}
