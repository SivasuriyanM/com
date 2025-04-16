
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 5, 3, 2, 8};
        // sort(arr);
        sortHash(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 1) {
            return;
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int[] countArray = new int[max + 1];

        for (int num : arr) {
            countArray[num]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }

    }

    public static void sortHash(int[] arr) {
        if (arr == null || arr.length < 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}
