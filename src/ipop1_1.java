import java.util.*;
public class ipop1_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c;
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        int max = 0;
        for(int i=0;i<n;i++){
            c =0;
            for(int j=i;j<n;j++){
                if (arr[j]==0){
                    c++;
                }

                if(c>k ){

                    break;
                }

                max = Math.max(j-i+1,max);
            }
        }
        System.out.println(max);
    }
}
