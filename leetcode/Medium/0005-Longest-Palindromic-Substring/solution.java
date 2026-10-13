// LeetCode Problem: Longest Palindromic Substring
// Link: https://leetcode.com/problems/longest-palindromic-substring/
// Difficulty: Medium
// Language: java

class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int start =0;
        for(int i = 0 ; i<s.length() ; i++)
        {
            int left = i;
            int right = i;
            while( left >=0 && right <s.length())
            {
                if(s.charAt(left) == s.charAt(right))
                {
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }
            if(max < (right - left - 1))
            {
                max = right - left - 1;
                start = left+1;
            }
            left = i;
            right = i+1;
            while( left >= 0 && right < s.length())
            {
                if( s.charAt(left) == s.charAt(right))
                {
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }
            if(max < (right - left - 1))
            {
                max = right - left -1;
                start = left+1;
            }
        }
        return s.substring(start,start+max);
    }
}