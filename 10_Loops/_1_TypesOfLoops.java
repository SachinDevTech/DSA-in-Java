public class _1_TypesOfLoops {
    public static void main(String[] args) {
        // Types are:
        // 1. While
        // 2. For
        // 3. do while

        // Print counting using "while"
        int i = 1; // initialized a reference variable
        while (i <= 100) { // condition
            System.out.print(i + " ");
            i++; // updation in the current condition
        }
        System.out.println();

        // Print counting using "for"
        for (int j = 1; j <= 100; j++) {
            System.out.print(j + " ");

        }
        System.out.println();

        // Print counting using "do-while"
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 100);
    }
}