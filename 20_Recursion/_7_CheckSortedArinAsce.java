public class _7_CheckSortedArinAsce {
    public static boolean isArrSorted(int arr[], int len, int i) {
        if (len <= 0 || len == 1) {
            return true; // Array with 0 or 1 element is considered sorted
        }

        if (i >= len) {
            return true; // Reached the end of the array without finding any unsorted pair
        }

        if (arr[i] < arr[i - 1]) {
            return false; // Array is not sorted in ascending order
        }

        return isArrSorted(arr, len, i + 1); // Recursively check the next elements
    }

    public static void main(String[] args) {
        // int arr[] = { 12, 11, 23, 2, 4, 2, 5 };
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int len = arr.length;
        int i = 1; // Start comparing from the second element
        boolean ans = isArrSorted(arr, len, i);
        System.out.println("Is array sorted: " + ans);
    }
}
