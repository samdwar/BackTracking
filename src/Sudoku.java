/**
 * Created by sam on 4/3/17.
 */
public class Sudoku {
    public static final int ROW = 9;
    public static final int COL = 9;

    public boolean solveSudoku(int grid[][]) {
        if (solveSudokuUtils(grid) == false) {
            return false;
        }
        Utils.printMatrix(grid, ROW, COL);
        return true;
    }

    private boolean solveSudokuUtils(int[][] grid) {
        boolean isUnAssigned = false;
        int i = 0;
        int j = 0;
        for (i = 0; i < ROW; i++) {
            for (j = 0; j < COL; j++) {
                if (grid[i][j] == 0) {
                    isUnAssigned = true;
                    break;
                }
            }
            if (isUnAssigned) {
                break;
            }
        }

        if(i==ROW || j == COL){
            return true;
        }

        for (int num = 1; num <= 9; num++) {
            if (isSafe(grid, i, j, num)) {
                grid[i][j] = num;
                if (solveSudokuUtils(grid)) {
                    return true;
                }
            }
            grid[i][j] = 0;
        }
        return false;
    }

    private boolean isSafe(int[][] grid, int row, int col, int num) {
        return (isVerticalOk(grid, col, num) && isHorizontalOk(grid, row, num) && canNumberBePlaceInBox(grid, row, col, num));
    }

    private boolean canNumberBePlaceInBox(int[][] grid, int row, int col, int num) {
        int newRow = row - row % 3;
        int newCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + newRow][j + newCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isHorizontalOk(int[][] grid, int row, int num) {
        for (int i = 0; i < COL; i++) {
            if (grid[row][i] == num) {
                return false;
            }
        }
        return true;
    }

    private boolean isVerticalOk(int[][] grid, int col, int num) {
        for (int i = 0; i < ROW; i++) {
            if (grid[i][col] == num) {
                return false;
            }
        }
        return true;
    }

}
