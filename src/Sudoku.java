public class Sudoku {
    int numberOfZeroes = 0;
    public int [][] board;

    Sudoku() {
        this.board  = new int[][] {
                {0,0,3,0,2,0,6,0,0},
                {9,0,0,3,0,5,0,0,1},
                {0,0,1,8,0,6,4,0,0},
                {0,0,8,1,0,2,9,0,0},
                {7,0,0,0,0,0,0,0,8},
                {0,0,6,7,0,8,2,0,0},
                {0,0,2,6,0,9,5,0,0},
                {8,0,0,2,0,3,0,0,9},
                {0,0,5,0,1,0,3,0,0}
        };
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board.length; c++){
                if(board[r][c] == 0){
                    numberOfZeroes++;
                }
            }
        }
    }

    Sudoku(int[][] board) {
        this.board = board;
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board.length; c++){
                if(board[r][c] == 0){
                    numberOfZeroes++;
                }
            }
        }
    }




    public String toString(){
        System.out.println("Project Euler sudoku board solved: ");
        StringBuilder ret = new StringBuilder();

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board.length; c++){
                ret.append(board[r][c] + " ");
            }
            ret.append("\n");
        }
        return ret.toString();
    }
}