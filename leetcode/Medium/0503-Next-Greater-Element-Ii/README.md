# Next Greater Element II

**Difficulty:** Medium  
**Topics:** Array, Stack, Monotonic Stack  
**LeetCode URL:** [Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/)

## Problem Description

<p>Given a circular integer array <code>nums</code> (i.e., the next element of <code>nums[nums.length - 1]</code> is <code>nums[0]</code>), return <em>the <strong>next greater number</strong> for every element in</em> <code>nums</code>.</p>

<p>The <strong>next greater number</strong> of a number <code>x</code> is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn&#39;t exist, return <code>-1</code> for this number.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,1]
<strong>Output:</strong> [2,-1,2]
Explanation: The first 1&#39;s next greater number is 2; 
The number 2 can&#39;t find next greater number. 
The second 1&#39;s next greater number needs to search circularly, which is also 2.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4,3]
<strong>Output:</strong> [2,3,4,-1,4]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>

## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
