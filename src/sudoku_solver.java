import java.util.Arrays;

class sudoku_solver {
    int [][] sudoku;
    sudoku_solver(int [][] sudoku){
        this.sudoku = sudoku;
        solve();
    }


    boolean check_row(int i,int val){
        for (int j = 0; j < sudoku.length; j++) {
            if(sudoku[i][j]==val) return false;
        }
        return true;
    }

    boolean check_col(int j,int val){
        for (int i = 0; i < sudoku.length; i++) {
            if(sudoku[i][j]==val) return false;
        }
        return true;
    }

    boolean check_box(int row,int col,int val){
        for (int i = (row/3)*3; i < (row/3)*3 + 3; i++) {
            for(int j = (col/3)*3;j<(col/3)*3 + 3;j++){
                if(sudoku[i][j]==val) return false;
            }
        }
        return true;
    }

    boolean possible(int i,int j,int k){
        return check_row(i,k)&&check_col(j,k)&&check_box(i,j,k);
    }

    boolean solve() {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(sudoku[i][j] == 0) {
                    for(int k = 1; k <= 9; k++) {
                        if(possible(i, j, k)) {
                            sudoku[i][j] = k;
                            if(solve()) return true;
                            sudoku[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    void print(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        sudoku_solver s = new sudoku_solver(sudoku);
        s.print();
    }

}
