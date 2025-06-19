package interview;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// import java.util.*;


// public class maxLenOfSubStr {

//     public static String maxRepeatedSubstring(String str) {
//         int n = str.length();
//         String result = "";

//         for (int len = 1; len < n; len++) {
//             Map<String, Integer> seen = new HashMap<>();
//             for (int i = 0; i <= n - len; i++) {
//                 String sub = str.substring(i, i + len);
//                 if (seen.containsKey(sub)) {
//                     // Ensure it's a different position (not overlap)
//                     if (sub.length() > result.length()) {
//                         result = sub;
//                     }
//                 } else {
//                     seen.put(sub, i);
//                 }
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         System.out.println(maxRepeatedSubstring("xyzwyyxyzw")); // xyzw
//         System.out.println(maxRepeatedSubstring("abcabcadef")); // bca
//     }
// }

// Time Complexity: O(n^3)
public class maxLenOfSubStr {
    public static String findRepSub(int swapIndex, String str){
        
        String subStr  = "";
        
        for(int i = swapIndex; i<str.length()-swapIndex+1; i++){
            String currentSub = str.substring(swapIndex, i+swapIndex);
            for(int j = i+1; j<str.length()-currentSub.length()+1; j++){
                String campSub = str.substring(j,j+currentSub.length() );
                if(currentSub.equals(campSub)){
                    if(subStr.length()<currentSub.length()){
                        subStr = currentSub;
                    }
                }
                
            }
        }

        return subStr;
    }
    
    public static void main(String[] args) {
        String str = "xyzwyyxyzw";
        // String str = "abcabcadef";
        String ans = "";
        for(int i = 0; i<str.length()/2;i++){
            String res =findRepSub(i, str);
            if(res.length()>ans.length() || (res.length() == ans.length() && !res.isEmpty())){
                ans = res;
            }
            
        }
        System.out.println(ans);
    }
   
}



// import java.util.Arrays;

// public class maxLenOfSubStr {
//     // Build suffix array
//     private static Integer[] buildSuffixArray(String s) {
//         Integer[] sa = new Integer[s.length()];
//         for (int i = 0; i < s.length(); i++) sa[i] = i;
//         Arrays.sort(sa, (a, b) -> s.substring(a).compareTo(s.substring(b)));
//         return sa;
//     }

//     // Build LCP array
//     private static int[] buildLCP(String s, Integer[] sa) {
//         int n = s.length();
//         int[] lcp = new int[n];
//         for (int i = 1; i < n; i++) {
//             int len = 0;
//             while (sa[i] + len < n && sa[i-1] + len < n && s.charAt(sa[i] + len) == s.charAt(sa[i-1] + len)) {
//                 len++;
//             }
//             lcp[i] = len;
//         }
//         return lcp;
//     }

//     public static String maxRepeatedSubstring(String s) {
//         if (s == null || s.length() == 0) return "";
//         Integer[] sa = buildSuffixArray(s);
//         int[] lcp = buildLCP(s, sa);

//         int maxLen = 0;
//         String ans = "";
//         for (int i = 1; i < s.length(); i++) {
//             if (lcp[i] > maxLen || (lcp[i] == maxLen && lcp[i] > 0)) {
//                 // Always update to get the last one in case of tie
//                 maxLen = lcp[i];
//                 ans = s.substring(sa[i], sa[i] + maxLen);
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         String str = "xyzwyyxyzw";
//         // String str = "abcabcadef";
//         System.out.println(maxRepeatedSubstring(str));
//     }
// }

// package interview;

// import java.util.*;

// public class maxLenOfSubStr {
//     // Build suffix array
//     private static Integer[] buildSuffixArray(String s) {
//         Integer[] sa = new Integer[s.length()];
//         for (int i = 0; i < s.length(); i++) sa[i] = i;
//         Arrays.sort(sa, (a, b) -> s.substring(a).compareTo(s.substring(b)));
//         return sa;
//     }
// ```
// - **package interview;**  
//   Declares the package.
// - **import java.util.\*;**  
//   Imports utility classes.
// - **public class maxLenOfSubStr {**  
//   Declares the class.
// - **private static Integer[] buildSuffixArray(String s) {**  
//   Declares a helper method to build the suffix array.
// - **Integer[] sa = new Integer[s.length()];**  
//   Creates an array to hold the starting indices of all suffixes.
// - **for (int i = 0; i < s.length(); i++) sa[i] = i;**  
//   Fills the array with indices 0 to n-1.
// - **Arrays.sort(sa, (a, b) -> s.substring(a).compareTo(s.substring(b)));**  
//   Sorts the indices based on the lexicographical order of the suffixes starting at those indices.
// - **return sa;**  
//   Returns the sorted suffix array.

// ```java
//     // Build LCP array
//     private static int[] buildLCP(String s, Integer[] sa) {
//         int n = s.length();
//         int[] lcp = new int[n];
//         for (int i = 1; i < n; i++) {
//             int len = 0;
//             while (sa[i] + len < n && sa[i-1] + len < n && s.charAt(sa[i] + len) == s.charAt(sa[i-1] + len)) {
//                 len++;
//             }
//             lcp[i] = len;
//         }
//         return lcp;
//     }
// ```
// - **private static int[] buildLCP(String s, Integer[] sa) {**  
//   Declares a helper method to build the LCP array.
// - **int n = s.length();**  
//   Stores the length of the string.
// - **int[] lcp = new int[n];**  
//   Creates an array to hold the LCP values.
// - **for (int i = 1; i < n; i++) { ... }**  
//   Loops through the suffix array.
// - **int len = 0;**  
//   Initializes the length of the common prefix.
// - **while (...) { len++; }**  
//   Increments `len` while the characters of the current and previous suffix match.
// - **lcp[i] = len;**  
//   Stores the LCP value for the current pair.
// - **return lcp;**  
//   Returns the LCP array.

// ```java
//     public static String maxRepeatedSubstring(String s) {
//         if (s == null || s.length() == 0) return "";
//         Integer[] sa = buildSuffixArray(s);
//         int[] lcp = buildLCP(s, sa);

//         int maxLen = 0;
//         String ans = "";
//         for (int i = 1; i < s.length(); i++) {
//             if (lcp[i] > maxLen || (lcp[i] == maxLen && lcp[i] > 0)) {
//                 // Always update to get the last one in case of tie
//                 maxLen = lcp[i];
//                 ans = s.substring(sa[i], sa[i] + maxLen);
//             }
//         }
//         return ans;
//     }
// ```
// - **public static String maxRepeatedSubstring(String s) {**  
//   Main method to find the longest repeated substring.
// - **if (s == null || s.length() == 0) return "";**  
//   Handles empty input.
// - **Integer[] sa = buildSuffixArray(s);**  
//   Builds the suffix array.
// - **int[] lcp = buildLCP(s, sa);**  
//   Builds the LCP array.
// - **int maxLen = 0; String ans = "";**  
//   Initializes variables to track the max length and answer.
// - **for (int i = 1; i < s.length(); i++) { ... }**  
//   Loops through the LCP array.
// - **if (lcp[i] > maxLen || (lcp[i] == maxLen && lcp[i] > 0)) { ... }**  
//   Updates the answer if a longer or equally long (but later) substring is found.
// - **maxLen = lcp[i]; ans = s.substring(sa[i], sa[i] + maxLen);**  
//   Updates the max length and answer.
// - **return ans;**  
//   Returns the answer.

// ```java
//     public static void main(String[] args) {
//         String str = "xyzwyyxyzw";
//         // String str = "abcabcadef";
//         System.out.println(maxRepeatedSubstring(str));
//     }
// }
// ```
// - **public static void main(String[] args) { ... }**  
//   Main entry point.
// - **String str = "xyzwyyxyzw";**  
//   Example input.
// - **System.out.println(maxRepeatedSubstring(str));**  
//   Prints the result.

// ---

// ### **Summary**
// - **Suffix Array:** Stores all suffixes’ starting indices, sorted lexicographically.
// - **LCP Array:** For each adjacent pair in the suffix array, stores the length of their common prefix.
// - **Main Logic:** The largest value in the LCP array gives the length and position of the longest repeated substring. The code always updates the answer, so the last one is chosen in case of ties.

// Let me know if you want a visualization or further breakdown!// filepath: c:\Users\msiva\Desktop\com\interview\maxLenOfSubStr.java
// package interview;

// import java.util.*;

// public class maxLenOfSubStr {
//     // Build suffix array
//     private static Integer[] buildSuffixArray(String s) {
//         Integer[] sa = new Integer[s.length()];
//         for (int i = 0; i < s.length(); i++) sa[i] = i;
//         Arrays.sort(sa, (a, b) -> s.substring(a).compareTo(s.substring(b)));
//         return sa;
//     }
// ```
// - **package interview;**  
//   Declares the package.
// - **import java.util.\*;**  
//   Imports utility classes.
// - **public class maxLenOfSubStr {**  
//   Declares the class.
// - **private static Integer[] buildSuffixArray(String s) {**  
//   Declares a helper method to build the suffix array.
// - **Integer[] sa = new Integer[s.length()];**  
//   Creates an array to hold the starting indices of all suffixes.
// - **for (int i = 0; i < s.length(); i++) sa[i] = i;**  
//   Fills the array with indices 0 to n-1.
// - **Arrays.sort(sa, (a, b) -> s.substring(a).compareTo(s.substring(b)));**  
//   Sorts the indices based on the lexicographical order of the suffixes starting at those indices.
// - **return sa;**  
//   Returns the sorted suffix array.

// ```java
//     // Build LCP array
//     private static int[] buildLCP(String s, Integer[] sa) {
//         int n = s.length();
//         int[] lcp = new int[n];
//         for (int i = 1; i < n; i++) {
//             int len = 0;
//             while (sa[i] + len < n && sa[i-1] + len < n && s.charAt(sa[i] + len) == s.charAt(sa[i-1] + len)) {
//                 len++;
//             }
//             lcp[i] = len;
//         }
//         return lcp;
//     }
// ```
// - **private static int[] buildLCP(String s, Integer[] sa) {**  
//   Declares a helper method to build the LCP array.
// - **int n = s.length();**  
//   Stores the length of the string.
// - **int[] lcp = new int[n];**  
//   Creates an array to hold the LCP values.
// - **for (int i = 1; i < n; i++) { ... }**  
//   Loops through the suffix array.
// - **int len = 0;**  
//   Initializes the length of the common prefix.
// - **while (...) { len++; }**  
//   Increments `len` while the characters of the current and previous suffix match.
// - **lcp[i] = len;**  
//   Stores the LCP value for the current pair.
// - **return lcp;**  
//   Returns the LCP array.

// ```java
//     public static String maxRepeatedSubstring(String s) {
//         if (s == null || s.length() == 0) return "";
//         Integer[] sa = buildSuffixArray(s);
//         int[] lcp = buildLCP(s, sa);

//         int maxLen = 0;
//         String ans = "";
//         for (int i = 1; i < s.length(); i++) {
//             if (lcp[i] > maxLen || (lcp[i] == maxLen && lcp[i] > 0)) {
//                 // Always update to get the last one in case of tie
//                 maxLen = lcp[i];
//                 ans = s.substring(sa[i], sa[i] + maxLen);
//             }
//         }
//         return ans;
//     }
// ```
// - **public static String maxRepeatedSubstring(String s) {**  
//   Main method to find the longest repeated substring.
// - **if (s == null || s.length() == 0) return "";**  
//   Handles empty input.
// - **Integer[] sa = buildSuffixArray(s);**  
//   Builds the suffix array.
// - **int[] lcp = buildLCP(s, sa);**  
//   Builds the LCP array.
// - **int maxLen = 0; String ans = "";**  
//   Initializes variables to track the max length and answer.
// - **for (int i = 1; i < s.length(); i++) { ... }**  
//   Loops through the LCP array.
// - **if (lcp[i] > maxLen || (lcp[i] == maxLen && lcp[i] > 0)) { ... }**  
//   Updates the answer if a longer or equally long (but later) substring is found.
// - **maxLen = lcp[i]; ans = s.substring(sa[i], sa[i] + maxLen);**  
//   Updates the max length and answer.
// - **return ans;**  
//   Returns the answer.

// ```java
//     public static void main(String[] args) {
//         String str = "xyzwyyxyzw";
//         // String str = "abcabcadef";
//         System.out.println(maxRepeatedSubstring(str));
//     }
// }
// ```
// - **public static void main(String[] args) { ... }**  
//   Main entry point.
// - **String str = "xyzwyyxyzw";**  
//   Example input.
// - **System.out.println(maxRepeatedSubstring(str));**  
//   Prints the result.

// ---

// ### **Summary**
// - **Suffix Array:** Stores all suffixes’ starting indices, sorted lexicographically.
// - **LCP Array:** For each adjacent pair in the suffix array, stores the length of their common prefix.
// - **Main Logic:** The largest value in the LCP array gives the length and position of the longest repeated substring. The code always updates the answer, so the last one is chosen in case of ties.

// Let me know if you want a visualization or further breakdown!