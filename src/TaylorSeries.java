import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class TaylorSeries {

    static BigDecimal taylor(BigDecimal x, int k, BigDecimal ans, BigDecimal fact, BigDecimal power, int count, MathContext mc) {
        if (count > k) {
            return ans;
        }

        power = power.multiply(x, mc);         // x^count
        fact = fact.multiply(BigDecimal.valueOf(count), mc); // count!
        ans = ans.add(power.divide(fact, mc), mc);

        return taylor(x, k, ans, fact, power, count + 1, mc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal x = sc.nextBigDecimal(); // Value of x
        int k = sc.nextInt(); // Number of terms

        MathContext mc = new MathContext(20); // Precision setting

        BigDecimal result = taylor(x, k, BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE, 1, mc);
        System.out.println("e^" + x + " ≈ " + result);
    }
}
