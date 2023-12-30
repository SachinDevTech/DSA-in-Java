import java.util.*;
public class BinToDeci {
    public static void main(String[] args) {
        int num = 1111;
        int pow = 0;
        int DeciNo = 0;
        while (num > 0) {
            int ld = num % 10;
            DeciNo = DeciNo + ld * (int) Math.pow(2, pow);
            pow++;
            num = num/10;
        }
        System.out.print(DeciNo);
    }
}