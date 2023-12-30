import java.util.*;

public class ques5 {
    public static int sumofDigits(int num) {
        int sumCalc = 0;
        while (num > 0) {
            int ld = num % 10;
            sumCalc = sumCalc + ld; //sumCalc += ld;
            num /= 10;
        }
        return sumCalc;
    }

    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int num = scc.nextInt();
        System.out.print(sumofDigits(num));
    }

}
