
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(arr);

        long sum = 0;
        int n = arr.length;
        int half = n / 2;

        for (int i = 0; i < half; i++) {
            sum -= arr[i];
        }

        for (int i = half; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
