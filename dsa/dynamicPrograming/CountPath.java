import java.util.HashMap;
import java.util.List;

public class CountPath {

    public static int totalPaths(String [][]arr ,int row, int col, HashMap<List<Integer>,Integer> memo){
      
        if(row == arr.length || col == arr[0].length){
            return 0;
        }
        
        if(arr[row][col]=="X"){
            return 0;
        }
        
        if(row == arr.length -1 && col == arr[0].length-1){
            return 1;
        }

        List<Integer> pos = List.of(row, col);
        if(memo.containsKey(pos)){
            return memo.get(pos);
        }
        int res = totalPaths(arr, row+1,col,memo)+totalPaths(arr, row, col+1, memo);
        memo.put(pos, res);
        return res;
    }
    public static void main(String[] args) {
        String [][] arr = {
            {"0","0","X"},
            {"0","0","0"},
            {"0","0","0"}
        };
        System.out.println(totalPaths(arr, 0, 0, new HashMap<>()));
        
    }
    
}
