import java.util.Arrays;

class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        
        int uniqueCount = 1; // Start at 1 for the first element
        
        for (int i = 0; i < candyType.length - 1; i++) {
            if (candyType[i] != candyType[i + 1]) {
                uniqueCount++;
            }
        }
        
        return Math.min(uniqueCount, candyType.length / 2);
    }
}