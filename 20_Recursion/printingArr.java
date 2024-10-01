public class printingArr {
    public static void printArrElems(int arr[], int i, int size){
        // Base case: if i exceeds the last index, stop recursion
        if(i > size){ 
            return;
        }
        System.out.print(arr[i] + " ");
        printArrElems(arr, i+1, size); // Recursive call for the next element
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 6, 3, 0, 9};
        int i = 0;
        int size = arr.length - 1;

        printArrElems(arr, i, size); // Calling the recursive function
    }
}