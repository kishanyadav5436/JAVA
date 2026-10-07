class Solution {

    public List<String> removeInvalidParentheses(String s) {

        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                String current = queue.poll();

                // Check whether current string is valid
                if (isValid(current)) {
                    result.add(current);
                    found = true;
                }

                // If we already found valid strings at this level,
                // don't generate strings with more removals.
                if (found) {
                    continue;
                }

                // Try removing each parenthesis
                for (int j = 0; j < current.length(); j++) {

                    // We only remove parentheses
                    if (current.charAt(j) != '(' &&
                        current.charAt(j) != ')') {
                        continue;
                    }

                    String next =
                        current.substring(0, j) +
                        current.substring(j + 1);

                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }

            // Valid strings were found at minimum removal level
            if (found) {
                break;
            }
        }

        return result;
    }

    private boolean isValid(String s) {

        int balance = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                balance++;
            }
            else if (c == ')') {
                balance--;
            }

            // More closing brackets than opening brackets
            if (balance < 0) {
                return false;
            }
        }

        return balance == 0;
    }
}