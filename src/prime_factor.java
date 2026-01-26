import java.util.Scanner;

public class prime_factor {

    static int next_prime(int p){
        if (p<2) return 2;
        if (p==2) return 3;
        if (p==3) return 5;
        if (isprime(p,2)) return p;
        if(isprime(p+2,2)) return p+2;
        return next_prime(p+6);
    }

    static boolean isprime(int n,int i) {
        if (i > Math.sqrt(n)) return true;
        if(n%i==0) return false;
        return isprime(n,i+1);
    }

    static void prime_factors(int n,int p){
        if (n < 2) return;
        if (n%p==0){
            System.out.print(p+"x");
            prime_factors(n/p,p);
        }
        else prime_factors(n,next_prime(p));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime_factors(n,2);
        System.out.print("\b");
    }
}
