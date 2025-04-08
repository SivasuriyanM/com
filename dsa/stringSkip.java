
public class stringSkip {

    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip2("", "baccad"));
        System.out.println(skipApple("", "bacappleecad"));
        System.out.println(skipAppNotApple("", "bacappleecappd"));

    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);

        if (c == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + c, up.substring(1));
        }

    }

    static String skip2(String p, String up) {
        if (up.isEmpty()) {
            return "";
        }
        char c = up.charAt(0);

        if (c == 'a') {
            return skip2(p, up.substring(1));
        } else {
            return c + skip2(p, up.substring(1));
        }

    }

    static String skipApple(String p, String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(p, up.substring(5));
        } else {
            return up.charAt(0) + skipApple(p, up.substring(1));
        }

    }

    static String skipAppNotApple(String p, String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(p, up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(p, up.substring(1));
        }

    }
}
