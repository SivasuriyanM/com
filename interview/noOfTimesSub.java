package interview;

public class noOfTimesSub {

    public static boolean rigthToLeft(String s, String ss, int i){
        String cur = s.substring(i, i+ss.length());

        if(!cur.equals(ss)){
            return false;
        }
        return true;
    }

    public static boolean leftToRight(String s, String ss, int i){
        String cur = s.substring(i-ss.length(), i);
        String reversedString = "";
        for (int j = cur.length() - 1; j >= 0; j--) {
            reversedString += cur.charAt(j);
        }
        if(!reversedString.equals(ss)){
            return false;
        }
        return true;
    }

    public static int findTimes(String s, String ss){
        int count = 0;
        for(int i = 0; i<s.length()-ss.length()+1; i++){
            if(rigthToLeft(s, ss,i)){
                count++;
            }
        }

        for(int i = s.length(); i>=ss.length(); i--){
            if(leftToRight(s, ss,i)){
                count++;
            }
        }

      


        return count;
    }
    
    public static void main(String[] args) {
        // String str = "AAAAA";
        // String subStr = "AA";

        //  String str = "ABADABAD";
        // String subStr = "BAD";

        String str = "BABAB";
        String subStr = "BAB";

        System.out.println("Number Of Times the Sub-String Occurs :" + findTimes(str, subStr));
    }
}
