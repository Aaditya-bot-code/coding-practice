# Minimum Window Substring

**Difficulty:** Hard  
**Topics:** Hash Table, String, Sliding Window  
**LeetCode URL:** [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)

## Problem Description

<p>Given two strings <code>s</code> and <code>t</code> of lengths <code>m</code> and <code>n</code> respectively, return <em>the <strong>minimum window</strong></em> <span data-keyword="substring-nonempty"><strong><em>substring</em></strong></span><em> of </em><code>s</code><em> such that every character in </em><code>t</code><em> (<strong>including duplicates</strong>) is included in the window</em>. If there is no such substring, return <em>the empty string </em><code>&quot;&quot;</code>.</p>

<p>The testcases will be generated such that the answer is <strong>unique</strong>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;ADOBECODEBANC&quot;, t = &quot;ABC&quot;
<strong>Output:</strong> &quot;BANC&quot;
<strong>Explanation:</strong> The minimum window substring &quot;BANC&quot; includes &#39;A&#39;, &#39;B&#39;, and &#39;C&#39; from string t.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;a&quot;, t = &quot;a&quot;
<strong>Output:</strong> &quot;a&quot;
<strong>Explanation:</strong> The entire string s is the minimum window.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;a&quot;, t = &quot;aa&quot;
<strong>Output:</strong> &quot;&quot;
<strong>Explanation:</strong> Both &#39;a&#39;s from t must be included in the window.
Since the largest window of s only has one &#39;a&#39;, return empty string.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == s.length</code></li>
	<li><code>n == t.length</code></li>
	<li><code>1 &lt;= m, n &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> and <code>t</code> consist of uppercase and lowercase English letters.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Could you find an algorithm that runs in <code>O(m + n)</code> time?</p>

## Solution

```java
// LeetCode Problem: Minimum Window Substring
// Link: https://leetcode.com/problems/minimum-window-substring/
// Difficulty: Hard
// Language: java

class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length())
        {
            return "";
        }  
        HashMap<Character,Integer> target = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for(int i = 0 ; i < t.length() ; i++)
        {
            target.put(t.charAt(i),target.getOrDefault(t.charAt(i),0) + 1);
        }
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int formed = 0;
        int required = target.size();
        int startIndex = 0;
        for(int right = 0 ; right < s.length() ; right++)
        {
            window.put(s.charAt(right), window.getOrDefault(s.charAt(right), 0) + 1);
            if(target.containsKey(s.charAt(right)))
            {
                if(window.get(s.charAt(right)).equals(target.get(s.charAt(right))))
                {
                    formed += 1;
                }
            }
            while(formed == required)
            {
                int currentLength = right - left + 1;
                if(currentLength < minLength)
                {
                    minLength = currentLength;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                if(target.containsKey(leftChar))
                {
                    window.put(leftChar,window.get(leftChar) - 1);
                    if(window.get(leftChar) < target.get(leftChar))
                    {
                        formed--;
                    }
                }
                left++;

            }
            
        }
        if(minLength == Integer.MAX_VALUE)
            {
                return "";
            }
        return s.substring(startIndex, startIndex + minLength);
        
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
