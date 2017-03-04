/**
 * Created by sam on 4/3/17.
 */
public class Utils {
    public static void printMatrix(int ar[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ar[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
