import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class ProjectEuler {
    int sum = 0;

    ProjectEuler() throws Exception{
        File file = new File("boards.txt");
        int[][] current = new int[9][9];
        Scanner scan = new Scanner(file);

        String temp;
        int row = 0;
        while(scan.hasNextLine()){
            temp = scan.nextLine();
            if(temp.length() == 9){
                String[] let = temp.split("");
                for(int i = 0; i < temp.length(); i++){
                    current[row][i] = Integer.parseInt(let[i]);
                }
                row++;
            }
            if(row == 9){
                Sudoku board = new Sudoku(current);
                SudokuSolver solve = new SudokuSolver(board);
                System.out.println(board.toString());
                this.sum += board.board[0][0]*100 + board.board[0][1]*10 + board.board[0][2];
                row = 0;
            }
        }
    }

    public String toString(){
        return "The answer to Project Euler #96: " + this.sum;
    }
}

