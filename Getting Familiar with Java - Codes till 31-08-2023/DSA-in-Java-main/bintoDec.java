import java.util.*;

public class bintoDec {

    public static void binTODEC(int num) {
        int myNum = num;
        int power = 0;
        int deciNO = 0;
        while (num > 0) {
            int ld = num % 10;
            deciNO = deciNO + (ld * (int) Math.pow(2, power));
            power++;
            num /= 10;
        }
        System.out.println("The decimal no of " + myNum + " is = " + deciNO);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of Binary num: ");
        int number = input.nextInt();
        binTODEC(number);
    }
}
