
import java.util.ArrayList;

public class permutation {

    public static void main(String[] args) {
        recursionMethod("", "abc");
        ArrayList<String> list = recursionMethodList("", "abc");
        System.out.println(list);
        System.out.println(recursionMethodCount("", "abc"));

    }

    static void recursionMethod(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            recursionMethod(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> recursionMethodList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(recursionMethodList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int recursionMethodCount(String p, String up) {
        if (up.isEmpty()) {

            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + recursionMethodCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
