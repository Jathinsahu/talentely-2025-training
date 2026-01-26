import java.util.Scanner;

public class rev_sum {

    static int reverse_sum(int n,int res,int pos1,int pos2){
        if(pos1 > n)  return res;
        return reverse_sum(n,res* 10 + (n/pos1)%10 + (n/pos2)%10,pos1 *= 10,pos2 /= 10);

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse_sum(num,0,1,(int)Math.pow(10,(int)Math.log10(num))));

    }
}
