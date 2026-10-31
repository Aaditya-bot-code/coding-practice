// LeetCode Problem: Jump Game II
// Link: https://leetcode.com/problems/jump-game-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int currentEnd = 0;
        int farthest = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            farthest = Math.max(farthest, i + nums[i]);
            if(i == currentEnd)
            {
                jump++;
                currentEnd = farthest;
            }
            if(currentEnd >= nums.length - 1)
            {
                break;
            }
        }
        return jump;

    }
}