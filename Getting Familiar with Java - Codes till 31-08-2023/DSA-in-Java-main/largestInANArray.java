import java.util.*;

public class largestInANArray {
    public static void LinearSearch(int arr[]) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i]<minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("The largest in an array is: " + maxValue);
        System.out.println("The smallest in an array is: " + minValue);
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int key = 10;
        LinearSearch(arr);
    }
}
