
import java.util.*;

public class Main {

    public static void main(String[] args) {

        BTFIOPO ip = new BTFIOPO();
        int[] pre = new int[]{1, 2, 4, 5, 8, 9, 3, 6, 7};
        HashMap<Integer, Integer> ino = new HashMap<>();
        int[] in = {8, 4, 9, 2, 5, 1, 6, 3, 7};
        for (int i = 0; i < in.length; i++) {
            ino.put(in[i], i);
        }
        int[] index = {0};

        ip.display(ip.buildTree(pre, in, 0, pre.length - 1, ino, index));

    }
}
