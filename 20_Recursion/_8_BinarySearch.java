// import java.util.Arrays;

// public class _8_BinarySearch {
//     public static int checkKeyByBinarySearch(int arr[], int s, int e, int key) {
//         // Returning the value -1 as because the key is not present in the entire array
//         if (s > e) {
//             return -1;
//         }
//         // if arr[mid] == key then return mid index and one case is solved and now
//         // recursion will take care.

//         // mid
//         int mid = s + (e - s) / 2;
//         if (arr[mid] == key) {
//             return mid;
//         }
//         if (arr[mid] < key) {
//             return checkKeyByBinarySearch(arr, mid + 1, e, key);
//         } else {
//             return checkKeyByBinarySearch(arr, s, e - 1, key);
//         }

//     }

//     public static void main(String[] args) {
//         // array
//         int arr[] = { 12, 14, 11, 4, 1, 2, 9, 34 };
//         // Sorting the array
//         Arrays.sort(arr);
//         // start
//         int s = 0;
//         // end
//         int e = arr.length - 1;

//         // key
//         int key = 9;

//         // function call
//         int ans = checkKeyByBinarySearch(arr, s, e, key);
//          if (ans != -1) {
        //     System.out.println("Key is present at index: " + ans);
        // } else {
        //     System.out.println("Key is not present in the array.");
        // }
//     }
// }




//Another Method:

import java.util.Arrays;

public class _8_BinarySearch {
    public static int checkKeyByBinarySearch(int arr[], int s, int e, int key) {
        if (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                return checkKeyByBinarySearch(arr, mid + 1, e, key);
            } else {
                return checkKeyByBinarySearch(arr, s, mid - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 14, 11, 4, 1, 2, 9, 34 };
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length - 1;
        int key = 9;

        int ans = checkKeyByBinarySearch(arr, s, e, key);
        if (ans != -1) {
            System.out.println("Key is present at index: " + ans);
        } else {
            System.out.println("Key is not present in the array.");
        }
    }
}
