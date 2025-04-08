
import java.util.ArrayList;

public class subSeq {

    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseqRet("", "abc"));
        subseqAscii("", "abc");

    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        subseq(p + c, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char c = up.charAt(0);

        ArrayList<String> left = subseqRet(p + c, up.substring(1));
        ArrayList<String> rigth = subseqRet(p, up.substring(1));
        left.addAll(rigth);
        return left;
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        subseqAscii(p + c, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (c + 0), up.substring(1));

    }
}
