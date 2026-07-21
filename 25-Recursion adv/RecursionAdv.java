public class RecursionAdv {

    //Tiling problem
    public static int tilingWays(int n) {
        // Base Cases
        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertical placement
        int vertical = tilingWays(n - 1);

        // Horizontal placement
        int horizontal = tilingWays(n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingWays(n));
    }
}