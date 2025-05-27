
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iterSubSeq {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> list = subSetDup(arr);
        for (List<Integer> ans : list) {
            System.out.print(ans
                    + "  ");
        }
    }

    static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    static List<List<Integer>> subSetDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;
        for (int n = 0; n < arr.length; n++) {
            s = 0;
            if (n > 0 && arr[n] == arr[n - 1]) {
                s = e + 1;
            }
            e = outer.size() - 1;
            int j = outer.size();
            for (int i = s; i < j; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[n]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
