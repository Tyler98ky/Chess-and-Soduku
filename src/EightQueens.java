public class EightQueens {
    int size;
    int[][] board;
    int numOfQueens = 0;

    EightQueens(){
        this(8);
    }

    EightQueens(int size){
        this.size = size;
        this.board = new int[size][size];
    }

    public String toString(){
        System.out.println("Chess board of size " + this.size + ":");
        StringBuilder ret = new StringBuilder();

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board.length; c++){
                if(board[r][c] == 1)
                    ret.append("Q ");
                else
                    ret.append("- ");
            }
            ret.append("\n");
        }
        return ret.toString();
    }
}
