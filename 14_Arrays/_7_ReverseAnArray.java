public class _7_ReverseAnArray {

    public static int[] reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        
        // Calling the function to reverse the array
        int reversedArr[] = reverseArray(arr); // we also can remove array variable "reveredArr[]" as our original array was passesd as an argument and according to the concept of pass by reference the change will also reflect outside the derived function.

        // Printing the reversed array
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }
}
