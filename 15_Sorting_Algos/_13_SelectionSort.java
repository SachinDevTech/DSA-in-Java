public class _13_SelectionSort {
    public static int[] selectionSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int minPos = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int sortedArr[] = selectionSort(arr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
