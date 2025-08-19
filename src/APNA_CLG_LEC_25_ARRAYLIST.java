import java.util.*;

public class APNA_CLG_LEC_25_ARRAYLIST {

    public static void Reverse(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void maxAL(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("The max number is :" + max);
    }

    public static void Swap2num(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    // Multi-Dimensional ArrayList
    public static void multiDimArrayList(int rows, int cols) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        for (int i = 1; i <= rows; i++) {
            ArrayList<Integer> subList = new ArrayList<>();
            for (int j = 1; j <= cols; j++) {
                subList.add(i * j); // Example: multiplication table
            }
            mainList.add(subList);
        }

        // Printing the multi-dimensional ArrayList
        System.out.println("Multi-Dimensional ArrayList:");
        for (ArrayList<Integer> subList : mainList) {
            System.out.println(subList);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Reverse(list);
        // maxAL(list);

        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // Swap2num(list, idx1, idx2);
        // System.out.println(list);

        // Multi-Dimensional ArrayList Example
        multiDimArrayList(3, 4);
    }
}
