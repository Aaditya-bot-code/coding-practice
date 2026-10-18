# 3Sum

**Difficulty:** Medium  
**Topics:** Array, Two Pointers, Sorting  
**LeetCode URL:** [3Sum](https://leetcode.com/problems/3sum/)

## Problem Description

<p>Given an integer array nums, return all the triplets <code>[nums[i], nums[j], nums[k]]</code> such that <code>i != j</code>, <code>i != k</code>, and <code>j != k</code>, and <code>nums[i] + nums[j] + nums[k] == 0</code>.</p>

<p>Notice that the solution set must not contain duplicate triplets.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,0,1,2,-1,-4]
<strong>Output:</strong> [[-1,-1,2],[-1,0,1]]
<strong>Explanation:</strong> 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,1]
<strong>Output:</strong> []
<strong>Explanation:</strong> The only possible triplet does not sum up to 0.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,0,0]
<strong>Output:</strong> [[0,0,0]]
<strong>Explanation:</strong> The only possible triplet sums up to 0.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= nums.length &lt;= 3000</code></li>
	<li><code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: 3Sum
// Link: https://leetcode.com/problems/3sum/
// Difficulty: Medium
// Language: java

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
       for(int i = 0; i <nums.length-2 ;i++)
       {
        if( i > 0 && nums[i ] == nums[i-1])
        {
            continue;
        }
        int left = i+1;
        int right = nums.length-1;
        while(left<right)
        {
            int sum = nums[i]+nums[left]+nums[right];
            if(sum < 0)
            {
                left++;
            }
            else if(sum > 0)
            {
                right--;
            }
            else{
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
                while(left < right && nums[left] == nums[left-1])
                {
                    left++;
                }
                while(left < right && nums[right] == nums[right+1])
                {
                    right--;
                }
            }
        }
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
