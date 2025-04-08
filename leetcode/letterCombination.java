
import java.util.ArrayList;
// Google Interview Question

public class letterCombination {

    public static void main(String[] args) {

        // System.out.println(recursionMethodList("", "12"));
        recursionMethod("", "23");
    }

    static void recursionMethod(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char c = (char) ('a' + i - 3);
            recursionMethod(p + c, up.substring(1));
        }
    }

    static ArrayList<String> recursionMethodList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char c = (char) ('a' + i);
            ans.addAll(recursionMethodList(p + c, up.substring(1)));
        }
        return ans;
    }

}
