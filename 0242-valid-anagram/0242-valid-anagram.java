import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();

        // Count frequency of each character in s
        for (char ch : s.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        // Decrement and clean up characters matching t
        for (char ch : t.toCharArray()) {
            if (!count.containsKey(ch)) {
                return false;
            }

            int currentCount = count.get(ch) - 1;
            if (currentCount == 0) {
                count.remove(ch);
            } else {
                count.put(ch, currentCount);
            }
        }

        return count.isEmpty();
    }
}