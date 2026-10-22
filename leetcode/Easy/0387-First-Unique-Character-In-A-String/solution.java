// LeetCode Problem: First Unique Character in a String
// Link: https://leetcode.com/problems/first-unique-character-in-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for(int  i = 0 ; i <s.length() ; i++)
        {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        for(int i = 0 ; i < s.length() ; i++)
        {
            int index = s.charAt(i) - 'a';
            if(freq[index] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}