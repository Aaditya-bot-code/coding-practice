# Jump Game

**Difficulty:** Medium  
**Topics:** Array, Dynamic Programming, Greedy  
**LeetCode URL:** [Jump Game](https://leetcode.com/problems/jump-game/)

## Problem Description

<p>You are given an integer array <code>nums</code>. You are initially positioned at the array&#39;s <strong>first index</strong>, and each element in the array represents your maximum jump length at that position.</p>

<p>Return <code>true</code><em> if you can reach the last index, or </em><code>false</code><em> otherwise</em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,3,1,1,4]
<strong>Output:</strong> true
<strong>Explanation:</strong> Jump 1 step from index 0 to 1, then 3 steps to the last index.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,1,0,4]
<strong>Output:</strong> false
<strong>Explanation:</strong> You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>0 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Jump Game
// Link: https://leetcode.com/problems/jump-game/
// Difficulty: Medium
// Language: java

class Solution {
    public boolean canJump(int[] nums) {
       int maxReach =0;
       for(int i = 0 ; i < nums.length ; i++)
       {
            if(i > maxReach)
            {
                return false;
            }
            maxReach = Math.max(maxReach,i+nums[i]);
            if(maxReach >= nums.length - 1)
            {
                return true;
            }
       }
       return true;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
