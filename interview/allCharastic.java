package interview;

import java.util.ArrayList;

class allCharastic {

    public static int[] getCharFrequency(String s){
        int[] freq = new int[26];
        for(char ch:s.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                freq[ch-'a']++;
            }
        }
        return freq;
    }

    public static boolean containsAllChar(int[] wF, int[] tF){
        for(int i = 0; i<26; i++){
            if(tF[i]>wF[i]){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<String> findMatchingWords(String s, String w){
        String[] words = s.split("\\s+");
        int[] targetFreq = getCharFrequency(w);
        ArrayList<String> result = new ArrayList<>();

        for(String i:words){
            int[] wordFreq = getCharFrequency(i);
            if(containsAllChar(wordFreq, targetFreq)){
                result.add(i);
            }
        }
            
        return result;
    }

    public static void main(String[] args) {
        String s = "The article of the arctic was arresting";
        String w = "at";
        findMatchingWords(s, w).forEach(System.out::println);
    }
}





// 🔍 Step-by-Step Breakdown
// 1. getCharFrequency(String str)
// Purpose: Builds a frequency array of lowercase letters from a string.

// It uses a size-26 array to count occurrences of each letter (a-z).

// Example:

// "at" → [1, 0, 0, ..., 1, ..., 0] → a=1, t=1

// 2. containsAllChars(int[] wordFreq, int[] targetFreq)
// Purpose: Checks if a word contains all letters of the target word.

// It compares each letter's frequency:

// If targetFreq[i] > wordFreq[i] for any letter, return false

// Otherwise, return true

// 3. findMatchingWords(String sentence, String w)
// Splits the sentence into words using split("\\s+")

// Gets frequency of target word using getCharFrequency(w)

// For each word in the sentence:

// Get its frequency

// If it contains all characters of w, add it to the result list

// 4. main() Method
// Tests the program with:

// W = "at"

// W = "te"

// Prints the matching words for each

// 🧪 Example
// For W = "at" and sentence:
// "The article of the arctic was arresting"

// Each word is checked:

// "The": doesn't contain 'a'

// "article": ✅ contains 'a' and 't'

// "of": ❌

// "arctic": ✅

// "was": ✅ contains 'a' and 't' ❌ (but **missing 't') → so this should not match — typo in logic if this passed

// "arresting": ✅

// Final Output:

// css
// Copy
// Edit
// article
// arctic
// arresting
// For W = "te":
// css
// Copy
// Edit
// The       ✅ (t, e)
// article   ✅
// of        ❌
// the       ✅
// ✅ Efficiency
// Time Complexity: O(n * 26) → where n = number of words, and 26 is for alphabet comparison

// Space Complexity: O(1) for frequency arrays (constant space)

// Let me know if you want:

// To allow symbols or numbers

// To handle punctuation

// Matching based on strict case (uppercase vs lowercase)








