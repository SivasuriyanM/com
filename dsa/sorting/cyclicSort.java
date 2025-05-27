
import java.util.ArrayList;
import java.util.List;

public class cyclicSort {

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int[] arr2 = arr;
        // sort(arr);
        // System.out.println(Arrays.toString(findAllMissingNumber(arr).toArray()));
        // System.out.println(findDuplicate(arr));
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(findAllDuplicate(arr).toArray()));
        // System.out.println(Arrays.toString(setMisMatch(arr).toArray()));
        // System.out.println(firstMissingPositive(arr));
        // String and StringBuilder()
        // String a = new String("Siva");
        // String b = new String("Siva");
        // StringBuilder builder = new StringBuilder();
        // System.out.println(arr == arr2);

    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == arr[i] - 1) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
            // if (arr[arr[i] - 1] == arr[i]) {
            //     i++;
            // } else {
            //     swap(arr, i, arr[i] - 1);
            // }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i != arr[i] && arr[i] < arr.length) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        i = 0;
        while (i < arr.length) {
            if (arr[i] == i) {
                i++;
            } else {
                return i;
            }
        }
        return arr.length;
    }

    static List<Integer> findAllMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[arr[i] - 1] == arr[i] && arr[i] < arr.length) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == arr[i] - 1) {
                i++;
            } else {
                if (arr[arr[i] - 1] == arr[i]) {

                    return arr[i];
                } else {
                    swap(arr, i, arr[i] - 1);
                }
            }

        }
        return -1;
    }

    static List<Integer> findAllDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[arr[i] - 1] == arr[i] && arr[i] < arr.length) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    static List<Integer> setMisMatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[arr[i] - 1] == arr[i]) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(arr[i]);
                ans.add(i + 1);
            }
        }
        return ans;
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length + 1;
    }
}
