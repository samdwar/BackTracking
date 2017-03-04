/**
 * Created by sam on 4/3/17.
 */
public class Main {
    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        RatInMaze ratInMaze = new RatInMaze();
        System.out.println("Solution for Rate in Maze");
        ratInMaze.printPathForRat(maze);


        int board[][] = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        System.out.println("Solution for N Queens Problems");
        NQueen nQueen = new NQueen();
        nQueen.solveQueen(board);


        System.out.println("Solution of Sudoku");
        int grid[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        Sudoku sudoku = new Sudoku();
        sudoku.solveSudoku(grid);

    }
}
