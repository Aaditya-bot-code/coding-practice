# Max Consecutive Ones

**Difficulty:** Easy  
**Topics:** Array  
**LeetCode URL:** [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/)

## Problem Description

<p>Given a binary array <code>nums</code>, return <em>the maximum number of consecutive </em><code>1</code><em>&#39;s in the array</em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,0,1,1,1]
<strong>Output:</strong> 3
<strong>Explanation:</strong> The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,0,1,1,0,1]
<strong>Output:</strong> 2
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
// LeetCode Problem: Max Consecutive Ones
// Link: https://leetcode.com/problems/max-consecutive-ones/
// Difficulty: Easy
// Language: java

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == 1)
            {
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
