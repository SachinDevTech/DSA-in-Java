import java.util.Scanner;

public class C_asciiPatttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of pattern: ");
        int number = sc.nextInt();
        // ----------------------------------
        char ch = 'A';
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(" " + (ch) + " ");
                // num++;
                ch++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // ---------------------------------------
        char chh = 'A';
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + (chh) + " ");
                // num++;
                chh++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // ------------------------------------
        char chhr = 'A';
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + (char)(chhr + i + j) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // ----------------------------------------
        char chhq = 'A';
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + (char) (chhq + i - 1) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // ---------------------------------------
        char chha = 'A';
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(" " + (char) ('A' + i + j - 2) + " ");
                // num++;
                // chha++;
            }
            System.out.println();
            // Nahi hua ye wala please try again, problem in typecasting!
        }
    }
}
