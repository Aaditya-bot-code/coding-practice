// LeetCode Problem: Trapping Rain Water
// Link: https://leetcode.com/problems/trapping-rain-water/
// Difficulty: Hard
// Language: java

class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int l = 0;
        int r = height.length -1;
        int result=0;
        while( l < r)
        {
            if(height[l] < height[r])
            {
                leftMax = Math.max(leftMax,height[l]);
                result += leftMax - height[l];
                l++;
            }
            else{
                rightMax = Math.max(rightMax,height[r]);
                result += rightMax - height[r];
                r--;
            }
        }
        return result;
    }
}