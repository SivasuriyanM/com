package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class campAdjList {

    public static List<List<Integer>> findMinElemList(List<List<Integer>> list){
        List<List<Integer>> result  = new ArrayList<>();
        
        int n = list.size();

        result.add(list.get(0));

        for(int i = 1; i<n-1; i++){
            List<Integer> prev = list.get(i-1);
            List<Integer> curr = list.get(i);
            List<Integer> next = list.get(i+1);

            List<Integer> smaller = new ArrayList<>();

            for(int j = 0; j<curr.size(); j++){

                int val = curr.get(j);
                boolean smallerThanPrev = j<prev.size()? val<prev.get(j):true;
                boolean smallerThanNext = j<next.size()? val<next.get(j):true;

                if(smallerThanPrev && smallerThanNext){
                    smaller.add(val);
                }
            }
            result.add(smaller);
        }

        return result;
    }
    
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
            Arrays.asList(-1, 5),
            Arrays.asList(100),
            Arrays.asList(11, 22, 33),
            Arrays.asList(55, 66, 77),
            Arrays.asList(-1, -2, -3)
        );
        
        System.out.println("Output : " + findMinElemList(list));
    }
}
