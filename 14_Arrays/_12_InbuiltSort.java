import java.util.Arrays;

public class _12_InbuiltSort {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 1, 2, 4, 3, 5, 7, 5, 8, 5, 5 };
        Arrays.sort(arr);

        System.out.println("Sorted array is: "+ Arrays.toString(arr));
    }
}