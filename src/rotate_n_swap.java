import java.util.Scanner;

public class rotate_n_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int[][] a = new int[n1][n1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("***************270***********************");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(a[j][2 - i]); // element inserted here
            }
            System.out.println();
        }
    }
}
