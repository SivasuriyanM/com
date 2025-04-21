
import java.util.*;

class VerticalTraversal {

    public class Node {

        static int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }

    }

    public List<List<Integer>> verticalTraversal(Node node) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if (node == null) {
            return ans;
        }

        int col = 0;

        Queue<Map.Entry<Node, Integer>> queue = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap();

        queue.offer(new AbstractMap.SimpleEntry<>(node, col));

        int min = 0;
        int max = 0;

        while (!queue.isEmpty()) {
            Map.Entry<Node, Integer> removed = queue.poll();
            node = removed.getKey();
            col = removed.getValue();

            if (node != null) {
                if (!map.containsKey(col)) {
                    map.put(col, new ArrayList<Integer>());
                }

                map.get(col).add(node.val);

                min = Math.min(min, col);
                max = Math.max(max, col);

                queue.offer(new AbstractMap.SimpleEntry<>(node.left, col - 1));
                queue.offer(new AbstractMap.SimpleEntry<>(node.right, col + 1));
            }
        }

        for (int i = min; i <= max; i++) {
            ans.add(map.get(i));
        }

        return ans;
    }
}
