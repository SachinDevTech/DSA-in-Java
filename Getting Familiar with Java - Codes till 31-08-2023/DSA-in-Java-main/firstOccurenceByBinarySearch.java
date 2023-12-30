public class firstOccurenceByBinarySearch {
    public static int firstOccurenceBS(int arr[], int key, int start, int end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] == arr.length) {
            return mid;

        }
        if (arr[start] == key) {
            return start;

        } else {
            return firstOccurenceBS(arr, key, start + 1, end);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 3, 4, 5, 60, 75 };
        int key = 10;
        int starting_Address = 0;
        int ending_Address = arr.length - 1;
        System.out.println("Present at: " + firstOccurenceBS(arr, key, starting_Address, ending_Address));
        // if present the it will return index
        // if not present then it will return -1

    }
}
