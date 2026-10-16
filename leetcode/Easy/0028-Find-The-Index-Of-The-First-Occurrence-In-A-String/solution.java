// LeetCode Problem: Find the Index of the First Occurrence in a String
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int strStr(String haystack, String needle) {
       if(needle.length() > haystack.length())
       {
        return -1;
       } 
       int i;
       int j;
       for(i = 0 ; i <= (haystack.length() - needle.length()) ; i++)
       {
        for(j = 0 ; j < needle.length() ; j++)
        {
            if(haystack.charAt(i+j) == needle.charAt(j))
            {
                continue;
            }
            else{
                break;
            }
            
        }
        if(j == needle.length())
        {
            return i;
        }
       }
       return -1;
    }
}