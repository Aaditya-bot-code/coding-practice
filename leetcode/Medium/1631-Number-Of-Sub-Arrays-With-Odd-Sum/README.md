# Number of Sub-arrays With Odd Sum

**Difficulty:** Medium  
**Topics:** Array, Math, Dynamic Programming, Prefix Sum  
**LeetCode URL:** [Number of Sub-arrays With Odd Sum](https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/)

## Problem Description

<p>Given an array of integers <code>arr</code>, return <em>the number of subarrays with an <strong>odd</strong> sum</em>.</p>

<p>Since the answer can be very large, return it modulo <code>10<sup>9</sup> + 7</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> arr = [1,3,5]
<strong>Output:</strong> 4
<strong>Explanation:</strong> All subarrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
All sub-arrays sum are [1,4,9,3,8,5].
Odd sums are [1,9,3,5] so the answer is 4.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> arr = [2,4,6]
<strong>Output:</strong> 0
<strong>Explanation:</strong> All subarrays are [[2],[2,4],[2,4,6],[4],[4,6],[6]]
All sub-arrays sum are [2,6,12,4,10,6].
All sub-arrays have even sum and the answer is 0.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> arr = [1,2,3,4,5,6,7]
<strong>Output:</strong> 16
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= arr.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= arr[i] &lt;= 100</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Number of Sub-arrays With Odd Sum
// Link: https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/
// Difficulty: Medium
// Language: java

class Solution {
    public int numOfSubarrays(int[] arr) {
        int prefixSum = 0;
        int even = 1;
        int odd = 0;
        int ans = 0;
        for(int num : arr){
            prefixSum += num;
            if(prefixSum %2 == 0){
                ans += odd;
                even++;
            }else{
                ans += even;
                odd++;
            }
            ans %= 1000000007;

        }
        return ans;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
