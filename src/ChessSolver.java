class ChessSolver {
    private EightQueens chess;

    ChessSolver(EightQueens subject){
        this.chess = subject;

        solve(chess.board, 0);
    }



    private boolean solve(int[][] board, int col){
        if(col == 8){
            col = 0;
        }
        if(chess.numOfQueens == chess.size){
            return  true;
        }

        for(int r = 0; r < board.length; r++) {
            if (validPos(chess.board, r, col)) {
                board[r][col] = 1;
                chess.numOfQueens++;

                if (solve(chess.board, col + 1)) {
                    return true;
                }
                else{
                    board[r][col] = 0;
                    chess.numOfQueens--;
                }
            }
        }
        return false;
    }

    private boolean validPos(int[][] board, int row, int col){
        return (noRow(board, row) && noDiag(board, row, col));
    }

    private boolean noRow(int[][] board, int row){
        for(int c = 0; c < board.length; c++){
            if (board[row][c] == 1){
                return false;
            }
        }
        return true;
    }

    private boolean noDiag(int[][] board, int row, int col){
        for(int i = 1; i < board.length; i++){
            if(row - i >= 0 && col - i >= 0){ // top left diagonal
                if(board[row - i][col - i] == 1)    return false;
            }
            if(row + i < board.length && col + i < board.length) { // bottom right diagonal
                if (board[row + i][col + i] == 1) return false;
            }
            if(row - i >= 0 && col + i < board.length) { // top right diagonal
                if (board[row - i][col + i] == 1) return false;
            }
            if(row + i < board.length && col - i >= 0) { // bottom left diagonal
                if (board[row + i][col - i] == 1) return false;
            }
        }

        return true;
    }
}
