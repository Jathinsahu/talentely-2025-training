import java.util.Scanner;

public class new_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = Math.max((i/2)*((i/2)+ 1),1) ; j <= (i/2)*((i/2) + 1) + i-1; j++) {
                System.out.print((2*(j)-(i%2))+" ");
            }
            System.out.println();
        }

    }
}
