import java.util.*;

public class _2_id_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks to get the Grade: ");
        int marks = sc.nextInt();
        if (marks > 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Grade B");

        } else if (marks > 70 && marks<=80) {
            System.out.println("Grade C");

        } else if (marks > 60 && marks<=70) {
            System.out.println("Grade D");

        } else if (marks >= 50 && marks<=60) {
            System.out.println("Grade E");

        } else {
            System.out.println("Grade F");
        }

    }
}
