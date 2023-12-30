import java.util.Scanner;

public class celciusToFahrenhiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of temperature(in F)");
        float cel = sc.nextFloat();
        float far = (cel * 9/5) + 32;
        System.out.println("Temp. in Fahrenhiet is: " + far);
    }
}