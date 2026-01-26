import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;

public class mergesort {
    private static final int THRESHOLD = 1000;
    static volatile int itr=0;
    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        itr = 1;
        mergeSort(arr, 0, arr.length - 1,itr);
    }

    private static void mergeSort(int[] arr, int left, int right,int itr) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        if (itr < 2) {
            itr++;
            int finalItr = itr;
            Thread t1 = new Thread(() -> mergeSort(arr, left, mid, finalItr));
            int finalItr1 = itr;
            Thread t2 = new Thread(() -> mergeSort(arr, mid + 1, right, finalItr1));
            System.out.println(" 2 threads");

            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            mergeSort(arr, left, mid,itr);
            mergeSort(arr, mid + 1, right,itr);
        }

        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

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
