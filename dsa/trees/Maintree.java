
public class Maintree {

    public static void main(String[] args) {
        // BinaryTrees bt = new BinaryTrees();
        // Scanner sc = new Scanner(System.in);
        // bt.populate(sc);
        // // bt.display();
        // bt.prittyPrinting();
        // BST bst = new BST();
        // int[] nums = {5, 3, 1, 7, 8, 4, 2, 9, 0, 10, 6};
        // bst.populate(nums);
        // bst.display();
        // System.out.println("Pre-Order Traversal");
        // bst.preOrder();
        // System.out.println();

        // System.out.println("In-Order Traversal");
        // bst.inOrder();
        // System.out.println();
        // System.out.println("Post-Order Traversal");
        // bst.postOrder();
        // System.out.println();
        // AVL tree = new AVL();
        // for (int i = 0; i < 1000; i++) {
        //     tree.insert(i);
        // }
        // System.out.println(tree.height());
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        Segment tree = new Segment();
        tree.insert(arr);
        tree.display();

        // System.out.println(tree.query(2, 5));
        tree.update(2, 5);
        tree.display();

    }
}
