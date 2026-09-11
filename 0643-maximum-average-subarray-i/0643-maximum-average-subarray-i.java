class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Calculate the sum of the first window of size k
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        
        double maxSum = currentSum;
        
        // Slide the window across the rest of the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum / k;
    }
}