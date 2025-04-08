
import java.util.Scanner;

public class BinaryTrees {

    private static Node root;

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

    private static class Node {

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
}
