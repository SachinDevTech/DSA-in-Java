import java.util.Scanner;

public class Fahrenhiet__degreeCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of temperature(in F)");
        float far = sc.nextFloat();
        float cel = (far - 32) * 5/9;
        System.out.println("Temp. in celcius is: " + cel);
    }
}
