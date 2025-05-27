
import java.util.ArrayList;

public class linearSearchRecursion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6};
        int target = 3;
        System.out.println(linearSearch(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(findIndexRev(arr, target, arr.length - 1));
        findAllIndex(arr, target, 0);
        System.out.println(list);

        System.out.println(findAllIndexParameter(arr, target, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, target, 0));

    }

    static boolean linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || linearSearch(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }

    }

    static int findIndexRev(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexRev(arr, target, index - 1);
        }

    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);

    }

    static ArrayList findAllIndexParameter(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexParameter(arr, target, index + 1, list);

    }

    static ArrayList findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;

    }

}
