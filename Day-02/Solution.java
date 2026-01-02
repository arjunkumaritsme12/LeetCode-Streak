package Day-02;
import java.util.*;

class Solution {
  public int repeatedNTimes(int[] arr) {

    for (int i = 0; i < arr.length; i++) {

      if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
        return arr[i];
      }

      if (i + 2 < arr.length && arr[i] == arr[i + 2]) {
        return arr[i];
      }
    }

    return arr[arr.length - 1];
  }
}
