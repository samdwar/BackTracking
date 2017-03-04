/**
 * Created by sam on 4/3/17.
 */
public class RatInMaze {
    public static final int ROW = 4;
    public static final int COL = 4;
    private static int[][] solution = new int[ROW][COL];

    public void printPathForRat(int[][] ar) {
        if (printPathForRatUtils(ar, 0, 0) == false) {
            System.out.println("Solution Does not exists");
            return;
        }
        Utils.printMatrix(solution, ROW, COL);
    }

    private boolean printPathForRatUtils(int[][] ar, int r, int c) {
        if (r == ROW - 1 && c == COL - 1) {
            solution[r][c] = 1;
            return true;
        }
        if (isSafe(ar, r, c)) {
            solution[r][c] = 1;
            if (printPathForRatUtils(ar, r, c + 1)) {
                return true;
            }

            if (printPathForRatUtils(ar, r + 1, c)) {
                return true;
            }

            solution[r][c] = 0;
        }
        return false;
    }


    private boolean isSafe(int ar[][], int r, int c) {
        return (r >= 0 && r < ROW && c >= 0 && c < COL && ar[r][c] == 1);
    }
}

