import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> set = new HashSet<>();

        // Store all numbers from nums
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> result = new ArrayList<>();

        // Check numbers from 1 to n
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}