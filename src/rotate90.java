import java.util.Scanner;

public class rotate90 {
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
                System.out.print(a[j][2 - i]);
            }
            System.out.println();
        }
        System.out.println("***************180***********************");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(a[2-i][2 - j]);
            }
            System.out.println();
        }
        System.out.println("***************90***********************");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(a[2-j][i]);
            }
            System.out.println();
        }
    }
}
