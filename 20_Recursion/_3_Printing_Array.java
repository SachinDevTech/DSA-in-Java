public class _3_Printing_Array {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int len = arr.length - 1;
        int i = 0;
        printArr(arr, len, i);
    }

    public static void printArr(int arr[], int len, int i) {
        // base case
        if (i > len) {
            return;
        }

        // printing
        System.out.print(arr[i] + " ");

        // processing and recursive call
        printArr(arr, len, i + 1);
    }
}
