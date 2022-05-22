import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class Assignment2<i, length> {
//    public static void main (String[] args) {
///*
//        Scanner sc = new Scanner(System.in);
//        int testCases = sc.nextInt();
//
//        while(testCases-- >0) {
//            int N = sc.nextInt();
//            int [] A = new int[N];
//            for(int i=0; i<A.length; i++) {
//                A[i] = sc.nextInt();
//            }
//
//            int i, first, second, third;
//
//
//
//            third = first = second = 1;
//            for (i = 0; i < N; i++) {
//
//                if (A[i] > first) {
//                    third = second;
//                    second = first;
//                    first = A[i];
//                }
//                else if (A[i] > second) {
//                    third = second;
//                    second = A[i];
//                }
//
//                else if (A[i] > third) {
//                    third = A[i];
//                }
//            }
//            System.out.println(first + " " + second + " " + third);
//
//        }
////*/
////            Scanner sc  = new Scanner(System.in);
////            System.out.println("Enter the size: ");
////            int n =sc.nextInt();
////
////            System.out.println("Enter the elements: ");
////            int[] a = new int[n];
////            for(int i=0; i<a.length; i++){
////                a[i]= sc.nextInt();
////            }
//////            int[] b = new int[n];
//////            int j = n;
//////            for(int i=0; i<a.length; i++){
//////                b[j-1]=a[i];
//////                j--;
//////            }
//////
//////            for(int i=0; i<b.length;i++){
//////                System.out.print(b[i]+" ");
//////            }
////        int temp;
////        for(int i =0; i<a.length; i++){
////            for (int j=0; j<a.length; j++){
////                if(a[i]<a[j]){
////                    temp = a[j];
////                    a[j]=a[i];
////                    a[i]= temp;
////                }
////            }
////        }
////        System.out.println(Arrays.toString(a));
//
//
//
//    }



    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int testcases = 0;
//        int max = 0;
//        int min = 0;
//        while (testcases < n) {
//
//            int length = sc.nextInt();
//
//            int[] arr = new int[length];
//            for (int i = 0; i < length; i++) {
//                arr[i] = sc.nextInt();
//            }
//
//            max = arr[0];
//            min = arr[0];
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > max) {
//                    max = arr[i];
//                } else if (arr[i] < min) {
//                    min = arr[i];
//                }
//            }
//            testcases++;
//        }
//
//        System.out.println(max + " " + min);

//        Scanner sc = new Scanner(System.in);
//        int length = sc.nextInt();
//        int[] nums = new int[length];
//        for(int i =0; i<length; i++){
//            nums[i]=sc.nextInt();
//        }
//
//        // `diff` stores the maximum value of `j-i` such that nums[j] > nums[i]
//        int diff = Integer.MIN_VALUE;
//
//        // base case
//        if (nums == null || nums.length == 0) {
//            System.out.println( diff);
//        }
//
//        int n = nums.length;
//
//        // create an auxiliary array of size `n`
//        int[] aux = new int[n];
//
//        // aux[j] stores the maximum element in subarray nums[j, n-1]
//        aux[n - 1] = nums[n - 1];
//        for (int j = n - 2; j >= 0; j--) {
//            aux[j] = Integer.max(nums[j], aux[j + 1]);
//        }
//
//        // Find maximum `j-i` using the auxiliary array
//        for (int i = 0, j = 0; i < n && j < n; )
//        {
//            if (nums[i] < aux[j])
//            {
//                diff = Integer.max(diff, j - i);
//                j++;
//            }
//            else {
//                i++;
//            }
//        }
//
//        System.out.println( diff);


//        Scanner sc = new Scanner(System.in);
//        int testCases = sc.nextInt();
//        while(testCases!=0){
//
//            int N = sc.nextInt();
//            int[] arr = new int[N];
//            for(int i=0; i<N; i++){
//                arr[i] = sc.nextInt();
//            }
//
//            int min = Math.abs(arr[0] - arr[1]);
//            for(int i=1; i<N-1; i++){
//                int diff = Math.abs(arr[i]-arr[i+1]);
//                if(diff<min){
//                    min = diff;
//                }
//            }
//
//            int circularDiff = Math.abs(arr[N-1]-arr[0]);
//            if(circularDiff < min){
//                min = circularDiff;
//            }
//            testCases--;
//            System.out.println(min);
//        }

//        Scanner sc=new Scanner (System.in);
//        int N=sc.nextInt();
//        int[] arr=new int[N];
//        for(long i=0;i<N;i++){
//            arr[(int) i]=sc.nextInt();
//        }
//        for(int i=0;i<N;i=i+2){
//            int product=(arr[i]*arr[i+1]);
//            System.out.print(product+" ");
//
//        }sc.close();

//        Scanner sc = new Scanner(System.in);
//        long N = sc.nextLong();
//        long length = 2*N;
//            long[] arr = new long[(int) length];
//
//            for (long i = 0; i < length; i++) {
//                arr[(int) i] = sc.nextInt();
//            }
//
//            long sum = 0;
//
//            for (long i = 0; i < length; i += 2) {
//                sum += arr[(int) (i + 1)];
//            }
//
//            System.out.println(sum);

//        Scanner sc=new Scanner (System.in);
//        long N=sc.nextLong();
//        long[] arr=new long[(int) N];
//        for(long i=0;i<N;i++){
//            arr[(int) i]=sc.nextLong();
//        }
//        long product =1;
//        for(long i=0;i<N;i=i+2){
//            product=(arr[(int) (i + 1)] * arr[(int) i]);
//            System.out.print(product+" ");
//
//        }sc.close();

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        int[] a = new int[N];
//        for(int i =0; i<N; i++){
//            a[i]=sc.nextInt();
//        }
//
//        int index = sc.nextInt();
//        int[] b = new int[N-1];
//
//        for(int i=0,k=0; i<a.length; i++){
//            if(a[i]==index){
//                continue;
//            }
//
//                b[k++] = a[i];
//        }
//
//        for(int i =0; i< b.length; i++){
//            System.out.print(b[i]+" ");
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for(int i=0;i<n;i++) {
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a);
//        int maxi = -1;
//        for(int i=0; i<n; i++) {
//            int cur = a[i] + a[n-i-1];
//            if(maxi<cur)
//                maxi = cur;
//        }
//        System.out.println(maxi);

//                Scanner sc = new Scanner(System.in);
//
//                int n = sc.nextInt();
//                // n=5
//                int[] arr = new int[n];
//                for(int i=0; i<n; i++){
//                    arr[i]= sc.nextInt();
//                    // arr[0] = 3
//                    // arr[1] = 2
//                    // arr[2] = 1
//                    // arr[3] = 1
//                    // arr[4] = 2
//                }
//
//                Map<Integer,Integer> map = new HashMap<>();
//                int count = 0;
//                boolean dup = false;
//                for(int i = 0; i < n; i++){
//                    // arr[0] = 3
//                    // arr[1] = 2
//                    // arr[2] = 1
//                    // arr[3] = 1
//                    // arr[4] = 2
//                    if(map.containsKey(arr[i])){
//                        // arr[3] = 1
//                        // count = 1
//                        // (1,2)
//                        // arr[4] =2
//                        // count=1
//                        // (2,2)
//                        count = map.get(arr[i]);
//                        map.put(arr[i], count + 1);
//                    }
//                    else{
//                        // (3,1)
//                        // (2,1)
//                        // (1,1)
//                        map.put(arr[i], 1);
//                    }
//                }
//
//                for(Map.Entry<Integer,Integer> entry : map.entrySet())
//                {
//                    // if frequency is more than 1
//                    // print the element
//                    if(entry.getValue() > 1){
//                        System.out.println(entry.getKey()+ " "+ entry.getValue());
//                        dup = true;
//                    }
//                }
//                // no duplicates present
//                if(!dup){
//                    System.out.println("-1");
//                }
            }

        }
