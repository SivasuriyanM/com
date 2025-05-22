public class Solution {
    public static int strStr(String haystack, String needle) {
        if(haystack.length() == 1){
            return haystack == needle?0:-1;
        }

        for(int i = 0; i<= haystack.length()-needle.length(); i++){
            String current = haystack.substring(i, i + needle.length());
            if(current.equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        strStr("sadbutsad", "sad");
    }
}