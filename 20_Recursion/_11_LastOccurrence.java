public class _11_LastOccurrence {
    public static int lastOccurrence(int arr[], int key, int i) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccurrence(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 1, 2, 3, 0, 4, 5, 6, 5, 5, 5 }, key = 5, i = arr.length - 1,
                ans = lastOccurrence(arr, key, i);
        if (ans == -1) {
            System.out.println("Key is not found in this array. ");
        } else {
            System.out.println("Key is present at index: " + ans);
        }
    }
}