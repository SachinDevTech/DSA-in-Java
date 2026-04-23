public class checkPalindrome {
    public static void main(String[] args) {
        int n = 1211;
        int rev = reverseNum (n);
        if (n == rev){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
    public static int reverseNum(int n){
        int rev = 0;
        while(n > 0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        return rev;
    }
}
