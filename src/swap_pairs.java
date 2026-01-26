import java.util.Scanner;

public class swap_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String res = "";
        for(int i=1;i<word.length();i+=2){
            res += (char)word.charAt(i);
            res += (char) word.charAt(i - 1);

        }
        System.out.println(res);
    }
}
