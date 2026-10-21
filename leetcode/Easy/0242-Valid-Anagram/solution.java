// LeetCode Problem: Valid Anagram
// Link: https://leetcode.com/problems/valid-anagram/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length())
       {
            return false;
       } 
       int freq[] = new int[26];
       for(int i = 0 ; i < s.length() ; i++)
       {
            int index = s.charAt(i) - 'a';
            freq[index]++;
       }
       for(int i = 0 ; i< t.length() ; i++)
       {
            int index = t.charAt(i) - 'a';
            if(freq[index] == 0)
            {
                return false;
            }
            freq[index]--;
       }
       for(int i = 0 ; i < freq.length ; i++)
       {
            if(freq[i] > 0)
            {
                return false;
            }
       }
       return true;
    }
}