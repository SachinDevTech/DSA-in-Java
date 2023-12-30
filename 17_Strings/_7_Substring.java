public class _7_Substring {
    public static String subString(String str, int si, int ei) {
        String sub_str = "";
        for (int i = si; i < ei; i++) {
            sub_str += str.charAt(i);
        }
        return sub_str;
    }

    public static void main(String[] args) {
        String str = "Sachin Kumar";
        int si = 0; // starting index
        int ei = 5; // ending index
        String ans = subString(str, si, ei);
        System.out.println("The substring you got is: " + ans);
    }
}
