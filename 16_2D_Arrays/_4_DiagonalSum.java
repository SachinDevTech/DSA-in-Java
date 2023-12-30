public class _4_DiagonalSum {
    public static int diagonalSum(int arr[][]) {
        int sum = 0;
        // TC = O(n^2)
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (i == j) {
        // sum += arr[i][j]; //primary diagonal sum
        // } else if (i + j == arr.length - 1) {
        // sum += arr[i][j]; //secondary diagonal sum
        // }
        // }
        // }

        // TC = O(n)
        for (int i = 0; i < arr.length; i++) {
            // primary diagonal sum
            sum += arr[i][i];
            // secondary diagonal sum
            sum += arr[i][arr.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        int ans = diagonalSum(arr);
        System.out.println("The sum of primary and secondary diagonals is: " + ans);
    }
}
