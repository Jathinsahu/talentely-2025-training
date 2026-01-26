import java.util.*;
public class Main
{
    public static int base3 (int t,int base){
        if (t==0) return 0;

        int temp=0;
        int val = 0;
        int m=0;
        int s = (int)(Math.log(t)/Math.log(base)) + 1;
        m = 1;
        for(int j=s-1;j>=0;j--){
            temp = (int)Math.pow(base,j);
            val = (val*10) +  t/temp;
            t %= temp;
        }
        return val;
    }

    public static int xor(int num1,int num2,int base){
        int a = base3(num1,base);
        int b = base3(num2,base);
        int div;
        int res = 0;
        int m = Math.max(a,b);
        for(int i=0;i<=(int)Math.log10(m);i++){
            div = (int)Math.pow(10,i);
            res += ((a%10 + b%10)% base)*div;
            a /= 10;
            b/=10;
        }
        return decimal(res,base);
    }

    public static int decimal(int num1,int base){
        int r = (int)Math.log10(num1) + 1;
        int res =0;
        for(int i=0;i<r;i++){
            res += num1%10 * (int)Math.pow(base,i);
            num1/= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int base = 3;


        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

            res = xor(res,arr[i],base) ;

        }

        System.out.println(res);
    }
}