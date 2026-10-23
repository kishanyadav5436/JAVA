class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int maxK = -1;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                if (maxK == -1) {
                    maxK = nums[i];
                } else {
                    maxK &= nums[i];
                }
            }
        }
        
        return maxK == -1 ? 0 : maxK;
    }
}