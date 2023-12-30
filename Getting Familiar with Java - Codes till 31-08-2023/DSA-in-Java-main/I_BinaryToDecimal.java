import java.util.Scanner;

public class I_BinaryToDecimal {
    public static int BinToDeci(int n) {
        // n ki value chhoti ho jayegi as n = n /10; so,
        int myNum = n;
        
        int pow = 0;
        int deciNo = 0;
        for (int i = 0; 0 < n; i++) {
            int ld = n % 10;
            deciNo = deciNo + ld * (int) Math.pow(2, pow);
            pow++;
            n = n / 10;
        }
        System.out.println("Decimal no. of " + myNum + " is: " + deciNo);

        return deciNo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only binary number: ");
        int number = sc.nextInt();
        BinToDeci(number);
    }
}
