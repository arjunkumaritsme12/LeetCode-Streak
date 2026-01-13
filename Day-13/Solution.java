package Day-13;
import java.util.*;

class Solution {
    public double separateSquares(int[][] squares) {
        double low = 0;
        double high = 0;

        for (int[] sq : squares) {
            high = Math.max(high, sq[1] + sq[2]);
        }

        for (int i = 0; i < 80; i++) {
            double mid = (low + high) / 2.0;

            double below = 0;
            double above = 0;

            for (int[] sq : squares) {
                double y = sq[1];
                double l = sq[2];
                double top = y + l;

                if (mid <= y) {
                    above += l * l;
                } else if (mid >= top) {
                    below += l * l;
                } else {
                    below += (mid - y) * l;
                    above += (top - mid) * l;
                }
            }

            if (below < above) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
