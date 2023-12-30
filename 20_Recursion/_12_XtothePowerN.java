public class _12_XtothePowerN {
    public static double calcXtothePowN(int x, int pow) {
        if (pow == 0) {
            return 1;
        } else if (pow > 0) {
            return x * calcXtothePowN(x, pow - 1);
        } else {// Handling negative exponent
            return 1.0 / (x * calcXtothePowN(x, -pow - 1));
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int pow = -3;
        double ans = calcXtothePowN(x, pow);
        System.out.println("The ans is: " + ans);
    }
}
