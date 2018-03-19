public class Main {

    public static void main(String[] args) {
        EightQueens test = new EightQueens(8);
        Sudoku test2 = new Sudoku();

        ChessSolver solve = new ChessSolver(test);
        SudokuSolver solve2 = new SudokuSolver(test2);

        int sum = 0;


        System.out.println(test.toString());
        System.out.println(test2.toString());

        try {
            ProjectEuler read = new ProjectEuler();
            System.out.println(read);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
