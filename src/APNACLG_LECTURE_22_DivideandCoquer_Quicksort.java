public class APNACLG_LECTURE_22_DivideandCoquer_Quicksort {

    // Function to print array
    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Quick Sort function
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // Partitioning
        int pIdx = partition(arr, si, ei);

        // Recursive calls
        quickSort(arr, si, pIdx - 1);  // left
        quickSort(arr, pIdx + 1, ei);  // right
    }

    // Partition function
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for(int j = si; j < ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot to correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;  // pivot index
    }

    // Main function
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
