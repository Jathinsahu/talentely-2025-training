class heap_sort {
    static int [] arr;
    static int scope;
     heap_sort (int [] arr){
         this.arr = arr;
        scope = arr.length-1;
        while(scope > 0){
            for (int i = (scope - 1) / 2; i >= 0; i--){
                heap_sort.heapify(i,scope);
            }
            h_swap(0,scope);
            scope--;
        }
    }


    public static void h_swap(int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void heapify(int ind, int scope) {
        int left = 2 * ind + 1;
        int right = 2 * ind + 2;
        int largest = ind;

        if (left <= scope && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right <= scope && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != ind) {
            h_swap(ind, largest);
            heapify(largest, scope);
        }
    }



}
