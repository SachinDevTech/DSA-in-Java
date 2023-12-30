public class secondLargest {
    public static void LargestInArray(int arr[]) {
        int largestValue = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestValue) {
                largestValue = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > secondLargest) && arr[i] != largestValue) {
                secondLargest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > thirdLargest) && arr[i] != secondLargest && arr[i] != largestValue) {
                thirdLargest = arr[i];
            }
        }
        System.out.println("Largest is: " + largestValue);
        System.out.println("Second Largest is: " + secondLargest);
        System.out.println("Third Largest is: " + thirdLargest);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 7, 6, 3, 7 };
        LargestInArray(arr);

    }
}
