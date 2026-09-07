class Solution{
boolean isAnagram(String s, String t) {

    // 1. Check length
    if(s.length() != t.length()) {
        return false;
    }

    // 2. Initialize frequency array
    int[] freq = new int[26];

    // 3. Calculate frequency in s
    for(int i = 0; i < s.length(); i++) {
        freq[s.charAt(i) - 'a']++;
    }

    // 4. Remove frequency using t
    for(int i = 0; i < t.length(); i++) {
        freq[t.charAt(i) - 'a']--;
    }

    // 5. Check frequency
    for(int i = 0; i < 26; i++) {
        if(freq[i] != 0) {
            return false;
        }
    }

    return true;
}
}
