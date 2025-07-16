public class APNACLG_LECTURE_18_BITMANIPULATION_PRACTICE_QUE {

    public static void main(String[] args) {

        //  Solution 1: x ^ x = 0
        int a = 5;
        System.out.println("Solution 1: " + a + " ^ " + a + " = " + (a ^ a));  // Output: 0

        //  Solution 2: Swap two numbers using XOR
        int x = 3, y = 4;
        System.out.println("\nSolution 2: Before swap: x = " + x + ", y = " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swap: x = " + x + ", y = " + y);

        //  Solution 3: -~x = x + 1
        System.out.println("\nSolution 3:");
        int num1 = 6;
        System.out.println(num1 + " + 1 = " + -~num1);

        int num2 = -4;
        System.out.println(num2 + " + 1 = " + -~num2);

        int num3 = 0;
        System.out.println(num3 + " + 1 = " + -~num3);

        //  Solution 4: Convert uppercase to lowercase using bitwise OR
        System.out.println("\nSolution 4: Uppercase to Lowercase Conversion:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' ')); // Converts to lowercase
        }
        System.out.println();
    }
}
