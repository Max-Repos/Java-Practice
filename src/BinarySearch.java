import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println("target found at index: " + obj.findTarget(arr, target));
    }

    // the target is not found in the entire arr, then we return -1;
    // if i find target; i will return the index of the element in the array.
    // iteratively solve the binary search
    // [10, 20, 30, 40, 50, 90]
    public int findTarget(int[] arr, int target) {
        int startIdx = 0, endIdx = arr.length - 1;
        // search target in startIdx to endIdx
        while (startIdx <= endIdx) {
            // find mid index;
            int mid = startIdx + (endIdx - startIdx) / 2;
            // case1: if element at mid index is same as target; return mid index;
            if (arr[mid] == target) {
                return mid;
            }
            // case2 : if element at mid idx is greater than the target; then search the
            // element in start, mid-1;
            else if (arr[mid] > target) {
                endIdx = mid - 1;
            } else { // mid idx value is smaller than the target
                startIdx = mid + 1;
            }
        }
        return -1;
    }
}