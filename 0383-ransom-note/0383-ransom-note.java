class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    
    
    // 2. Initialize frequency array
    int[] freq = new int[26];
    for(int i = 0; i < magazine.length(); i++) {
        freq[magazine.charAt(i) - 'a']++;
    }


    // 3. Calculate frequency in s
    for(int i = 0; i < ransomNote.length(); i++) {
    freq[ransomNote.charAt(i) - 'a']--;

    if(freq[ransomNote.charAt(i) - 'a'] < 0) {
        return false;
    }
}

    // 4. Remove frequency using t
    

   
    return true;
}

    }
