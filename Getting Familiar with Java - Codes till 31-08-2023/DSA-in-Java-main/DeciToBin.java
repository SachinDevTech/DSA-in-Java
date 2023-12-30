public class DeciToBin {
    public static void main(String[] args) {
        int DecimalNo = 15;
        int pow = 0;
        int BinNo = 0;
        while (DecimalNo > 0) {
            int rem = DecimalNo % 2;
            BinNo = BinNo + rem * (int) Math.pow(10, pow);
            pow++;
            DecimalNo /= 2;
        }
        System.out.print(" " + BinNo);
    }
}
