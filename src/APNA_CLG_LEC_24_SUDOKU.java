public class APNA_CLG_LEC_24_SUDOKU {
    static void solveAndPrint(int[][] board) {
        if (solveSudoku(board)) {
            System.out.println("Solved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    //  Recursive function to solve Sudoku
    static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == 0) { // Empty cell found
                    for (int number = 1; number <= 9; number++) {
                        if (isSafe(board, row, col, number)) {
                            board[row][col] = number;

                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[row][col] = 0; // backtrack
                            }
                        }
                    }
                    return false; // no valid number found
                }
            }
        }
        return true; // all cells filled
    }

    //  Check if placing number is valid
    static boolean isSafe(int[][] board, int row, int col, int number) {
        return !usedInRow(board, row, number) &&
                !usedInCol(board, col, number) &&
                !usedInBox(board, row - row % 3, col - col % 3, number);
    }

    //  Check row
    static boolean usedInRow(int[][] board, int row, int number) {
        for (int col = 0; col < 9; col++) {
            if (board[row][col] == number) return true;
        }
        return false;
    }

    //  Check column
    static boolean usedInCol(int[][] board, int col, int number) {
        for (int row = 0; row < 9; row++) {
            if (board[row][col] == number) return true;
        }
        return false;
    }

    //  Check 3x3 grid
    static boolean usedInBox(int[][] board, int boxStartRow, int boxStartCol, int number) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row + boxStartRow][col + boxStartCol] == number) return true;
            }
        }
        return false;
    }

    //  Print the Sudoku board
    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        solveAndPrint(board);
    }

}
