class Solution {
    public int minOperations(String s) {
        int n = s.length();
        
        // 1. Check if already sorted
        boolean sorted = true;
        char mn = s.charAt(0);
        char mx = s.charAt(0);
        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
            }
            mn = (char) Math.min(mn, s.charAt(i));
            mx = (char) Math.max(mx, s.charAt(i));
        }
        
        if (sorted) {
            return 0;
        }
        
        // 2. Length 2 cannot have a proper substring containing both elements
        if (n == 2) {
            return -1;
        }
        
        // 3. One operation if min is already at index 0 or max is at index n - 1
        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) {
            return 1;
        }
        
        // 4. Two operations if min or max appears anywhere in the interior elements
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == mn || s.charAt(i) == mx) {
                return 2;
            }
        }
        
        // 5. Otherwise, it takes 3 operations
        return 3;
    }
}