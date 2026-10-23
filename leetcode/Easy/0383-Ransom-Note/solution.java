// LeetCode Problem: Ransom Note
// Link: https://leetcode.com/problems/ransom-note/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[] = new int[26];
        for(int i = 0; i < magazine.length(); i++)
        {
            int index = magazine.charAt(i) - 'a';
            freq[index]++;
        }
        for(int i = 0 ; i < ransomNote.length() ; i++)
        {
            int index = ransomNote.charAt(i) - 'a';
            if(freq[index] == 0)
            {
                return false;
            }
            else if(freq[index] > 0)
            {
                freq[index]--;
            }
        }
        return true;
    }
}