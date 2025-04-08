
public class Segment {

    public class Node {

        int val;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

        public int getValue(Node node) {
            return node.val;
        }
    }
    private Node root;

    public Segment() {

    }

    public void insert(int[] arr) {
        root = insert(arr, 0, arr.length - 1);
    }

    private Node insert(int[] arr, int startInterval, int endInterval) {
        if (startInterval == endInterval) {
            Node leaf = new Node(startInterval, endInterval);
            leaf.val = arr[startInterval];
            return leaf;
        }

        Node node = new Node(startInterval, endInterval);

        int mid = (startInterval + endInterval) / 2;

        node.left = insert(arr, startInterval, mid);
        node.right = insert(arr, mid + 1, endInterval);

        node.val = node.left.val + node.right.val;

        return node;
    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        String str = "";

        if (node.left != null) {
            str = str + "Interval" + "[" + node.left.startInterval + "," + node.left.endInterval + "] and data: " + node.left.val + "=>";
        } else {
            str = str + "No left Child";
        }
        str = str + "Interval" + "[" + node.startInterval + "," + node.endInterval + "] and data: " + node.val + "<=";
        if (node.right != null) {
            str = str + "Interval" + "[" + node.right.startInterval + "," + node.right.endInterval + "] and data: " + node.right.val;
        } else {
            str = str + "No right Child";
        }
        System.out.println(str + "\n");

        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    public int query(int qsi, int qei) {
        return query(root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.val;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        } else {
            return query(node.left, qsi, qei) + query(node.right, qsi, qei);
        }
    }

    public void update(int index, int val) {
        root.val = update(root, index, val);
    }

    private int update(Node node, int index, int value) {
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.val = value;
                return node.val;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.val = leftAns + rightAns;
                return node.val;
            }
        }
        return node.val;
    }
}
