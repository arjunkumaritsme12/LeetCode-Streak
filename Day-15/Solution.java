package Day-15;

import java.util.*;

class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxHorizontal = findMaxGap(hBars);
        int maxVertical = findMaxGap(vBars);

        int side = Math.min(maxHorizontal, maxVertical);
        return side * side;
    }

    private int findMaxGap(int[] bars) {
        Arrays.sort(bars);

        int longest = 2;
        int current = 1;

        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                current++;
            } else {
                current = 1;
            }
            longest = Math.max(longest, current + 1);
        }

        return longest;
    }
}
