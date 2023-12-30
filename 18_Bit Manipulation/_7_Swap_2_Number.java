public class _7_Swap_2_Number {
    public static void main(String[] args) {
        int a = 5, b = 7;
        a = a ^ b; //5 = 101, 7 = 111 => a = a^b = 5^7 = 010 = 2
        b = a ^ b; // 2 = 010, 7 = 111 => b= a^b = 2^7 = 101 = 5
        a = a ^ b; // 2 = 010, 5 = 101 => a = a^b = 2^5 = 111 = 7 (Hence Swapped)
        System.out.println("The value of a now: " + a + " and b is: " + b);
    }
}