package interview;

import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;
// Time Complexity: O(log n + k × √M)
public class isLimitExceeds {

    // public static int fib(int start,int num, ArrayList<Integer> list, HashMap<Integer, Integer> memo){
    //     if(num<= 1)
    //         return 1;
        
    //     if(memo.containsKey(num)) return memo.get(num);
    //     int res = fib(start,num-1, list, memo)+ fib(start, num-2, list, memo);
    //     memo.put(num, res);
    //     if(res>= start) list.add(res);
        
        
    //     return res;

    // }
    public static List<Integer> fibList(int start, int end) {
    List<Integer> list = new ArrayList<>();
    int a = 0, b = 1;
    while (b <= end) {
        if (b >= start) list.add(b);
        int temp = b;
        b = a + b;
        a = temp;
    }
    return list;
}
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        if(num == 2) return true;
        if(num%2 == 0) return false;
        for(int i = 3; i*i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static String checkLimit(int s, int e, int l, List<Integer>list){
        int sum = 0;
        for(int i = 0; i< list.size(); i++){
            if(list.get(i)>=s && list.get(i)<=e && isPrime(list.get(i))){
                // System.out.println(list.get(i));
                sum += list.get(i);
            }
        }
        if(sum>l){
            return "Yes";
        }
        return "NO";
    }

    public static void main(String[] args){
        int start = 2, end = 90, limit = 100;
        List<Integer> list = fibList(start, end);
        // fib(start,end, list, new HashMap<>());
        System.out.println(checkLimit(start, end, limit, list));
    }
    
}



// package interview;

// import java.util.ArrayList;
// import java.util.HashMap;

// public class PrimeFibonacciLimitCheck {

//     // Function to generate Fibonacci numbers and collect only those within the specified range
//     public static void generateFibonacci(int start, int end, ArrayList<Integer> fibList) {
//         int a = 0, b = 1;
//         while (b <= end) {
//             if (b >= start) {
//                 fibList.add(b);
//             }
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }

//     // Function to check if a number is prime
//     public static boolean isPrime(int num) {
//         if (num <= 1) return false;
//         if (num == 2) return true;
//         if (num % 2 == 0) return false;

//         for (int i = 3; i * i <= num; i += 2) {
//             if (num % i == 0) return false;
//         }
//         return true;
//     }

//     // Function to check if sum of prime Fibonacci numbers exceeds the limit
//     public static String checkLimit(int start, int end, int limit, ArrayList<Integer> fibList) {
//         int sum = 0;
//         for (int num : fibList) {
//             if (isPrime(num)) {
//                 sum += num;
//             }
//         }
//         return sum > limit ? "Yes" : "No";
//     }

//     public static void main(String[] args) {
//         int start = 2, end = 90, limit = 100;

//         ArrayList<Integer> fibList = new ArrayList<>();
//         generateFibonacci(start, end, fibList);
//         String result = checkLimit(start, end, limit, fibList);
//         System.out.println(result);
//     }
// }
