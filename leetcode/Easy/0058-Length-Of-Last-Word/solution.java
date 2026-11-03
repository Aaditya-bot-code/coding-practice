// LeetCode Problem: Length of Last Word
// Link: https://leetcode.com/problems/length-of-last-word/
// Difficulty: Easy
// Language: java

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() - 1 ; i>= 0 ; i--)
        {
            if(count == 0 && s.charAt(i) == ' ')
            {
                continue;
            }
            if(s.charAt(i) == ' ')
            {
                break;
            }
            count++;
        } 
        return count;
    }
}