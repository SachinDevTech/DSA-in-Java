public class _10_FirstOccurence {
    public static int firstOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 5,2,1,1,2,3,0,4,5,6,5 }, key = 5, i = 0, ans = firstOccurrence(arr, key, i);
        if (ans == -1) {
            System.out.println("Key is not found in this array. ");
        } else {
            System.out.println("Key is present at index: " + ans);
        }
    }
}