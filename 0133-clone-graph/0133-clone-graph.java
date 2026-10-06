import java.util.*;

class Solution {

    private Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {

        // 1. If there is no graph
        if (node == null) {
            return null;
        }

        // 2. If this node is already cloned
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // 3. Create a clone of the current node
        Node clone = new Node(node.val);

        // 4. Store original -> clone
        map.put(node, clone);

        // 5. Clone all neighbors
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        // 6. Return the cloned node
        return clone;
    }
}