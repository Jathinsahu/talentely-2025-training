import java.util.Scanner;

public class split_palindrome {

    static boolean IsPalindrome(char[] s, int start, int end) {
//        end--;
        while (start < end) {
            if (s[start] != s[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static void print(char[] s,int start,int end){
        for(start=start;start<=end;start++){
            System.out.print(s[start]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int left = 0;
        int right = s.length-1;
        long startTime = System.nanoTime();

        for(left=0;left<s.length-1;left++) {
            if (IsPalindrome(s, 0, left)) {
                for(right=s.length-1;right>left;right--) {
                System.out.println("left: "+left+" right: "+right);
                    if (IsPalindrome(s, right, s.length - 1)) {
                        if (IsPalindrome(s, left+1, right - 1)) {
                            print(s,0,left);
                            print(s,left+1,right-1);
                            print(s,right,s.length-1);
                            System.out.println("has 3 palindromes");
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println("Impossible");
        long endTime = System.nanoTime(); // End timer

        long duration = endTime - startTime; // Time in nanoseconds
        System.out.println("Execution time: " + duration + " ns");

        // Optional: Convert to milliseconds
        System.out.println("Execution time: " + (duration / 1_000_000.0) + " ms");
    }
}
