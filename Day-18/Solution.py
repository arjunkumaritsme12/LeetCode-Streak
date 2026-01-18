import java.util.*;

class Solution {

    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] row = new int[m + 1][n + 1];
        int[][] col = new int[m + 1][n + 1];
        int[][] d1 = new int[m + 1][n + 1];
        int[][] d2 = new int[m + 2][n + 2];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                row[i][j] = row[i][j - 1] + grid[i - 1][j - 1];
                col[i][j] = col[i - 1][j] + grid[i - 1][j - 1];
                d1[i][j] = d1[i - 1][j - 1] + grid[i - 1][j - 1];
                d2[i][j] = d2[i - 1][j + 1] + grid[i - 1][j - 1];
            }
        }

        int ans = 1;

        for (int k = 2; k <= Math.min(m, n); k++) {
            for (int i = k; i <= m; i++) {
                for (int j = k; j <= n; j++) {

                    int sum = row[i][j] - row[i][j - k];

                    if (d1[i][j] - d1[i - k][j - k] != sum) continue;
                    if (d2[i][j - k + 1] - d2[i - k][j + 1] != sum) continue;

                    boolean ok = true;

                    for (int r = i; r > i - k; r--) {
                        if (row[r][j] - row[r][j - k] != sum) {
                            ok = false;
                            break;
                        }
                    }

                    for (int c = j; c > j - k && ok; c--) {
                        if (col[i][c] - col[i - k][c] != sum) {
                            ok = false;
                            break;
                        }
                    }

                    if (ok) ans = k;
                }
            }
        }

        return ans;
    }
}
