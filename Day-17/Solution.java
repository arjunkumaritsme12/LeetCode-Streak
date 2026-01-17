class Solution {

    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int maxSide = 0;
        int n = bottomLeft.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int xOverlap = Math.min(topRight[i][0], topRight[j][0])
                             - Math.max(bottomLeft[i][0], bottomLeft[j][0]);

                int yOverlap = Math.min(topRight[i][1], topRight[j][1])
                             - Math.max(bottomLeft[i][1], bottomLeft[j][1]);

                if (xOverlap > 0 && yOverlap > 0) {
                    int side = Math.min(xOverlap, yOverlap);
                    maxSide = Math.max(maxSide, side);
                }
            }
        }

        return (long) maxSide * maxSide;
    }
}
