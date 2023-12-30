import java.util.*;

public class decTOBIN {

    public static void decTOBINN(int num) {
        int myNum = num;
        int power = 0;
        int binNO = 0;
        while (num > 0) {
            int ld = num % 2;
            binNO = binNO + (ld * (int) Math.pow(10, power));
            power++;
            num /= 2;
        }
        System.out.println("The binary no of " + myNum + " is = " + binNO);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of num: ");
        int number = input.nextInt();
        decTOBINN(number);
    }
}
