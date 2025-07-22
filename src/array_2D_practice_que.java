import java.util.Scanner;

public class array_2D_practice_que {

    // Function 1: Count the number of 7's
    public static int countSevens(int[][] array) {
        int count = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    // Function 2: Sum of the second row
    public static int sumSecondRow(int[][] nums) {
        int sum = 0;
        int row = 1; // second row index
        for (int j = 0; j < nums[row].length; j++) {
            sum += nums[row][j];
        }
        return sum;
    }

    // Function 3: Transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Main function to test all
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Question 1
        int[][] array1 = {
                {4, 7, 8},
                {8, 8, 7}
        };
        System.out.println("Count of 7's: " + countSevens(array1));

        // Input for Question 2
        int[][] nums = {
                {1, 4, 9},
                {11, 4, 3},
                {2, 2, 3}
        };
        System.out.println("Sum of second row: " + sumSecondRow(nums));

        // Input for Question 3
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transposed = transposeMatrix(matrix);

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
