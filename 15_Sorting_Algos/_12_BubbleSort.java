public class _12_BubbleSort {
    public static int[] bubbleSort(int arr[]) {
        int swaps = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int i = 0; i < arr.length - 1 - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println(swaps);
        return arr;
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 }; //if arrays is unsorted then swaps were 8. 
        int arr[] = {1,2,3,4,5}; //if arrays is sorted then ? We got zero swaps as condition was getting false but he knows that zero swaps because everytime condition was getting checked by the loops and T.C = O(n^2).
        int sortedArr[] = bubbleSort(arr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}









// Leetcode



// Brute Force TC = O(n^2)
// class Solution {
//     public void sortColors(int[] nums) {
//         for(int turn = 0; turn < nums.length - 1; turn++){
//             for(int j = 0; j < nums.length - 1 - turn; j++){
//                 if(nums[j] > nums[j+1]){
//                     // arr[j+1] = arr[j]
//                     int temp = nums[j];
//                     nums[j] = nums[j+1];
//                     nums[j+1] = temp;
//                 }
//             }
//         }
//         // return nums;
//     }
// }


// TC Optimized - O(n)
// class Solution {
//     public void sortColors(int[] nums) {
//         int start = 0, current = 0, last = nums.length - 1;
//         while (current <= last) {
//             if (nums[current] == 0) {
//                 swap(nums, start, current);
//                 low++;
//                 current++;
//             } else if (nums[current] == 1) {
//                 current++;
//             } else {
//                 swap(nums, current, last);
//                 last--;
//             }
//         }
//     }
    
//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }
