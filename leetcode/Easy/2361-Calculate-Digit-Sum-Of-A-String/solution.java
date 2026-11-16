// LeetCode Problem: Calculate Digit Sum of a String
// Link: https://leetcode.com/problems/calculate-digit-sum-of-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public String digitSum(String s, int k) {
        if(s.length() <= k){
            return s;
        }
        String result = "";
        int start = 0;
        while(start < s.length()){
            int end = Math.min(start + k , s.length());
            String group = s.substring(start, end);
            int sum = 0;
            for(int i = 0; i < group.length(); i++){
                sum += group.charAt(i) - '0';
            }
            result += sum;
            start += k;
        }
        return digitSum(result,k);
    }
}