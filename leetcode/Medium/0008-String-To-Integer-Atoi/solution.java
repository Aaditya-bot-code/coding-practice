// LeetCode Problem: String to Integer (atoi)
// Link: https://leetcode.com/problems/string-to-integer-atoi/
// Difficulty: Medium
// Language: java

class Solution {
    public int myAtoi(String s) {
        int i = 0;
        while(i < s.length() && Character.isWhitespace(s.charAt(i))){
            i++;
        }
        int sign = 1;
        if(i < s.length() && s.charAt(i) == '+'){
            sign = 1;
            i++;
        }
        else if(i < s.length() && s.charAt(i) =='-'){
            sign = -1;
            i++;
        }
        int num = 0;
        int limit = (sign == -1)? Integer.MIN_VALUE : -Integer.MAX_VALUE;            
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if(num < limit/10){
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            if( num * 10 < limit + digit){
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            num = num * 10 - digit;
            i++;
        }
        return sign == -1 ? num : -num;
    }
}