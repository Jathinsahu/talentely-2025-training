public class TwoThreadMergeSort {

    /**
     * The public-facing static sort method. It splits the array into two halves,
     * assigns each half to a new thread for sorting, and then merges the
     * two sorted halves in the main thread.
     *
     * @param arr The integer array to be sorted.
     */
    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int mid = (arr.length - 1) / 2;

        // Create two threads, one for each half of the array.
        // Each thread will run a purely SEQUENTIAL merge sort on its portion.
        Thread leftSortThread = new Thread(() -> sequentialMergeSort(arr, 0, mid));
        Thread rightSortThread = new Thread(() -> sequentialMergeSort(arr, mid + 1, arr.length - 1));

        // Start both threads to run them in parallel.
        leftSortThread.start();
        rightSortThread.start();

        try {
            // Wait for both threads to complete their sorting tasks.
            leftSortThread.join();
            rightSortThread.join();
        } catch (InterruptedException e) {
            // Restore the interrupted status and print the stack trace.
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        // After both halves are sorted, merge them back together.
        // This final merge is done sequentially in the main thread.
        merge(arr, 0, mid, arr.length - 1);
    }

    /**
     * A standard, recursive, and purely SEQUENTIAL merge sort algorithm.
     * This static helper method does NOT create any new threads.
     *
     * @param arr   The array containing the segment to sort.
     * @param left  The starting index of the segment.
     * @param right The ending index of the segment.
     */
    private static void sequentialMergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sequentialMergeSort(arr, left, mid);
        sequentialMergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    /**
     * The original static merge method, unchanged. It combines two sorted adjacent
     * segments of the array into a single sorted segment.
     *
     * @param arr   The array containing the segments to merge.
     * @param left  The starting index of the first segment.
     * @param mid   The ending index of the first segment.
     * @param right The ending index of the second segment.
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            arr[left + l] = temp[l];
        }
    }
}
