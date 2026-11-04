// LeetCode Problem: Reverse Words in a String
// Link: https://leetcode.com/problems/reverse-words-in-a-string/
// Difficulty: Medium
// Language: java

class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String words[] = s.trim().split("\\s+");
        for(int i = words.length - 1 ; i>= 0 ; i--)
        {
            result.append(words[i]);
            if(i != 0 )
            {
                result.append(" ");
            }
        }
        return result.toString();

    }
}