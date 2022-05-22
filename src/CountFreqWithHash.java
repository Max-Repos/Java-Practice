import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CountFreqWithHash {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n=5
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // arr[] = {1,1,1,2,2}
        }

//        Map<Integer,Integer> hm = new HashMap<>();
//        int count =0;
//        for(int i=0; i<n; i++){
//            // arr[0] = 1
//            // arr[1] = 1
//            // arr[2] = 1
//            // arr[3] = 2
//            // arr[4] = 2
//            if(hm.containsKey(arr[i])){
//                // arr[1] = 1
//                // count = 1
//                // (1,2)
//
//                // arr[2] = 1
//                // count = 2
//                // (1,3)
//
//                // arr[3] = 2
//                // count = 1
//                // (2,2)
//                count = hm.get(arr[i]);
//                hm.put(arr[i],count+1);
//            }
//            else{
//                hm.put(arr[i],1);
//                // (1,1)
//                // (2,1)
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//
//                // Print the key with max value
//                System.out.println(entry.getKey()+" "+entry.getValue());
//
//        }

        int res = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[res]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res = i;
                count = 1;
            }

        }
        count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[res]) {
                max = arr[res];
                count++;
            }
        }
        System.out.println("Element " + max + " occurs " + count + " times");
    }
}