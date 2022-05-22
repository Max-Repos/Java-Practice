import java.util.Scanner;

public class ArrayInsertAtIndex {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while(testcase!=0) {
            int length = sc.nextInt();

            int ele = sc.nextInt();

            int index = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length-1; i++) {
                arr[i] = sc.nextInt();
            }

            int[] newArr = new int[length+1];
            for(int i=0; i<length+1; i++){
                if(i<index){
                    newArr[i]=arr[i];
                }
                else if(i==index){
                    newArr[i]=ele;
                }
                else{
                    newArr[i]=arr[i-1];
                }
            }


            testcase--;
            for (int i = 0; i < length; i++) {
                System.out.print(newArr[i]+" ");
            }
        }


    }

}
