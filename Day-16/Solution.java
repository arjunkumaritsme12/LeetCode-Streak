import java.util.*;

class Solution {

    static final int MOD = 1_000_000_007;

    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {

        int[] h = addBordersAndSort(hFences, m);
        int[] v = addBordersAndSort(vFences, n);

        Set<Integer> verticalGaps = buildGaps(v);

        int maxSide = -1;

        for (int i = 0; i < h.length; i++) {
            for (int j = i + 1; j < h.length; j++) {
                int gap = h[j] - h[i];
                if (verticalGaps.contains(gap)) {
                    maxSide = Math.max(maxSide, gap);
                }
            }
        }

        if (maxSide == -1) return -1;

        long area = (long) maxSide * maxSide;
        return (int) (area % MOD);
    }

    private int[] addBordersAndSort(int[] fences, int limit) {
        int[] arr = new int[fences.length + 2];
        arr[0] = 1;
        arr[1] = limit;

        for (int i = 0; i < fences.length; i++) {
            arr[i + 2] = fences[i];
        }

        Arrays.sort(arr);
        return arr;
    }

    private Set<Integer> buildGaps(int[] fences) {
        Set<Integer> gaps = new HashSet<>();
        for (int i = 0; i < fences.length; i++) {
            for (int j = i + 1; j < fences.length; j++) {
                gaps.add(fences[j] - fences[i]);
            }
        }
        return gaps;
    }
}
