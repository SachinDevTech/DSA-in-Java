import java.util.Scanner;

public class DeciToHexaDeci {

    public static int Decimal_to_HexaDecimal(int num) {
        int DeciNo = num;
        int pow = 0;
        int HD = 0;
        while (DeciNo > 0) {
            int rem = DeciNo % 16;
            HD = HD * (int) Math.pow(10, pow) + rem;
            pow++;
            DeciNo /= 16; // integer division to get the quotient without decimal point
        }
        return HD;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Value only: ");
        int number = sc.nextInt();
        System.out.print(" The HexaDecimal value of given input is: " + Decimal_to_HexaDecimal(number));
    }
}
// decimal to hexadecimal?