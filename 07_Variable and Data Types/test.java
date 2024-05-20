//Type casting example:

// public class test {
//     public static void main(String[] args) {
//         long num = 25;
//         int newNum = (int) num;
//         System.out.println(newNum);
//     }
// }

// -----------------------------------------------------------

// Type conversion Example:
// public class test {
//     public static void main(String[] args) {
//         int num = 25;
//         long newNum = num;

//         // Checking data types
//         if (num == (int) num) {
//             System.out.println("num is an int.");
//         }
//         if (newNum == (long) newNum) {
//             System.out.println("newNum is a long.");
//         }
//         System.out.println(newNum);
//     }
// }

//---------------------------------------------------------------

public class test {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            System.out.println("This is the table of: " + i);
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(result);
            }
            System.out.println();
        }
    }
}