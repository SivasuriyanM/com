import java.util.HashMap;

public class Fibonaci{
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static Integer build(int n){
        if (n <= 1) {
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        memo.put(n,build(n-1)+build(n-2));
        return memo.get(n);
    
    }
    public static Integer triBuild(int n){
        if (n <= 2) {
            return n==2?1:0;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        memo.put(n,triBuild(n-1)+triBuild(n-2)+triBuild(n-3));
        return memo.get(n);
    
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    
    public static void main(String[] args){
        Integer arr = triBuild(8);
        System.out.println("Number of trib:"+arr);
        
    }
}