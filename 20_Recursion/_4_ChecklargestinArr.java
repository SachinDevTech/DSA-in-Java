public class _4_ChecklargestinArr {
    public static void main(String[] args) {
        int arr[] = { 10, 30, 15, 21, 44, 26, 24, 17, 18 };
        int len = arr.length - 1;
        int i = 0;
        int ans = checkLargest(arr, len, i, Integer.MIN_VALUE); // Pass Integer.MIN_VALUE initially
        System.out.println("The largest in this array is: " + ans);
    }

    public static int checkLargest(int arr[], int len, int i, int largest) {
        if (i > len) {
            return largest; // Return the largest when recursion terminates
        }

        if (arr[i] > largest) {
            largest = arr[i]; // Update largest if a larger value is found
        }

        // Return the result of recursive call
        return checkLargest(arr, len, i + 1, largest);
    }
}
