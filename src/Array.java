import java.util.Scanner;

public class Array {

    public static void main(String[] args){

//        Scanner sc  = new Scanner(System.in);
//        //Array Input
//        System.out.println("Enter the length of Array:");
//        int length = sc.nextInt();
//        int[] arr = new int[length];
//        for(int i =0; i< arr.length; i++ ){
//            arr[i]= sc.nextInt();
//        }
//
//        //Enter number whose position we want to find
//        System.out.println("Enter number to find: ");
//        int x =sc.nextInt();
//
//        //result
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==x){
//                System.out.println("The number is "+arr[i]+ " at "+i+" position.");
//            }
//        }

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr =new int[length];
        for(int i =0; i<length; i++){
            arr[i] = sc.nextInt();
        }

        int x =sc.nextInt();
        for(int i =0; i<arr.length+1; i++){

                arr[i]=arr[i+1];

        }

        for (int i=0; i<arr.length+1; i++){
            System.out.print(arr[i]+" ");
        }
    }



}
