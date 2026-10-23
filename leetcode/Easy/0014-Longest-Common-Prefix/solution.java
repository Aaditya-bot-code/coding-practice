// LeetCode Problem: Longest Common Prefix
// Link: https://leetcode.com/problems/longest-common-prefix/
// Difficulty: Easy
// Language: java

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1 ; i < strs.length ; i++)
        {
            String current = strs[i];
            while(!current.startsWith(prefix))
            {
                prefix = prefix.substring(0,prefix.length() - 1);
            }
        }
        return prefix;
    }
}