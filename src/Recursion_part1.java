public class Recursion_part1 {

    // 1. Print numbers from n to 1
    public static void print_num_using_recursion_decreament(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print_num_using_recursion_decreament(n - 1);
    }

    // 2. Print numbers from 1 to n
    public static void print_num_using_recursion_increament(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        print_num_using_recursion_increament(n - 1);
        System.out.println(n);
    }

    // 3. Factorial
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);  // fixed: removed repeated recursive call
    }

    // 4. Sum of first n natural numbers
    public static int sum_of_nth_natural_num(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum_of_nth_natural_num(n - 1);
    }

    // 5. Nth Fibonacci number
    public static int cal_fibonacci_number(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return cal_fibonacci_number(n - 1) + cal_fibonacci_number(n - 2);
    }

    // 6. Check if array is sorted
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // 7. First occurrence of a key in array
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    // 8. Last occurrence of a key in array
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // 9. Power function (x^n)
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    // Main method to test all
    public static void main(String[] args) {
        // print_num_using_recursion_decreament(10);
        // print_num_using_recursion_increament(10);
        // System.out.println("Factorial: " + fact(5));
        // System.out.println("Sum: " + sum_of_nth_natural_num(5));
        // System.out.println("Fibonacci: " + cal_fibonacci_number(6));

        int[] arr = {1, 2, 3, 2, 5, 2, 7};
        // System.out.println("Is sorted: " + isSorted(arr, 0));
        // System.out.println("First Occurrence of 2: " + firstOccurence(arr, 2, 0));
        // System.out.println("Last Occurrence of 2: " + lastOccurence(arr, 2, 0));
        // System.out.println("Power: " + power(2, 5));
    }
}
