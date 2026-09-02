class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;

        for (int end = 0; end <= n; end++) {
            // When reaching a space or the end of the string, reverse the current word
            if (end == n || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return new String(arr);
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}