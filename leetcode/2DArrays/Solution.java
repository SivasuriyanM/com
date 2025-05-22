// 3362. Zero Array Transformation III
// Own code 480/850
// class Solution {
//     public int maxRemoval(int[] nums, int[][] queries) {
//         int[] temp = new int[nums.length+1];
//         boolean flag = false;
//         for(int i = 0; i<queries.length;i++){
//             int start = queries[i][0];
//             int end = queries[i][1];
//             temp[start] += 1;
//             temp[end] += 1;
//             // if(nums[start]==temp[start] && nums[end]==temp[end] ){
//             //     return queries.length-i-1;
//             // }
//             for(int j = 0; j< nums.length; j++){
//                 if(nums[j]==0){
//                     continue;
//                 }
//                 if(nums[j] != temp[j]){
//                     flag = false;
//                     break;
//                 }
//                 flag = true;
//             }
//             if(flag == true){
//                 return queries.length-i-1;
//             }
//         }

//         return -1;
//     }
// }

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public static int maxRemoval(int[] nums, int[][] queries) {
        Arrays.sort(queries, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> available = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> assigned = new PriorityQueue<>();
        int count = 0;
        for (int time = 0, k = 0; time < nums.length; time++) {
            while (!assigned.isEmpty() && assigned.peek() < time)
                assigned.poll();
            while (k < queries.length && queries[k][0] <= time)
                available.add(queries[k++][1]);
            while (assigned.size() < nums[time]
                   && !available.isEmpty()
                   && available.peek() >= time) {
                assigned.add(available.poll());
                count++;
            }
            if (assigned.size() < nums[time])
                return -1;
        }
        return queries.length - count;
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2};
        int[][] queries = {{0,2},{0,2},{1,1}};
        System.out.println(maxRemoval(nums, queries));
        
    }
}