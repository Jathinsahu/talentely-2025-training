import java.util.Scanner;

public class isalpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s="";
        while(n!=0){
            if (n/1000 > 0){
                s += 'M';
                n -= 1000;
            }
            else if(n==999){
                s += "IM";
                n -= 999;
            }
            else if (n/500 > 0){
                s += 'D';
                n -= 500;
            }
            else if(n==499){
                s += "ID";
                n -= 499;
            }
            else if (n/100 > 0){
                s += 'C';
                n -= 100;
            }
            else if(n==99){
                s += "IC";
                n -= 99;
            }
            else if (n/50 > 0){
                s += 'L';
                n -= 50;
            }
            else if(n==49){
                s += "IL";
                n -= 49;
            }
            else if (n/10 > 0){
                s += 'X';
                n -= 10;
            }
            else if(n==9){
                s += "IX";
                n -= 9;
            }
            else if (n/5 > 0){
                s += 'V';
                n -= 5;
            }
            else if(n==4){
                s += "IV";
                n -= 4;
            }
            else{
                s += 'I';
                n--;
            }
        }
        System.out.println(s);
    }
}
