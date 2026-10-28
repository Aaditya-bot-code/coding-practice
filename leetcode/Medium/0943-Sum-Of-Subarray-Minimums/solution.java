// LeetCode Problem: Sum of Subarray Minimums
// Link: https://leetcode.com/problems/sum-of-subarray-minimums/
// Difficulty: Medium
// Language: java

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int left[] = new int[n]; 
        int right[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < n ; i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                left[i] = -1;
            }
            else{
                left[i] = stack.peek();
            }
            stack.push(i);
        } 
        stack.clear();
        for(int i = n - 1 ;i >= 0 ; i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                right[i] = n;
            }
            else{
                right[i] = stack.peek();
            }
            stack.push(i);
        }
        long sum = 0;
        int mod = 1_000_000_007;
        for(int i = 0 ; i < n ; i++)
        {
            long contribution = (long)arr[i] * (i - left[i]) * (right[i] - i);
            sum = (sum + contribution) % mod;
        }
        return (int)sum;

    }
}