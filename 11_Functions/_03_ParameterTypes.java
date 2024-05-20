import java.util.*;

public class _03_ParameterTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch = sc.next().charAt(0);
        System.out.println(PerformOperns(a, b, ch));
    }

    public static int PerformOperns(int a, int b, char ch) {
        switch (ch) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '%':
                return a % b;

            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error! Division by Zero.");
                    return 0;
                }

            default:
                System.out.println("Invalid Operation!.");
                return 0;
        }
    }
}
