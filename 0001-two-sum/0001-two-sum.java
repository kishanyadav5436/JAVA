class Solution {
    public int[] twoSum(int[] nums, int target) {

        // 1. Create HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // 2. Traverse array
        for(int i = 0; i < nums.length; i++) {

            // 3. Current number
            int current = nums[i];

            // 4. Number needed
            int needed = target - current;

            // 5. Check if needed already exists
            if(map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            // 6. Store current number and index
            map.put(current, i);
        }

        return new int[]{};
    }
}