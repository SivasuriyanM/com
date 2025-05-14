import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class minChange {
  public static int minChangeMethod(int amount, List<Integer> coins) {
    return minChangeMethod(amount, coins, new HashMap<>());
  }
  
  public static int minChangeMethod(int amount, List<Integer> coins, HashMap<Integer, Integer> memo) {
    if (amount == 0) {
      return 0;
    }
    
    if (amount < 0) {
      return -1;
    }
    
    if (memo.containsKey(amount)) { 
      return memo.get(amount);
    }
    
    int minCoins = -1;
    for (int coin : coins) {
      int subAmount = amount - coin;
      int subCoins = minChangeMethod(subAmount, coins, memo);
      if (subCoins != -1) {
        int numCoins = 1 + subCoins;
        if (numCoins < minCoins || minCoins == -1) {
          minCoins = numCoins;
        }
      }
    }
    
    memo.put(amount, minCoins);
    return minCoins;
  }

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    System.out.println(minChangeMethod(4, numbers));
  }
}
