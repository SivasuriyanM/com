
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.tree.Node;

public class BinaryTrees {

    public static Node root;

    public static void populate(Scanner scanner) {
        System.out.print("Enter the root Node : ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    private static void populate(Scanner scanner, Node node) {
        System.out.print("Do you want to the left child of " + node.val + " : ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value left Node : ");
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }
        System.out.print("Do you want to the right child of " + node.val + " : ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value right Node : ");
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "    ");
        display(node.right, indent + "    ");
    }

    public void prittyPrinting() {
        prittyPrinting(root, 0);
    }

    public void prittyPrinting(Node node, int level) {
        if (node == null) {
            return;
        }
        prittyPrinting(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------------->" + node.val);
        } else {
            System.out.println(node.val);
        }
        prittyPrinting(node.left, level + 1);
    }

    public static class Node {

        int val;
        Node left;
        Node right;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    

    //Binary Tree Level Order traversal
    public List<List<Integer>> levelOrder() {
        return levelOrder(root);
    }

    private List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            int LevelSize = queue.size();
            for (int i = 0; i < LevelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }

        return result;
    }

    //Average of Level in binary tree - Google
    public List<Double> AverageOfLevel() {
        return AverageOfLevel(root);
    }

    private List<Double> AverageOfLevel(Node root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            double averageOflevel = 0;
            int LevelSize = queue.size();
            for (int i = 0; i < LevelSize; i++) {
                Node currentNode = queue.poll();
                averageOflevel += currentNode.val;
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            averageOflevel = averageOflevel / LevelSize;
            result.add(averageOflevel);
        }

        return result;
    }

    //level Order Succesor - google
    public Node levelOrderSuccesor(int num) {
        return levelOrderSuccesor(root, num);
    }

    private Node levelOrderSuccesor(Node root, int num) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            // return 0;
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            // List<Integer> currentLevel = new ArrayList<>();
            int LevelSize = queue.size();
            // for (int i = 0; i < LevelSize; i++) {
            Node currentNode = queue.poll();
            // currentLevel.add(currentNode.val);
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if (currentNode.val == num) {
                break;
            }
            // }
            // result.add(currentLevel);
        }
        // int flag = 0;
        // for (List<Integer> level : result) {
        //     for (int val : level) {
        //         if (val == num) {
        //             flag = 1;
        //             continue;
        //         }
        //         if (flag == 1) {
        //             return val;
        //         }

        //     }
        // }
        return queue.peek();
    }

    //Binary Tree Zig Zag Level Order traversal - google , amazon, MS
    public List<List<Integer>> zigZagLevelOrder() {
        return zigZagLevelOrder(root);
    }

    private List<List<Integer>> zigZagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            int LevelSize = queue.size();
            for (int i = 0; i < LevelSize; i++) {
                if (!reverse) {
                    Node currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                } else {
                    Node currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);

                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                }

            }
            reverse = !reverse;
            result.add(currentLevel);
        }

        return result;
    }

    //Binary Tree Level Order traversal II reverse
    public List<List<Integer>> reverseLevelOrder() {
        return reverseLevelOrder(root);
    }

    private List<List<Integer>> reverseLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            int LevelSize = queue.size();
            for (int i = 0; i < LevelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(0, currentLevel);
        }

        return result;
    }

    // Populatng next right pointers in each Node
    public Node connect() {
        return connect(root);
    }

    private Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMost = root;

        while (leftMost.left != null) {
            Node current = leftMost;
            System.out.println(leftMost.val);
            while (current != null) {
                System.out.print(current.left.val + " => " + current.right.val + " ");
                current.left.next = current.right;
                if (current.next != null) {
                    System.out.print(current.right.val + " => " + current.next.left.val + " ");

                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

    //Binary Tree Right Side View
    public List<Integer> rightSideView() {
        return rightSideView(root);
    }

    private List<Integer> rightSideView(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            int LevelSize = queue.size();
            for (int i = 0; i < LevelSize; i++) {
                Node currentNode = queue.poll();
                if (i == LevelSize - 1) {
                    result.add(currentNode.val);
                }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

        }

        return result;
    }

    // Cousins in Binary Tree
    public boolean isCousins(int x, int y) {
        return isCousins(root, x, y);
    }

    private boolean isCousins(Node root, int x, int y) {
        Node xx = findNode(root, x);
        Node yy = findNode(root, y);

        return ((level(root, xx, 0) == level(root, yy, 0)) && (!isSiblings(root, xx, yy)));

    }

    Node findNode(Node node, int x) {
        if (node == null) {
            return null;
        }
        if (node.val == x) {
            return node;
        }
        Node n = findNode(node.left, x);
        if (n != null) {
            return n;
        }
        return findNode(node.right, x);
    }

    boolean isSiblings(Node node, Node x, Node y) {
        if (node == null) {
            return false;
        }
        return ((node.left == x && node.right == y) || (node.left == y && node.right == x) || isSiblings(node.left, x, y) || isSiblings(node.right, x, y));
    }

    int level(Node node, Node x, int lev) {
        if (node == null) {
            return 0;
        }

        if (node == x) {
            return lev;
        }

        int l = level(node.left, x, lev + 1);
        if (l != 0) {
            return l;
        }
        return level(node.right, x, lev + 1);
    }

    public boolean isSymmetric() {
        return isMirror(root);
    }

    private boolean isMirror(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            Node left = queue.poll();
            Node right = queue.poll();

            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
    // isSymentric using recurison (More efficient)
    
    public boolean isSymmetric(Node root) {
        return (root == null) || Symmetrichelp(root.left,root.right);
    }
    public boolean Symmetrichelp(Node left, Node right){
        if(left == null || right == null) return left == right;
        if(left.val != right.val) return false;
        return Symmetrichelp(left.left,right.right) && Symmetrichelp(left.right,right.left);
    }
    
}
