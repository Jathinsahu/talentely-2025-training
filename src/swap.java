import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String[] s = n1.split(" ");
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        String ans = "";
        for(String i : s) {
            ans += i;
            ans += ' ';
        }
        System.out.println(ans);
    }
}
