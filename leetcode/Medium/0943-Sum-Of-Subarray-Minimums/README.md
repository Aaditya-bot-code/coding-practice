# Sum of Subarray Minimums

**Difficulty:** Medium  
**Topics:** Array, Dynamic Programming, Stack, Monotonic Stack  
**LeetCode URL:** [Sum of Subarray Minimums](https://leetcode.com/problems/sum-of-subarray-minimums/)

## Problem Description

<p>Given an array of integers arr, find the sum of <code>min(b)</code>, where <code>b</code> ranges over every (contiguous) subarray of <code>arr</code>. Since the answer may be large, return the answer <strong>modulo</strong> <code>10<sup>9</sup> + 7</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> arr = [3,1,2,4]
<strong>Output:</strong> 17
<strong>Explanation:</strong> 
Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
Sum is 17.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> arr = [11,81,94,43,3]
<strong>Output:</strong> 444
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= arr.length &lt;= 3 * 10<sup>4</sup></code></li>
	<li><code>1 &lt;= arr[i] &lt;= 3 * 10<sup>4</sup></code></li>
</ul>

## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
