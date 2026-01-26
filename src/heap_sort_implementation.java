public class heap_sort_implementation {
    public static void main(String[] args) {
        int[] arr = {5,15,10,25,55,35,75,45,95,50,70,40,60,90,3};
        heap_sort h = new heap_sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
