public class IsSortedArr {

    public static boolean checkIsSorted(int arr[], int i, int size){
        // Base case: If we've reached the second-to-last element, stop recursion
        if(i == size){
            return true;
        }

        // If the current element is greater than the next one, the array is not sorted
        if(arr[i] > arr[i+1]){
            return false;
        }

        // Recursively check the rest of the array
        return checkIsSorted(arr, i+1, size);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int i = 0;
        int size = arr.length - 1;

        // Call the function and print whether the array is sorted
        System.out.println(checkIsSorted(arr, i, size)); // Output: true
    }
}