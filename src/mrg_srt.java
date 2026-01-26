import java.util.Scanner;
import java.util.*;

public class mrg_srt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        int [] arr3 = new int[n];
        Random rn = new Random();
        for(int i=0;i<n;i++) {
            arr1[i] = rn.nextInt(1000);
            arr2[i] = arr1[i];
            arr3[i] = arr1[i];
        }
        //Arrays.sort();

            long s1 = System.nanoTime();
            Arrays.sort(arr1);
            long e1 = System.nanoTime();
            System.out.println("Time taken for normal merge sort : "+(e1-s1));


            long s2 = System.nanoTime();
            mergesort.sort(arr2);
            long e2 = System.nanoTime();
            System.out.println("Time taken for merge sort with parallelism : "+(e2-s2));

        long s3 = System.nanoTime();
        TwoThreadMergeSort.sort(arr3);
        long e3 = System.nanoTime();
        System.out.println("Time taken for fork join merge sort : "+(e3-s3));


    }
}
