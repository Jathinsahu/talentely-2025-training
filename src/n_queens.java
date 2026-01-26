import java.util.Arrays;
import java.util.Scanner;

class n_queens {
    int n;
    byte [] board;
    boolean flag=true;
    n_queens(int n){
        this.n = n;
        board = new byte[n];
        for(int i =0;i<n;i++){
            board [i]=-1;
        }
        place_queen(board, (byte) 0);
    }

    public boolean check_left_diag(byte[] board,byte i,byte j){
        while(i>=0 && j>=0){
            if(board[i--]==j--) return false;
        }
        return true;
    }

    public boolean check_right_diag(byte[] board,byte i,byte j){
        while(i>=0 && j< board.length){
            if(board[i--]==j++) return false;
        }
        return true;
    }

    public boolean check_top(byte[] board,byte i,byte j){
        while(i>=0){
            if(board[i--]==j) return false;
        }
        return true;
    }

    public boolean is_safe(byte[] board,byte i,byte j){
        return check_top(board,i,j) && check_left_diag(board,i,j) && check_right_diag(board,i,j);
    }


    public void place_queen(byte[] board,byte i){
        if(i==board.length) {
            flag=false;
            return;
        }
        if(flag) {
            for (byte k = 0; k < board.length; k++) {
                if (is_safe(board, i, k)) {
                    board[i] = k;
                    place_queen(board, (byte) (i + 1));
                    if (!flag) return;
                    board[i] = -1;
                }
            }
        }

    }

    void print(){
        for(int x=0;x< board.length;x++){
            for(byte y=0;y< board.length;y++){
                if(board[x]==y) System.out.print("Q");
                else System.out.print(".");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n_queens queen = new n_queens(n);
        queen.print();

    }
}
