package interview;

import java.util.HashMap;
import java.util.Map;

// A string will be provided which contains all 10 digits from 0 to 9 in
// randomly arranged. Assume it like a number keyboard.
// Given 10 digits, the string will tell how the digits are positioned. To type
// a digit, yoU start from index zero to index of target digit it takes |a-b| seconds where a is from index and b is to index.
// There will be one more number which is also in string format. You need
// to find the number of seconds it takes to type this whole number. 
// Time Complexity: O(n+m)
public class findSeconds {
    public static int secondsTo(String kb, String nd){
        int numOfSeconds = 0;
        int prevNum = 0;
        // int curSec = 0;
        // for(int i = 0; i<nd.length(); i++){
        //     char current = nd.charAt(i);
        //     for(int j = 0; j<kb.length(); j++){
        //         if(kb.charAt(j)== current){
        //             curSec =j;
        //             break;
        //         }
        //     }
            
        //     numOfSeconds += prevNum>curSec?prevNum-curSec:curSec-prevNum;
        //     prevNum = curSec;

        // }
        // return numOfSeconds;
        Map<Character, Integer> pos = new HashMap<>();
        for (int i = 0; i < kb.length(); i++) pos.put(kb.charAt(i), i);
        for (int i = 0; i < nd.length(); i++) {
            int curSec = pos.get(nd.charAt(i));
            numOfSeconds += Math.abs(curSec - prevNum);
            prevNum = curSec;
        }
        return numOfSeconds;
    }
    public static void main(String[] args) {
        String keyBoard = "0123456789";
        String numToDail = "210";
        // String keyBoard = "8459761203";
        // String numToDail = "5439";

        System.out.println(secondsTo(keyBoard, numToDail));


    }
}
