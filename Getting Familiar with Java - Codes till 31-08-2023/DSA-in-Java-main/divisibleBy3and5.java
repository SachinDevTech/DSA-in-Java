public class divisibleBy3and5 {
    public static void main(String[] args) {
        int num = 20;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The number is Divisible by both numbers");
        } else if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("The number is Divisible by 3 but not by 5");
        } else if (num % 3 != 0 && num % 5 == 0) {
            System.out.println("The number is Divisible by 5 but not by 3");
        } else {
            System.out.println("Number isn't divided evenly into either of the two given numbers");
        }

    }
}
