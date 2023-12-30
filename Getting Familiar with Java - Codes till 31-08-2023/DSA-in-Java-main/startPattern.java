import java.util.Scanner;

public class startPattern {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
