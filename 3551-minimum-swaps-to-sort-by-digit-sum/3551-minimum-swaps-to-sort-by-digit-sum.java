import java.util.Arrays;

class Solution {
    
    private int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    class Element implements Comparable<Element> {
        long val;
        int originalIndex;
        int digitSum;

        public Element(long val, int originalIndex) {
            this.val = val;
            this.originalIndex = originalIndex;
            this.digitSum = getDigitSum((int) val);
        }

        @Override
        public int compareTo(Element other) {
            if (this.digitSum != other.digitSum) {
                return Integer.compare(this.digitSum, other.digitSum);
            }
            return Long.compare(this.val, other.val);
        }
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        Element[] arr = new Element[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Element(nums[i], i);
        }

        Arrays.sort(arr);

        boolean[] visited = new boolean[n];
        int cycles = 0;

        for (int i = 0; i < n; i++) {
            // If already visited or already in the correct position, skip
            if (visited[i] || arr[i].originalIndex == i) {
                continue;
            }

            // Traverse the cycle
            int cycleSize = 0;
            int curr = i;
            while (!visited[curr]) {
                visited[curr] = true;
                curr = arr[curr].originalIndex;
                cycleSize++;
            }

            if (cycleSize > 1) {
                cycles += (cycleSize - 1);
            }
        }

        return cycles;
    }
}