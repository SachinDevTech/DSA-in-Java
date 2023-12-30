// All square patterns at one place

import java.util.Scanner;

public class A_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Pattern: ");
        int number = sc.nextInt();

        // ---------------------------------------
        System.out.println("Printing by using for loop: ");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }

        // -----------------------------------------
        int i = 0;
        System.out.println("Printing by using while loop: ");
        while (i < number) {
            int j = 0;
            while (j < number) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        System.out.println();

        // -------------------------------------------------
        System.out.println("Printing by using for loop: ");
        for (int j = 1; j <= number; j++) {
            for (int k = 1; k <= number; k++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        // ---------------------------------------------
        System.out.println("Printing by using for loop: ");

        for (int l = 1; l <= number; l++) {
            for (int m = 1; m <= number; m++) {
                System.out.print(" " + m + " ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();


        // -----------------------------------------
        System.out.println("Printing by using for loop: ");

        for (int n = 1; n <= number; n++) {
            for (int o = 1; o <= number; o++) {
                System.out.print(" "+((number - o) + 1)+ " ");
            }
            System.out.println();
            // System.out.println();

        }
        System.out.println();
        System.out.println();

        // -----------------------------------------------
        System.out.println("Printing by using for loop: ");
        int count = 1;
        for (int n = 1; n <= number; n++) {
            for (int o = 1; o <= number; o++) {
                System.out.print( " "+ count + " " );
                count++;
            }
            System.out.println();
            // System.out.println();
        }
        // ---------------------Square Pattern Ends here--------------------------
    }
}