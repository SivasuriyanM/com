
import java.util.ArrayList;

public class dice {

    public static void main(String[] args) {
        stringMethod("", 4);
        System.out.println(arrayMethod("", 4));
    }

    static void stringMethod(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            stringMethod(p + i, target - i);
        }

    }

    static ArrayList<String> arrayMethod(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(arrayMethod(p + i, target - i));
        }
        return list;
    }
}
