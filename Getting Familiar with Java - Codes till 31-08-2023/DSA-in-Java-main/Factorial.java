import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        int ans = 1;
        for(int i = 1; i<=number; i++){
            ans = ans * i;
        }
        System.out.println("The factorial Value is: " + ans);
        
    }
}

//Write code for factorial of a number in java?
