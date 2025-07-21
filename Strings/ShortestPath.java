public class ShortestPath {
    public static float getShortestpATH(String path) {
        float x = 0;
        float y = 0;
        for (int i = 0; i < path.length(); i++) {
            // South
            if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'W') {
                x--;
            } else {
                x++;
            }
        }
        float X2 = x * x;
        float Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "NWEN";
        System.out.println("Shortest distance: " + getShortestpATH(path));

    }
}

