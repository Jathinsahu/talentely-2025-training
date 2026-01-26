import java.util.Scanner;

public class diag_traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int ind=0;ind<2*n-1;ind++){
            for(int i=0;i<=ind;i++){
                if(ind-i<=n-1 && i<=n-1) {
                    if (ind % 2 != 0) {
                        System.out.print("[" + i + "," + (ind - i) + "]  ");
                    } else {
                        System.out.print("[" + (ind - i) + "," + i + "]  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
