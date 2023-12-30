public class Solution {

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double halfValue = myPow(x, n / 2);
        double resultantValue = halfValue * halfValue;

        if (n % 2 != 0) {
            resultantValue = x * resultantValue;

        }
        if (n < 0) {
            return (halfValue * halfValue) / x;
        }
        return resultantValue;
    }

    public static void main(String[] args) {
        double x = 2;
        int pow = -2;
        System.out.println(myPow(x, pow));

    }
}
