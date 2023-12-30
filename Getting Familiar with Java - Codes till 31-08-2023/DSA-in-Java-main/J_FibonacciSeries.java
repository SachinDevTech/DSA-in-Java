public class J_FibonacciSeries {

    public static void PrintingFibonacciSeries(int num) {
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series is: ");
        for (int i = 0; i < num; i++) {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

        }
    }

    public static void main(String[] args) {
        int number = 26;
        PrintingFibonacciSeries(number);
    }
}
