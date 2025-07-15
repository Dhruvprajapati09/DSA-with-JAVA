import java.util.*;

public class apnaclg_lecture_13 {

    // Method to print all unique pairs of elements in the array
    public static void pairofarray(int number[]) {
        System.out.println("All pairs in the array:");
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.println("(" + curr + ", " + number[j] + ")");
            }
        }
        System.out.println(); // for spacing
    }

    // Method to print all subarrays of the array
    public static void pairofsubarray(int number[]) {
        int count = 0; // to count total subarrays
        System.out.println("All subarrays of the array:");

        for (int start = 0; start < number.length; start++) {
            for (int end = start; end < number.length; end++) {
                // Print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
                count++;
            }
        }

        System.out.println("Total number of subarrays: " + count);
    }

    public static void main(String[] args) {
        int number[] = {6, 7, 8, 9, 10};

        // pairofarray(number);
        pairofsubarray(number);
    }
}
