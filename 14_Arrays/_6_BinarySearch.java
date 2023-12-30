public class _6_BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid inside the loop
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 12;
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("Key is not present in the array.");
        } else {
            System.out.println("Key is present at index: " + index);
        }
    }
}
