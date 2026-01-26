import java.util.Scanner;

public class large_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        String s2 = sc.next();
        String buff = "";
//        int diff = s1.length()-s2.length();
//        if (diff != 0){
//            for(int i=0;i<diff;i++)  buff += '0';
//            if(diff > 0){
//
//            }
//        }


        int l1= s1.length()-1;
        int l2=s2.length()-1;
        System.out.println(l1);
        System.out.println(l2);
        int d1=0;
        int d2=0;
        int carry =0;
        while(l1 != -1 && l2 != -1){
            d1 = s1.charAt(l1)-'0';
            d2 = s2.charAt(l2)-'0';
            buff = Integer.toString((d1+d2+carry)%10) + buff;
            carry = (d1+d2+carry)/10;
            l1--;
            l2--;
        }
        if(l1>=0) {
            while (l1 >= 0) {
                d1 = s1.charAt(l1) - '0';
                buff = Integer.toString((d1 + carry) % 10) + buff;
                carry = (d1 + carry) / 10;
                l1--;

            }
        }
        if(l2>=0) {
            while (l2 >= 0) {
                d2 = s2.charAt(l2) - '0';
                buff = Integer.toString((d2 + carry) % 10) + buff;
                carry = (d2 + carry) / 10;
                l2--;
            }
        }
        if (carry !=0){
            buff = Integer.toString(carry) + buff;
        }
        System.out.println(buff);

    }
}
