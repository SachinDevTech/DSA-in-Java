import java.util.Scanner;

public class B_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of pattern: ");
        int number = sc.nextInt();

        // -------------------------------------------
        System.out.println();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
        System.out.println();

        // --------------------------------------
        System.out.println("This is triangle pattern: ");
        System.out.println();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();

        }

        // --------------------------------
        System.out.println();
        System.out.println("This is also a triagnle pattern: \n");
        // int count = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + i);
                // count++;
            }
            System.out.println();
        }

        // ----------------------------------------
        System.out.println();
        System.out.println("This is also a triagnle pattern: \n");
        // int count = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i - j + 1);
                // count++;
            }
            System.out.println();
        }
        // -----------------------------------------
        System.out.println();

        for (int i = 0; i < number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();

        }
        System.out.println();
        // -----------------------------------------
        System.out.println();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.println();
    }
}
