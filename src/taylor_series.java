import java.math.BigDecimal;
import java.util.Scanner;

public class taylor_series {

    static float taylor(float n, float k, float ans, float fact, float res, int count){
        System.out.println("n = " + n + ", k = " + k + ", ans = " + (ans+res*n / (fact*count)) + ", down = " + fact*count + ", up = " + res*n + ", count = " + count);
        if (count == k){
            return ans+( (res*n) / (fact*count));
        }else{
            return taylor(n,k,ans+( (res*n) / (fact*count)),fact*count,res*n,count+1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float k = sc.nextFloat();
        System.out.println(taylor(n,k,1,1,1,1));
    }
}
