# Candy

**Difficulty:** Hard  
**Topics:** Array, Greedy  
**LeetCode URL:** [Candy](https://leetcode.com/problems/candy/)

## Problem Description

<p>There are <code>n</code> children standing in a line.</p>

<p>Each child is assigned a rating value given in the integer array <code>ratings</code>.</p>

<p>You are giving candies to these children subjected to the following requirements:</p>

<ul>
	<li>Each child must have <strong>at least</strong> one candy.</li>
	<li>Children with a <strong>higher</strong> rating get more candies than their neighbors.</li>
</ul>

<p>Return the <strong>minimum</strong> number of candies you need to have to distribute the candies to the children.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> ratings = [1,0,2]
<strong>Output:</strong> 5
<strong>Explanation:</strong> You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> ratings = [1,2,2]
<strong>Output:</strong> 4
<strong>Explanation:</strong> You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n == ratings.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>0 &lt;= ratings[i] &lt;= 5 * 10<sup>4</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Candy
// Link: https://leetcode.com/problems/candy/
// Difficulty: Hard
// Language: java

class Solution {
    public int candy(int[] ratings) {
      int candies[] = new int[ratings.length];
      Arrays.fill(candies,1);
      for(int i = 1 ; i < ratings.length ; i ++)
      {
        if(ratings[i] > ratings[i - 1])
        {
            candies[i] = candies[i - 1] + 1;
        }
      }  
      for(int i = ratings.length - 2 ; i>= 0 ; i--)
      {
        if(ratings[i] > ratings[i + 1])
        {
            candies[i] = Math.max(candies[i], candies[i + 1] + 1);
        }
      }
      int sum = 0;
      for(int candy: candies)
      {
        sum += candy;
      }
      return sum;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
