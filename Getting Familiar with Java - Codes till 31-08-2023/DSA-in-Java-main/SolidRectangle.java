import java.util.Scanner;

public class SolidRectangle {
    public static void HollowRectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(" * ");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows No.: ");
        int rows = sc.nextInt();
        System.out.println("Enter cols No.: ");
        int cols = sc.nextInt();
        HollowRectangle(rows, cols);
    }

}
