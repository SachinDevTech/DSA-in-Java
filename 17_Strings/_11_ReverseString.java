// Brute force approach

// public class _11_ReverseString {
//     public static String reversedString(String str){
//         for (int i = str.length() - 1; i >= 0; i--) {
//             System.out.print(str.charAt(i) + " ");
//         }
//         return str;
//     }
//     public static void main(String[] args) {
//         String str = "HELLO";
//         reversedString(str);
//     }
// }

// Using StringBuilder Data Structure as we have studied earlier.

public class _11_ReverseString  {
    public static String reverseString(String str){
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i) + " ");
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "HELLO";
        String reversedStr = reverseString(str);
        System.out.println(reversedStr);
    }
}

