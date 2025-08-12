public class APNA_CLG_LEC_24_PROBLEM_N_QUEENS {
    public static void main(String[] args) {
        int n = 4;  // Change N here
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        if (solveNQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    static boolean solveNQueens(char[][] board, int row) {
        if (row == board.length) {
            return true;  // All queens placed successfully
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';  // Place queen

                if (solveNQueens(board, row + 1)) {
                    return true;  // Found valid configuration
                }

                board[row][col] = '.';  // Backtrack
            }
        }

        return false;  // No valid placement for this row
    }

    static boolean isSafe(char[][] board, int row, int col) {
        // Check vertical above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;  // Safe to place
    }

    static void printBoard(char[][] board) {
        System.out.println("One of the solutions:");
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
