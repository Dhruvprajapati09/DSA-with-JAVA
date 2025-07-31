public class APNACLG_LECTURE_22_DivideandCoquer_SortedandRotatedarray {

    // Function to search in rotated sorted array
    public static int search(int arr[], int tar, int si, int ei) {
        // Base case: if search space is invalid
        if (si > ei) {
            return -1;
        }

        // Calculate mid
        int mid = si + (ei - si) / 2;

        // Case 1: Element found
        if (arr[mid] == tar) {
            return mid;
        }

        // Case 2: Left half is sorted
        if (arr[si] <= arr[mid]) {
            // Case a: target lies in the left half
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // Case b: target lies in the right half
                return search(arr, tar, mid + 1, ei);
            }
        }

        // Case 3: Right half is sorted
        else {
            // Case c: target lies in the right half
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // Case d: target lies in the left half
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    // Main function to test search
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;  // Target element to search
        // Expected output: 4

        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println("Index of target: " + tarIdx);
    }
}
