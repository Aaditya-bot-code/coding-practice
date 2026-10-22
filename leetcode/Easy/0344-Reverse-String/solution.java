// LeetCode Problem: Reverse String
// Link: https://leetcode.com/problems/reverse-string/
// Difficulty: Easy
// Language: java

class Solution {
    public void reverseString(char[] s) {
       int left = 0;
       int right = s.length - 1;
       while(left < right)
       {
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;
            left++;
            right--;
       } 
    }
}