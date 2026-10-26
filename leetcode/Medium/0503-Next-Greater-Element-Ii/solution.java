// LeetCode Problem: Next Greater Element II
// Link: https://leetcode.com/problems/next-greater-element-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(result,-1);
        for(int i = 2*n - 1 ;i >= 0 ; i--)
        {
            int idx = i % n;
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[idx])
            {
                stack.pop();
            }
            if(i < n && !stack.isEmpty())
            {
                result[idx] = nums[stack.peek()];
            }
            stack.push(idx);
        }
        return result;

    }
}