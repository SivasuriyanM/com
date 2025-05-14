import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sumPossible{

    // brutforce method
    // public static boolean sum(int amount, List<Integer> numbers){
    //     if(amount == 0){
    //         return true;
    //     }

    //     if(amount < 0){
    //         return false;
    //     }

    //     for(int num : numbers){
    //         int sumAmount = amount - num;
    //         if(sum(sumAmount, numbers)){
    //             return true;
    //         }
    //     }

    //     return false;
    // }

    //Dynamic Aproach using Memo
    public static boolean sum(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo){
        if(amount == 0){
            return true;
        }

        if(amount < 0){
            return false;
        }

        for(int num : numbers){
            int sumAmount = amount - num;
            if(sum(sumAmount, numbers, memo)){
                memo.put(amount,true);
                return true;
            }
        }

        memo.put(amount,false);
        return false;
    }



    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(9);
        numbers.add(3);
        System.out.println(sum(4, numbers, new HashMap<>()));
    }
}