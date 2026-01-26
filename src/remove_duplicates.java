import java.util.Scanner;

public class remove_duplicates {

    static int loop(char[] c,int i){
        if (i+1>=c.length) return i+1;
        if(c[i]!=c[i+1]) return i+1;
        return loop(c,i+1);
    }

    static String remove_duplicate(char[]c,String res,int i){
        if(i>=c.length) return res;
        if (i+1 < c.length && c[i]==c[i+1]){
            i = loop(c,i);
            return remove_duplicate(c,res,i);
        }
        else{
            res = remove_duplicate(res.toCharArray(),"",0);
            if(res.equals("") || res.charAt(res.length()-1)!=c[i]){
                return remove_duplicate(c,res+c[i],i+1);
            }
            else{
                res = res.substring(0,res.length()-1);
                return remove_duplicate(c,res,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] c = sc.next().toCharArray();
        System.out.println(remove_duplicate(c,"",0));
    }
}
