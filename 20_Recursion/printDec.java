public class printDec {
    public static void main(String[] args) {
        printDecreasing(5);
    }

    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }
}
