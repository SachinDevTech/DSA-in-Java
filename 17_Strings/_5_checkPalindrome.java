public class _5_checkPalindrome {
    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1; // Initialize the end index
    
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    

    public static void main(String[] args) {
        String str = "racar";
        System.out.println(checkPalindrome(str));
    }
}
