import java.util.Arrays;
//26. Remove Duplicates from Sorted Array
class Solution {
     public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> resultIndices = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                resultIndices.add(i);
            }
        }
        return resultIndices;
        
    }
    
    public static int removeDuplicates(int[] nums) {
        int in = 0;
        int[] arr=new int[nums.length];
        for(int i = 0; i<arr.length;i++){
            arr[i] = -101;
        }
        
        for(int num : nums){
            if(contains(num,arr)){
                continue;
            }else{
                arr[in] = num;
                nums[in] = num;
                in++;
            }
        }
        return in;
    }
    public static boolean contains(int num , int[] arr){
        if(arr.length==0){
            return false;
        }
        for(int i : arr){
            if(i==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
        System.err.println(Arrays.toString(arr));
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        System.out.println(Arrays.toString(findWordsContaining(words, x)))
    }
}