import java.util.*;

public class APNA_CLG_LEC_24_PERMUTATION{
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[str.length()];
        backtrack(str, new StringBuilder(), used, result);

        System.out.println("All permutations:");
        for (String perm : result) {
            System.out.println(perm);
        }
    }

    static void backtrack(String str, StringBuilder temp, boolean[] used, List<String> result) {
        if (temp.length() == str.length()) {
            result.add(temp.toString());
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (used[i]) continue;

            used[i] = true;
            temp.append(str.charAt(i));

            backtrack(str, temp, used, result);

            temp.deleteCharAt(temp.length() - 1);  // backtrack
            used[i] = false;
        }
    }
}
