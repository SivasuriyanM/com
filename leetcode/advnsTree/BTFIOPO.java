// Build Binary Tree from Inorder & Pre-Order Traversal

import java.util.*;

public class BTFIOPO {

    private static Node root;

    public class Node {

        static int data;
        Node left, right;

        public Node(int data) {
            Node.data = data;
        }

    }

    public void display(Node node) {
        display(node, "root");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.data);

        display(node.left, "Left Child of " + node.data + " : ");
        display(node.right, "Right Child of " + node.data + " : ");

    }

    public Node buildTree(int[] pre, int[] inoa, int left, int right, HashMap<Integer, Integer> in, int[] index) {
        if (left > right) {
            return null;
        }

        int parent = pre[index[0]];
        index[0]++;
        Node node = new Node(parent);

        if (left == right) {
            return node;
        }

        int inoi = in.get(parent);

        node.left = buildTree(pre, inoa, left, inoi - 1, in, index);
        node.right = buildTree(pre, inoa, inoi + 1, right, in, index);

        return node;
    }

}
// class PreIn {

//   public TreeNode buildTree(int[] preOrder, int[] inOrder) {
//     HashMap<Integer, Integer> map = new HashMap<>();
//     for(int i=0; i < inOrder.length; i++) {
//       map.put(inOrder[i], i);
//     }
//     int[] index = {0};
//     return helper(preOrder, inOrder, 0, preOrder.length-1, map, index);
//   }
//   public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> map, int[] index) {
//     if (left > right) {
//       return null;
//     }
//     int current = preOrder[index[0]];
//     index[0]++;
//     TreeNode node = new TreeNode(current);
//     if (left == right) {
//       return node;
//     }
//     node.left = helper(preOrder, inOrder, left, index - 1, map, index);
//     node.right = helper(preOrder, inOrder, index + 1, right, map, index);
//     return node;
//   }
// }
