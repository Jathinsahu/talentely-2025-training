import java.util.Scanner;

public class Merge_Two_Arrays {

    static void remaining(int[] sorted_array, int[] arr, int ind, int i) {
        while (i < arr.length) {
            sorted_array[++ind] = arr[i++];
        }
    }

    static int[] merger(int[] arr1, int[] arr2, int[] sorted_array, int ind, int ptr1, int ptr2) {
        if (ptr1 == arr1.length && ptr2 == arr2.length) {
            return sorted_array;
        }

        if (ptr1 < arr1.length && (ptr2 == arr2.length || arr1[ptr1] <= arr2[ptr2])) {
            sorted_array[++ind] = arr1[ptr1++];
        } else if (ptr2 < arr2.length) {
            sorted_array[++ind] = arr2[ptr2++];
        }

        return merger(arr1, arr2, sorted_array, ind, ptr1, ptr2);
    }

    static int[] merge_helper(int[] arr1, int[] arr2) {
        int[] sorted_array = new int[arr1.length + arr2.length];
        return merger(arr1, arr2, sorted_array, -1, 0, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = merge_helper(arr1, arr2);
        for (int i : result) System.out.print(i + " ");
    }
}
