// LeetCode Problem: Sqrt(x)
// Link: https://leetcode.com/problems/sqrtx/
// Difficulty: Easy
// Language: java

class Solution {
    public int mySqrt(int x) {
       int left = 0;
       int right = x;
       while(left <= right)
       {
        int mid = left + (right - left)/2;
        if((long)mid*mid == x)
        {
            return mid;
        }
        else if((long)mid*mid > x)
        {
            right = mid - 1;
        }
        else{
            left = mid + 1;
        }
       } 
       return right;
    }
}