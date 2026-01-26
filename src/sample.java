import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        int k = 0;
        int lim=1;
        int ind =0;
        int max=0;
        int prev=0;
        int next=0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c =='o' || c=='u'){
                prev=next;
                next=i;
                k++;
                if (k > lim){
                    max = Math.max(max,i-ind+1);
                    ind=prev;

                }
            }
        }
        max = Math.max(max,s.length()-ind);
        System.out.println(max);
    }
}
