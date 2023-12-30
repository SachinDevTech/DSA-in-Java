public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        // It's time complexiety is O(26)
        // And if we have used normal string and sb+=ch; then its TC will be O(26*n^2)
        System.out.print(sb);
    }
}
