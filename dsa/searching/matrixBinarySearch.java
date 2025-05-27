
import java.util.Arrays;

public class matrixBinarySearch {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50},
            {100, 120, 130, 200}
        };
        int target = 16;
        int[][] matrix_2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Element found At index : " + Arrays.toString(binarySearch(matrix, target)));
        System.out.println("Element found At index : " + Arrays.toString(sortedMatrix(matrix_2, target)));

    }

    static int[] binarySearch(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            } else if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] sortedMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        if (row == 1) {
            return binarySearchForSM(matrix, 0, 0, column - 1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = column / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[rStart][cMid] == target) {
                return new int[]{rStart, cMid};
            }
            if (matrix[rStart][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }

        }
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearchForSM(matrix, rStart, 0, cMid - 1, target);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][column - 1]) {
            return binarySearchForSM(matrix, rStart, cMid + 1, column - 1, target);
        }
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearchForSM(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearchForSM(matrix, rStart + 1, cMid + 1, column - 1, target);
        }

    }

    static int[] binarySearchForSM(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;

            }
        }
        return new int[]{-1, -1};
    }
}
