import java.util.Scanner;
public class tester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        subsequence tc1 = new subsequence(word1,word2);
        if(tc1.findSubsequence(0,0)) System.out.print("True");
        else System.out.print("False");
    }

}
