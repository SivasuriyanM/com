
import java.util.*;

class TwoSum {

    public boolean findTarget(Node root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root, k, set);
    }

    public class Node {

        static int data;
        Node left, right;

        public Node(int data) {
            Node.data = data;
        }

    }

    private boolean helper(Node node, int k, HashSet<Integer> set) {
        if (node == null) {
            return false;
        }
        if (set.contains(k - node.data)) {
            return true;
        }

        set.add(node.data);
        return helper(node.left, k, set) || helper(node.right, k, set);
    }
}
