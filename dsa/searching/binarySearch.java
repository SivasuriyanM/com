
public class binarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 10, 11, -1, 0, 1,};
        int target = 3;
        int result;
        //  result = findIndex(arr, target);
        //  result = orderAgnosticBS(arr, target);
        // result = findPeakElement(arr);
        // result = findCeilingBS(arr, target);
        // result = findFloorBS(arr, target);
        // int[] result = findFirstAndLast(arr, target);
        // result = infiniteArrayBS(arr, target);
        // result = biotonicBS(arr);
        // result = searchInMountain(arr, target);
        // result = searchInRoatedArray(arr, target);
        // result = findPivotWithDuplicates(arr);
        result = findCountOfRotation(arr);

        System.out.println("Index of target element is: " + result);
    }

    static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findIndex(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // int start = 0;
        // int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

    static int findPeakElement(int[] arr) {
        return -1;
    }

    static int findCeilingBS(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    static int findFloorBS(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (target < arr[0]) {
            return Integer.MIN_VALUE;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }

    static int[] findFirstAndLast(int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int start = 0, end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    static int infiniteArrayBS(int[] arr, int target) {

        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = (end - start + 1) * 2;
            start = temp;
        }

        return paramsBS(arr, target, start, end);

    }

    static int paramsBS(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int biotonicBS(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int searchInMountain(int arr[], int target) {
        int peak = biotonicBS(arr);
        int firstHalf = orderAgnosticBS(arr, target, 0, peak);
        if (firstHalf != -1) {
            return firstHalf;
        }
        return orderAgnosticBS(arr, target, peak, arr.length - 1);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int searchInRoatedArray(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return findIndex(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] <= target) {
            return findIndex(arr, target, 0, pivot - 1);
        }
        return findIndex(arr, target, pivot + 1, arr.length - 1);
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findCountOfRotation(int[] arr) {

        // return (arr.length - 1) - findPivot(arr); anticlock wise rotation
        return findPivot(arr) + 1;

    }
}
