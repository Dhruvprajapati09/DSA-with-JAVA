import java.util.*;

public class APNA_CLG_STRING {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userInput = inputOutput(sc);
        lengthAndConcatenation(userInput);
        charAtExample(userInput);
        checkPalindrome("racecar");
        shortestPath("WNEENESENNN");
        compareStrings("Apple", "Banana");
        substringExample("Hello World!");
        printLargestString(new String[]{"apple", "mango", "banana"});
        convertToUppercase("helloWorld");
        stringBuilderDemo();
        stringCompression("aabcccccaaa");
    }

    // 1. Input & Output
    static String inputOutput(Scanner sc) {
        System.out.println("Enter a string:");
        String name = sc.nextLine();
        System.out.println("You entered: " + name);
        return name;
    }

    // 2. Length & Concatenation
    static void lengthAndConcatenation(String name) {
        System.out.println("Length: " + name.length());

        String firstName = "Dhruv";
        String lastName = "Prajapati";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
    }

    // 3. charAt Example
    static void charAtExample(String str) {
        System.out.print("Characters: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    // 4. Palindrome Check
    static void checkPalindrome(String str) {
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(str + " is palindrome? " + isPalindrome);
    }

    // 5. Shortest Path
    static void shortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N') y++;
            else if (dir == 'S') y--;
            else if (dir == 'E') x++;
            else if (dir == 'W') x--;
        }
        double dist = Math.sqrt(x * x + y * y);
        System.out.println("Shortest Path Distance: " + dist);
    }

    // 6. Compare Strings
    static void compareStrings(String a, String b) {
        System.out.println("Comparing '" + a + "' with '" + b + "': " + a.compareTo(b));
    }

    // 7. Substring Example
    static void substringExample(String str) {
        String sub = str.substring(6);
        System.out.println("Substring from index 6: " + sub);
    }

    // 8. Print Largest String
    static void printLargestString(String[] arr) {
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(largest) > 0) {
                largest = arr[i];
            }
        }
        System.out.println("Largest string: " + largest);
    }

    // 9. Convert to Uppercase (manual)
    static void convertToUppercase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 'a' + 'A');
            } else {
                result += ch;
            }
        }
        System.out.println("Uppercase: " + result);
    }

    // 10. StringBuilder operations
    static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("hello");
        sb.setCharAt(0, 'H');
        sb.insert(2, 'y');
        sb.delete(2, 3);
        sb.append(" World!");
        System.out.println("StringBuilder Result: " + sb);
    }

    // 11. String Compression
    static void stringCompression(String s) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(s.charAt(s.length() - 1)).append(count);
        System.out.println("Compressed: " + compressed);
    }
}
