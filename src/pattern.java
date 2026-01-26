import java.util.Scanner;

public class pattern {
    static void pattern(int n,int size,int num){

        System.out.print(num+" ");
        if (num <=0) return;
        pattern(n,size,num-size);
        System.out.print(num+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n,5,n);
    }
}
