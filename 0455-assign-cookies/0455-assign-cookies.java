import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Step 1: Sort both arrays
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0; // Pointer for children (g)
        int j = 0; // Pointer for cookies (s)
        
        // Step 2: Iterate through both arrays
        while (i < g.length && j < s.length) {
            // If the cookie is large enough to satisfy the child
            if (s[j] >= g[i]) {
                i++; // Move to the next child
            }
            j++; // Move to the next cookie in any case
        }
        
        // 'i' represents the count of content children
        return i;
    }
}