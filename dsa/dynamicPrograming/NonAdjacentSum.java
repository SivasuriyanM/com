import java.util.List;

import javax.xml.transform.Source;

import java.util.HashMap;

public class NonAdjacentSum {

  public static int nonAdjacentSum(List<Integer> nums) {
    return nonAdjacentSum(nums, 0, new HashMap<>());
  }

  public static int nonAdjacentSum(List<Integer> nums, int i, HashMap<Integer, Integer> memo) {
    if (i >= nums.size()) {
      return 0;
    }
    
    if (memo.containsKey(i)) {
      return memo.get(i);
    }
    
    int result = Math.max(
      nums.get(i) + nonAdjacentSum(nums, i + 2, memo),
      nonAdjacentSum(nums, i + 1, memo)
    );
    memo.put(i, result);
    return result;
  }
  
  public static void main(String [] args) {
    // List<Integer> nums = List.of(2, 4, 5, 12, 7);
    List<Integer> nums = List.of(
  72, 62, 10,  6, 20, 19, 42, 46, 24, 78,
        30, 41, 75, 38, 23, 28, 66, 55, 12, 17,
        83, 80, 56, 68,  6, 22, 56, 96, 77, 98,
        61, 20,  0, 76, 53, 74,  8, 22, 92, 37,
        30, 41, 75, 38, 23, 28, 66, 55, 12, 17,
        72, 62, 10,  6, 20, 19, 42, 46, 24, 78,
        42
        );
    System.out.println(NonAdjacentSum.nonAdjacentSum(nums));
}
}


