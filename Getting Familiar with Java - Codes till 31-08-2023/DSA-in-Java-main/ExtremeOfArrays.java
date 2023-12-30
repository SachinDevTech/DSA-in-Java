public class ExtremeOfArrays {
    public static void PrintingExtremes(int arr[]) {
        // int size = arr.length;
        // PrintingExtremes(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (start > end) {
                break;
            }
            if (start == end) {
                System.out.print(" (" + arr[start] + ")");
            } else {
                System.out.print("(" + arr[start] + ",");
                System.out.println(arr[end] + ")");
            }
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        PrintingExtremes(arr);

    }
}
