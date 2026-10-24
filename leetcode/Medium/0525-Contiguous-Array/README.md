# Contiguous Array

**Difficulty:** Medium  
**Topics:** Array, Hash Table, Prefix Sum  
**LeetCode URL:** [Contiguous Array](https://leetcode.com/problems/contiguous-array/)

## Problem Description

<p>Given a binary array <code>nums</code>, return <em>the maximum length of a contiguous subarray with an equal number of </em><code>0</code><em> and </em><code>1</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,0]
<strong>Output:</strong> 2
<strong>Explanation:</strong> [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,1,1,1,1,0,0,0]
<strong>Output:</strong> 6
<strong>Explanation:</strong> [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>nums[i]</code> is either <code>0</code> or <code>1</code>.</li>
</ul>

## Solution

```java
// LeetCode Problem: Contiguous Array
// Link: https://leetcode.com/problems/contiguous-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int findMaxLength(int[] nums) {
      Map<Integer,Integer> firstIndex = new HashMap<>();
      firstIndex.put(0,-1);
      int balance = 0;
      int maxLength = 0;
      for(int i = 0 ; i < nums.length ; i++)
      {
            if(nums[i] == 0)
            {
                balance -= 1;
            }
            else{
                balance += 1;
            }
            if(firstIndex.containsKey(balance))
            {
                maxLength = Math.max(maxLength, i - firstIndex.get(balance));
            }
            if(!firstIndex.containsKey(balance))
            {
            firstIndex.put(balance,i);
            }
      }
      return maxLength;

    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
