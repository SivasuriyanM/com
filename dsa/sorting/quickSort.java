
import java.util.Arrays;

public class quickSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2, 4};
        sort(arr, 0, arr.length - 1);
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low, e = high, m = s + (e - s) / 2, pivot = arr[m];

        while (s <= e) {

            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, high);
    }
}
