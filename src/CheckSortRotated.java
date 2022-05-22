import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckSortRotated {

    // 1. take testcases from user{
    // a. take length and array from user in testcasesblock {
    // i. now transever array --> if (a(i)<a(i+1)) --> x++ else --> y++
    // ii. if(x or y ==1) -->  1. if(a[length]<a[0])=x++ else y++ 2. if(x or y ==1)--> true
    //		else false
    // }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while (testcase != 0) {
            int N = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) a[i] = sc.nextInt();

            boolean x = Check(a, N);

            if (x) System.out.println("Yes");
            else System.out.println("No");

            testcase--;
        }
    }

    private static boolean Check(int[] a, int n) {

        int x = 0, y = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) x++;
            else y++;
        }

        if (x == 1 || y == 1) {
            if (a[n - 1] < a[0]) x++;
            else y++;

            if (x == 1 || y == 1) return true;
        }

        return false;

    }

    int binarySearch(long arr[], int l, int r, int T) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == T)
                return mid;
            if (arr[mid] > T)
                return binarySearch(arr, l, mid - 1, T);
            return binarySearch(arr, mid + 1, r, T);
        }
        return -1;
    }}
