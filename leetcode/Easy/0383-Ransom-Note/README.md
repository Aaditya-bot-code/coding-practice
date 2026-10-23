# Ransom Note

**Difficulty:** Easy  
**Topics:** Hash Table, String, Counting  
**LeetCode URL:** [Ransom Note](https://leetcode.com/problems/ransom-note/)

## Problem Description

<p>Given two strings <code>ransomNote</code> and <code>magazine</code>, return <code>true</code><em> if </em><code>ransomNote</code><em> can be constructed by using the letters from </em><code>magazine</code><em> and </em><code>false</code><em> otherwise</em>.</p>

<p>Each letter in <code>magazine</code> can only be used once in <code>ransomNote</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> ransomNote = "a", magazine = "b"
<strong>Output:</strong> false
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> ransomNote = "aa", magazine = "ab"
<strong>Output:</strong> false
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> ransomNote = "aa", magazine = "aab"
<strong>Output:</strong> true
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= ransomNote.length, magazine.length &lt;= 10<sup>5</sup></code></li>
	<li><code>ransomNote</code> and <code>magazine</code> consist of lowercase English letters.</li>
</ul>

## Solution

```java
// LeetCode Problem: Ransom Note
// Link: https://leetcode.com/problems/ransom-note/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[] = new int[26];
        for(int i = 0; i < magazine.length(); i++)
        {
            int index = magazine.charAt(i) - 'a';
            freq[index]++;
        }
        for(int i = 0 ; i < ransomNote.length() ; i++)
        {
            int index = ransomNote.charAt(i) - 'a';
            if(freq[index] == 0)
            {
                return false;
            }
            else if(freq[index] > 0)
            {
                freq[index]--;
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
