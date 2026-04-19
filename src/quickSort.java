public class quickSort {

    static void sort(int left,int right,int[] arr){
        if(left > right) return;
        int i=left,j=right;
        int pivot = arr[left + (right-left)/2];
        while(i <= j){
            while(i < arr.length && arr[i] < pivot){
                i++;
            }
            while(j >= 0 && arr[j] > pivot){
                j--;
            }
            if(i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        sort(left,j,arr);
        sort(i,right,arr);
    }


}
