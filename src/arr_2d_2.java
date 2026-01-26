import java.util.Scanner;

public class arr_2d_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<m*n;i++){
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
