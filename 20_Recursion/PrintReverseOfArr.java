public class PrintReverseOfArr {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5};
        
        // Calling the recursive method to print the array in reverse
        printReverse(arr, arr.length - 1);
    }

    // Recursive method to print the array in reverse order
    public static void printReverse(int[] arr, int index) {
        // Base case: if the index is less than 0, stop recursion
        if (index < 0) {
            return;
        }
        // Print the current element
        System.out.print(arr[index] + " ");
        // Recursive call with the previous index
        printReverse(arr, index - 1);
    }
}