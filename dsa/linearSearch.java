
public class linearSearch {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[]{11, 2, 3, 41, 5, 6, 71, 9};
        // System.out.println("Array Elements " + Arrays.toString(arr));
        // System.out.println(basicLinearSearch(arr, target) == -1 ? "Not found" : "ELement Found at Index : " + basicLinearSearch(arr, target));
        // System.out.print("Enter Range Start from :");
        // int start = sc.nextInt();
        // System.out.print("Enter Range End :");
        // int end = sc.nextInt();
        // System.out.println(LinearSearchInRange(arr, target, start, end) == -1 ? "Not found" : "ELement Found at Index : " + LinearSearchInRange(arr, target, start, end));
        // System.out.println(elementReturnLinearSearch(arr, target) == -1 ? "Not found" : "ELement Found  : " + elementReturnLinearSearch(arr, target));
        // String str = "Sivasuriyan Mohan";
        // System.out.println("The String : " + str);
        // System.out.print("Enter the Element want to search ");
        // char c = sc.next().charAt(0);
        // System.out.println(searchInStringBoolean(str, c) == false ? "Not found" : "ELement Found  : " + searchInStringBoolean(str, c));
        // System.out.println("Minimum value in the array : " + min(arr));
        // System.out.println("Maximum value in the array : " + max(arr));
        // int[][] arr = {{32, 4, 6, 7}, {11, 6, 8, 3, 2}, {112, 34, 76}, {12, 9, 0}};
        // System.out.print("Enter the Element want to search ");
        // int target = sc.nextInt();
        // System.err.println("The Target element found in the 2D Matrix of in the row , column of : " + Arrays.toString(matrixLinearSearch(arr, target)));
        // System.out.println("The Maximum element found in the 2D Matrix is : " + matrixLinearSearchOfMax(arr));
        // System.out.println("Total Even Digits Numbers in the arr : " + findEvenDigitsInArray(arr));
    }

    // static int basicLinearSearch(int[] arr, int target) {
    //     if (arr.length == 0) {
    //         return -1;
    //     }
    //     for (int index = 0; index < arr.length; index++) {
    //         int element = arr[index];
    //         if (element == target) {
    //             return index;
    //         }
    //     }
    //     return -1;
    // }
    // static int elementReturnLinearSearch(int[] arr, int target) {
    //     if (arr.length == 0) {
    //         return -1;
    //     }
    //     for (int element : arr) {
    //         if (element == target) {
    //             return element;
    //         }
    //     }
    //     return Integer.MAX_VALUE;
    // }
    // static boolean searchInStringBoolean(String str, char target) {
    //     if (str.length() == 0) {
    //         return false;
    //     }
    //     for (int i = 0; i < str.length(); i++) {
    //         if (target == str.charAt(i)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // static int LinearSearchInRange(int[] arr, int target, int start, int end) {
    //     if (arr.length == 0) {
    //         return -1;
    //     }
    //     for (int index = start; index <= end; index++) {
    //         int element = arr[index];
    //         if (element == target) {
    //             return index;
    //         }
    //     }
    //     return -1;
    // }
    // static int min(int[] arr) {
    //     int min = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] < min) {
    //             min = arr[i];
    //         }
    //     }
    //     return min;
    // }
    // static int max(int[] arr) {
    //     int max = arr[arr.length - 1];
    //     for (int i = arr.length - 2; i > 0; i--) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }
    //     return max;
    // }
    // static int[] matrixLinearSearch(int[][] arr, int target) {
    //     for (int row = 0; row < arr.length; row++) {
    //         for (int col = 0; col < arr[row].length; col++) {
    //             if (arr[row][col] == target) {
    //                 return new int[]{row, col};
    //             }
    //         }
    //     }
    //     return new int[]{-1, -1};
    // }
    // static int matrixLinearSearchOfMax(int[][] arr) {
    //     int max = Integer.MIN_VALUE;
    //     for (int[] ints : arr) {
    //         for (int element : ints) {
    //             if (element > max) {
    //                 max = element;
    //             }
    //         }
    //     }
    //     return max;
    // }
    // static int findEvenDigitsInArray(int[] arr) {
    //     int count = 0;
    //     for (int num : arr) {
    //         if (even(num)) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // static boolean even(int num) {
    //     return digitOptimistic(num) % 2 == 0;
    // }
    // static int digit(int num) {
    //     int count = 0;
    //     while (num != 0) {
    //         count++;
    //         num = num / 10;
    //     }
    //     return count;
    // }
    // static int digitOptimistic(int num) {
    //     if (num < 0) {
    //         num = num * -1;
    //     }
    //     return (int) (Math.log10(num)) + 1;
    // }
    // static int maximumWealth(int[][] accounts){
    //     int max = Integer.MIN_VALUE;
    //     int sum = 0;
    //     for(int[] person: accounts){
    //         for(int wealth : person){
    //             sum += wealth;
    //         }
    //         if(sum >max){
    //             max = sum;
    //         }
    //     }
    //     return max;
    // }
}
