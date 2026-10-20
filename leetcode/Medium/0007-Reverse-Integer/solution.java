// LeetCode Problem: Reverse Integer
// Link: https://leetcode.com/problems/reverse-integer/
// Difficulty: Medium
// Language: java

class Solution {
    public int reverse(int x) {
       int rev = 0;
       while( x != 0)
       {
        int digit = x % 10;
        if(rev > 214748364 || ( rev == 214748364 && digit > 7))
        {
            return 0;
        }
        else if(rev < -214748364 || ( rev == -214748364 && digit < -8))
        {
            return 0;
        }
        else{
        rev = rev * 10 + digit;
        x = x / 10;
        }
       } 
       return rev;
    }
}