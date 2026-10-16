# Search Insert Position

**Difficulty:** Easy  
**Topics:** Array, Binary Search  
**LeetCode URL:** [Search Insert Position](https://leetcode.com/problems/search-insert-position/)

## Problem Description

<p>Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.</p>

<p>You must&nbsp;write an algorithm with&nbsp;<code>O(log n)</code> runtime complexity.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,5,6], target = 5
<strong>Output:</strong> 2
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,5,6], target = 2
<strong>Output:</strong> 1
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,5,6], target = 7
<strong>Output:</strong> 4
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
	<li><code>nums</code> contains <strong>distinct</strong> values sorted in <strong>ascending</strong> order.</li>
	<li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Search Insert Position
// Link: https://leetcode.com/problems/search-insert-position/
// Difficulty: Easy
// Language: java

class Solution {
    public int searchInsert(int[] nums, int target) {
       int left = 0;
       int right = nums.length -1;
       while(left <= right)
       {
        int mid =left + (right - left)/2;
        if(target == nums[mid])
        {
            return mid;
        }
        else if(target > nums[mid])
        {
            left = mid+1;
        }
        else{
            right= mid-1;
        }
       }
       return left; 
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
