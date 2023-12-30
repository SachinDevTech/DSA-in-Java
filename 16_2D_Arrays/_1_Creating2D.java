import java.util.Scanner;

public class _1_Creating2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3, m = 3;
        int arr[][] = new int[n][m];
        // Input
        System.out.println("Enter the values in 2D Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output of 2D array
        System.out.println();
        System.out.println("Printing 2D array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}