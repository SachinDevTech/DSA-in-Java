import java.util.*;

public class _2_InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input only single word
        // String firstName = sc.next();
        // String lastName = sc.next();
        // String fullName = firstName + " " + lastName;

        //can input full name or whatever you enter in input will be shown in output.
        String fullName = sc.nextLine();
        System.out.println("The full name is: " + fullName); // output
    }
}
