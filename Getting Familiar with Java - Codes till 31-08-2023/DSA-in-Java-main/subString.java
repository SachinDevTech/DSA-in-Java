public class subString {
    public static String print_subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        int startIndex = 0;
        int endIndex = 6;
        System.out.println("\n" + print_subString(str, startIndex, endIndex) + "\n");
    }
}
