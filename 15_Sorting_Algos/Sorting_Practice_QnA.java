public class Sorting_Practice_QnA {
    public static int[] sortArr(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        int sortedArr[] = sortArr(arr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");

        }
    }
}