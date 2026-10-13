# Longest Palindromic Substring

**Difficulty:** Medium  
**Topics:** Two Pointers, String, Dynamic Programming, Manacher  
**LeetCode URL:** [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

## Problem Description

<p>Given a string <code>s</code>, return <em>the longest</em> <span data-keyword="palindromic-string"><em>palindromic</em></span> <span data-keyword="substring-nonempty"><em>substring</em></span> in <code>s</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;babad&quot;
<strong>Output:</strong> &quot;bab&quot;
<strong>Explanation:</strong> &quot;aba&quot; is also a valid answer.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;cbbd&quot;
<strong>Output:</strong> &quot;bb&quot;
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 1000</code></li>
	<li><code>s</code> consist of only digits and English letters.</li>
</ul>

## Solution

```java
// LeetCode Problem: Longest Palindromic Substring
// Link: https://leetcode.com/problems/longest-palindromic-substring/
// Difficulty: Medium
// Language: java

class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int start =0;
        for(int i = 0 ; i<s.length() ; i++)
        {
            int left = i;
            int right = i;
            while( left >=0 && right <s.length())
            {
                if(s.charAt(left) == s.charAt(right))
                {
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }
            if(max < (right - left - 1))
            {
                max = right - left - 1;
                start = left+1;
            }
            left = i;
            right = i+1;
            while( left >= 0 && right < s.length())
            {
                if( s.charAt(left) == s.charAt(right))
                {
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }
            if(max < (right - left - 1))
            {
                max = right - left -1;
                start = left+1;
            }
        }
        return s.substring(start,start+max);
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
