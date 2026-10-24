# Subarray Sum Equals K

**Difficulty:** Medium  
**Topics:** Array, Hash Table, Prefix Sum  
**LeetCode URL:** [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)

## Problem Description

<p>Given an array of integers <code>nums</code> and an integer <code>k</code>, return <em>the total number of subarrays whose sum equals to</em> <code>k</code>.</p>

<p>A subarray is a contiguous <strong>non-empty</strong> sequence of elements within an array.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,1,1], k = 2
<strong>Output:</strong> 2
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3], k = 3
<strong>Output:</strong> 2
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
	<li><code>-1000 &lt;= nums[i] &lt;= 1000</code></li>
	<li><code>-10<sup>7</sup> &lt;= k &lt;= 10<sup>7</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Subarray Sum Equals K
// Link: https://leetcode.com/problems/subarray-sum-equals-k/
// Difficulty: Medium
// Language: java

class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> prefixCount = new HashMap<>();
       int prefixSum = 0 ;
       int count = 0 ;
       prefixCount.put(0,1);
       for(int num : nums)
       {
        prefixSum += num;

        int required = prefixSum  - k;
        count += prefixCount.getOrDefault(required,0);

        prefixCount.put(prefixSum,prefixCount.getOrDefault(prefixSum,0)+1);
       }
       return count;

    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
