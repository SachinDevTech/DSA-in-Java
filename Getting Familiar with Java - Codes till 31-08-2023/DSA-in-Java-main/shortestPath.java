public class shortestPath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0; // initially we are standing at origin
        // use coordinates in efficient manner
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {// north
                y++;
            } else if (path.charAt(i) == 'S') {// south
                y--; 
            } else if (path.charAt(i) == 'W') {// west
                x--;
            } else { // east
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String str = "WNSW";
        System.out.println("\nThe shortest path displacement is: " + getShortestPath(str) + " unit" + "\n");
    }
}
