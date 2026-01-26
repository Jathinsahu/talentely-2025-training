import java.util.Scanner;

public class merge_sort {

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) left[i] = arr[i];
        for (int i = mid; i < arr.length; i++) right[i - mid] = arr[i];

        int[] sortedLeft = mergeSort(left);
        int[] sortedRight = mergeSort(right);

        return Merge_Two_Arrays.merge_helper(sortedLeft, sortedRight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sorted = mergeSort(arr);
        for (int val : sorted) {
            System.out.print(val + " ");
        }
    }
}
