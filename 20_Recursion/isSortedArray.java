public class isSortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 }, i = 0;
        boolean ans = checkSorted(arr, i);
        System.out.println("Ans is: " + ans);
    }

    public static boolean checkSorted(int arr[], int i) {
        if (i == arr.length-1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return checkSorted(arr, i+1);
    }
}
