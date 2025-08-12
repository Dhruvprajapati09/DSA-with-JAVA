public class APNA_CLG_LEC_24_GRID_WAY {
    public static void main(String[] args) {
        int n = 3; // rows
        int m = 3; // columns

        int totalWays = countWays(n, m);
        System.out.println("Total ways: " + totalWays);
    }

    static int countWays(int n, int m) {
        // Base cases
        if (n == 1 || m == 1) {
            return 1; // Only one way if only one row or column
        }

        // Recursive calls: move down or move right
        return countWays(n - 1, m) + countWays(n, m - 1);
    }
}
