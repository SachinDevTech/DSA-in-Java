public class _5_Largest_in_Array {
    public static int checkLargest(int arr[]) {
        int largest = Integer.MIN_VALUE; // very small value like as (-infinity)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 101, 56, 10 };
        int ans = checkLargest(arr);
        System.out.println("The largest value in the given array is: " + ans);
    }
}
