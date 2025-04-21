
import java.util.*;

class KthSmallest {

    public class Node {

        static int data;
        Node left, right;

        public Node(int data) {
            Node.data = data;
        }

    }

    public int kthSmallest(Node root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        helper(root, minHeap, k);

        // remove k elements
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans = minHeap.poll();
        }
        return ans;
    }

    private void helper(Node node, PriorityQueue<Integer> minHeap, int k) {
        if (node == null) {
            return;
        }

        helper(node.left, minHeap, k);

        minHeap.offer(node.data);

        helper(node.right, minHeap, k);
    }
}
