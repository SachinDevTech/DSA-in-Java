import java.util.*;

public class binSearchPractice {
    public static int BinSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int keyValue = inp.nextInt();
        int arrr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(keyValue + " is present at: " + BinSearch(arrr, keyValue));
    }
}