class SudokuSolver {
    private Sudoku sud;

    SudokuSolver(Sudoku sud){
        this.sud = sud;
        solve(sud.board, 0, 0);
    }

    private boolean solve(int[][] board, int row, int col) {
        if(col >= board.length){
            col = 0;
            row++;
        }

        if (sud.numberOfZeroes == 0 || row == 9) {
            return true;
        }

        if(board[row][col] == 0){
            for(int num = 1; num < 10; num++){
                if(validPos(board, row, col, num)){
                    board[row][col] = num;
                    sud.numberOfZeroes--;

                    if(solve(sud.board, row, col + 1)){
                        return true;
                    }
                    else{
                        board[row][col] = 0;
                        sud.numberOfZeroes++;
                    }
                }
            }

        }else{
            return solve(sud.board, row, col + 1);
        }

        return false;
    }

    private boolean validPos(int[][] board, int row, int col, int target){
        return (noRow(board, row, target) && noCol(board, col, target) && noSquare(board, row, col, target));
    }

    private boolean noRow(int[][] board, int row, int target){
        for(int c = 0; c < board.length; c++){
            if(board[row][c] == target){
                return false;
            }
        }

        return true;
    }

    private boolean noCol(int[][] board, int col, int target){
        for(int r = 0; r < board.length; r++){
            if(board[r][col] == target){
                return false;
            }
        }

        return true;
    }

    private boolean noSquare(int[][] board, int row, int col, int target){
        int start_row = row / 3;
        int start_col = col / 3;

        for(int r = start_row * 3; r < (start_row*3 + 3); r++){
            for(int c = start_col * 3; c < (start_col*3 + 3); c++) {

                if(board[r][c] == target){
                    return false;
                }
            }
        }
        return true;
    }
}
