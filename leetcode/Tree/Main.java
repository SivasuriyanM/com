
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinaryTrees bt = new BinaryTrees();
        Scanner sc = new Scanner(System.in);
        BinaryTrees.populate(sc);

        // List<List<Integer>> result = bt.levelOrder();
        // for (List<Integer> level : result) {
        //     for (int val : level) {
        //         System.out.print(val + ", ");
        //     }
        // }
        // List<Double> res = bt.AverageOfLevel();
        // for (Double val : res) {
        //     System.out.println(val + " ");
        // }
        //My method
        // while (true) {
        //     System.out.print("Enter the Number : ");
        //     int num = sc.nextInt();
        //     System.out.println(bt.levelOrderSuccesor(num));
        // }
        //KK method
        //     System.out.print("Enter the Number : ");
        //     int num = sc.nextInt();
        //     System.out.println(bt.levelOrderSuccesor(num));
        // List<List<Integer>> result = bt.zigZagLevelOrder();
        // for (List<Integer> level : result) {
        //     for (int val : level) {
        //         System.out.print(val + ", ");
        //     }
        // }
        // List<List<Integer>> result = bt.reverseLevelOrder();
        // for (List<Integer> level : result) {
        //     for (int val : level) {
        //         System.out.print(val + ", ");
        //     }
        // }
        // bt.connect();
        // System.out.println(bt.rightSideView());
        // while (true) {
        //     System.out.println("Enter X :");
        //     int x = sc.nextInt();
        //     System.out.println("Enter Y :");
        //     int y = sc.nextInt();
        //     System.out.println(bt.isCousins(x, y));
        // }
        // System.out.println(bt.isCousins(2, 15));
        System.out.println(bt.isSymmetric());

    }

}
