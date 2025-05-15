import java.util.List;

import javax.xml.transform.Source;

import java.util.HashMap;

class CountingChange {
  public static int countingChange(int amount, List<Integer> coins) {
    return countingChange(amount, 0, coins, new HashMap<>());
  }
  
  public static int countingChange(int amount, int coinIdx, List<Integer> coins, HashMap<List<Integer>, Integer> memo) {
    if (amount == 0) {
      return 1;
    }
    
    if (coinIdx == coins.size()) {
      return 0;
    }
    
    List<Integer> key = List.of(amount, coinIdx);
    if (memo.containsKey(key)) {
      return memo.get(key);
    }
    
    int total = 0;
    for (int qty = 0; qty * coins.get(coinIdx) <= amount; qty += 1) {
      int subAmount = amount - (qty * coins.get(coinIdx));
      total += countingChange(subAmount, coinIdx + 1, coins, memo);
    }
    
    memo.put(key, total);
    return total;
  }

  public static void main(String[] args) {
   System.out.println(CountingChange.countingChange(240, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
  }
}
