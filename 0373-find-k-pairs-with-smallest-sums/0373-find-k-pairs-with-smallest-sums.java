import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(
            int[] nums1, int[] nums2, int k) {

        List<List<Integer>> result = new ArrayList<>();

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) ->
                (a[0] + a[1]) - (b[0] + b[1])
            );

        // Add first pair from each nums1 element
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.offer(new int[]{nums1[i], nums2[0], 0});
        }

        while (k > 0 && !pq.isEmpty()) {

            int[] current = pq.poll();

            result.add(Arrays.asList(
                current[0],
                current[1]
            ));

            int i = current[2];

            if (i + 1 < nums2.length) {
                pq.offer(new int[]{
                    current[0],
                    nums2[i + 1],
                    i + 1
                });
            }

            k--;
        }

        return result;
    }
}