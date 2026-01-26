import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class city_graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> st = new HashMap<>();
        int ind=0;
        int i=18;
        st.put("BTQ",ind++);
        st.put("AMD",ind++);
        st.put("MAA",ind++);
        st.put("BLR",ind++);
        st.put("HYD",ind++);
        st.put("DEL",ind++);
        st.put("CCU",ind++);
        st.put("LKO",ind++);
        st.put("COK",ind++);
        st.put("BOM",ind++);
        int [][] adj = new int[10][10];
        while(i!=0){
            String [] arr = new String[3];
            arr = sc.nextLine().split(",");
            adj[st.get(arr[0])][st.get(arr[1])] = Integer.parseInt(arr[2]);
            i--;
        }
        for( i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
BTQ,LKO,23
DEL,BOM,10
MAA,DEL,18
HYD,BLR,15
AMD,DEL,12
BOM,CCU,16
COK,BLR,23
HYD,CCU,21
MAA,AMD,16
AMD,BTQ,9
DEL,HYD,11
LKO,CCU,6
CCU,BLR,14
DEL,LKO,21
MAA,HYD,22
BTQ,HYD,27
DEL,BTQ,17
LKO,BOM,10
 */
