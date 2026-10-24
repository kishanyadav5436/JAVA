class Solution {
    private static final int[] PREFIX = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    private int toDay(String s) {
        int m = Integer.parseInt(s.substring(0, 2));
        int d = Integer.parseInt(s.substring(3, 5));
        return PREFIX[m - 1] + d;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        int start = Math.max(toDay(arriveAlice), toDay(arriveBob));
        int end = Math.min(toDay(leaveAlice), toDay(leaveBob));
        return Math.max(0, end - start + 1);
    }
}