class Solution {
    public int mySqrt(int x) {
        // Base cases
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x / 2; // Square root of x <= x/2 for x >= 4
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Using division to prevent integer overflow (mid * mid <= x)
            if (mid <= x / mid) {
                ans = mid;      // mid is a valid potential answer
                left = mid + 1; // Try to find a larger valid integer
            } else {
                right = mid - 1; // mid is too large, search left half
            }
        }

        return ans;
    }
}