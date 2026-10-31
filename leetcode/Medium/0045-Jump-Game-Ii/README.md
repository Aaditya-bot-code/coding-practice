# Jump Game II

**Difficulty:** Medium  
**Topics:** Array, Dynamic Programming, Greedy  
**LeetCode URL:** [Jump Game II](https://leetcode.com/problems/jump-game-ii/)

## Problem Description

<p>You are given a <strong>0-indexed</strong> array of integers <code>nums</code> of length <code>n</code>. You are initially positioned at&nbsp;index 0.</p>

<p>Each element <code>nums[i]</code> represents the maximum length of a forward jump from index <code>i</code>. In other words, if you are at index <code>i</code>, you can jump to any index <code>(i + j)</code>&nbsp;where:</p>

<ul>
	<li><code>0 &lt;= j &lt;= nums[i]</code> and</li>
	<li><code>i + j &lt; n</code></li>
</ul>

<p>Return <em>the minimum number of jumps to reach index </em><code>n - 1</code>. The test cases are generated such that you can reach index&nbsp;<code>n - 1</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,3,1,1,4]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,3,0,1,4]
<strong>Output:</strong> 2
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>0 &lt;= nums[i] &lt;= 1000</code></li>
	<li>It&#39;s guaranteed that you can reach <code>nums[n - 1]</code>.</li>
</ul>

## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
