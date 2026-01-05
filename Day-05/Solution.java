import java.util.*;

class Solution {
  public long maxMatrixSum(int[][] matrix) {

    long sum = 0;
    int minAbsValue = Integer.MAX_VALUE;
    boolean isNegativeCountOdd = false;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {

        int value = matrix[i][j];
        int absValue = Math.abs(value);

        sum += absValue;

        if (absValue < minAbsValue) {
          minAbsValue = absValue;
        }

        if (value < 0) {
          isNegativeCountOdd = !isNegativeCountOdd;
        }
      }
    }

    if (isNegativeCountOdd) {
      sum -= 2L * minAbsValue;
    }

    return sum;
  }
}