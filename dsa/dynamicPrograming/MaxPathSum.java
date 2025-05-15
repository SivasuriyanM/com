import java.util.List;

import javax.xml.transform.Source;

import java.util.HashMap;

class MaxPathSum {
  public static int maxPathSum(List<List<Integer>> grid) {
    return (int) maxPathSum(0, 0, grid, new HashMap<>());
  }

  public static double maxPathSum(int r, int c, List<List<Integer>> grid, HashMap<List<Integer>, Double> memo) {
    if (r == grid.size() || c == grid.get(0).size()) {
      return Double.NEGATIVE_INFINITY;
    }
    
    if (r == grid.size() - 1 && c == grid.get(0).size() - 1) {
      return grid.get(r).get(c);
    }
    
    List<Integer> pos = List.of(r, c);
    if (memo.containsKey(pos)) {
      return memo.get(pos);
    }
    
    double result = grid.get(r).get(c) + Math.max(
      maxPathSum(r + 1, c, grid, memo), 
      maxPathSum(r, c + 1, grid, memo)
    );
    memo.put(pos, result);
    return result;
  }
  
  public static void main(String[] args){
    List<List<Integer>> grid = List.of(
        // List.of(1, 3, 12),
        // List.of(5, 1, 1),
        // List.of(3, 6, 1)


        // List.of(1, 2, 8, 1),
        // List.of(3, 1, 12, 10),
        // List.of(4, 0, 6, 3)

        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        // List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

        List.of(1, 1, 3, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1),
        List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(1, 2, 1, 1, 6, 1, 1, 5, 1, 1, 0, 0, 1),
        List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(1, 1, 1, 5, 1, 1, 1, 1, 0, 1, 1, 1, 1),
        List.of(2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(2, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1),
        List.of(2, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(1, 1, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1, 1),
        List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1),
        List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(1, 42, 1, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1),
        List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
    );
    System.out.println(MaxPathSum.maxPathSum(grid));
  }
}
