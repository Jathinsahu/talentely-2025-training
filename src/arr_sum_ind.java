import java.util.Scanner;

public class arr_sum_ind {
    static void swp(int[]arr,int sum,int ind){
        if(ind==-1){
            return ;
        }
        int temp=arr[ind];
        arr[ind]=sum;
        swp(arr,sum+temp,ind-1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6};
        swp(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
