package Day-34;

class Solution {
    /**
     * Checks if the array follows a trionic pattern:
     * 1. Strictly increasing sequence
     * 2. Followed by strictly decreasing sequence  
     * 3. Followed by strictly increasing sequence
     * All three segments must exist with at least one element each.
     * 
     * @param nums input array to check
     * @return true if array follows trionic pattern, false otherwise
     */
    public boolean isTrionic(int[] nums) {
        int arrayLength = nums.length;
        int currentIndex = 0;
      
        while (currentIndex < arrayLength - 2 && nums[currentIndex] < nums[currentIndex + 1]) {
            currentIndex++;
        }
      
        if (currentIndex == 0) {
            return false;
        }
      
        int peakIndex = currentIndex;
      
        while (currentIndex < arrayLength - 1 && nums[currentIndex] > nums[currentIndex + 1]) {
            currentIndex++;
        }
    
        if (currentIndex == peakIndex || currentIndex == arrayLength - 1) {
            return false;
        }
      
        while (currentIndex < arrayLength - 1 && nums[currentIndex] < nums[currentIndex + 1]) {
            currentIndex++;
        }
      
        return currentIndex == arrayLength - 1;
    }
}