// LeetCode Problem: Container With Most Water
// Link: https://leetcode.com/problems/container-with-most-water/
// Difficulty: Medium
// Language: java

class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length - 1;
       int maxArea = 0;
       int width;
       int area;
       int max;
       while(left < right)
       {
        width = right-left;
        max = Math.min(height[left],height[right]);
        area = width*max;
        if( maxArea < area)
        {
            maxArea = area;
        }
        if(height[left] > height[right])
        {
            right--;
        }
        else
        {
            left++;
        }

       } 
       return maxArea;
    }
}