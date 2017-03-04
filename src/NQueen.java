/**
 * Created by sam on 4/3/17.
 */
public class NQueen {
    public static final int ROW = 4;
    public static final int COl = 4;

    public void solveQueen(int board[][]) {
        if (solveQueenUtils(board, 0, 0) == false) {
            System.out.println("Cannot Place Queen in this Board");
            return;
        }
        Utils.printMatrix(board, ROW, COl);
    }

    private boolean solveQueenUtils(int[][] board, int row, int col) {
        if (col >= COl) {
            return true;
        }
        for (int i = 0; i < COl; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solveQueenUtils(board, i, col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int[][] board, int row, int col) {
        /*Check for vertical*/
        for (int i = 0; i < ROW; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        /*Check for horizontal*/

        for (int i = 0; i < COl; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        /*check for upper left diagonal*/
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        /*Check for upper right diagonal*/
        for (int i = row, j = col; i >= 0 && j < COl; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

}
