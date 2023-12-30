import java.util.Scanner;

public class Hollow_Rectangle {
    public static void Hollow_Rectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you wanna make: ");
        int ExpNo = sc.nextInt();
        for (int i = 0; i < ExpNo; i++) {
            System.out.println("Enter rows No.: ");
            int rows = sc.nextInt();
            System.out.println("Enter cols No.: ");
            int cols = sc.nextInt();
            Hollow_Rectangle(rows, cols);
        }
    }
}