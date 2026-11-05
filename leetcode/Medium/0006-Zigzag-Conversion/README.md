# Zigzag Conversion

**Difficulty:** Medium  
**Topics:** String  
**LeetCode URL:** [Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/)

## Problem Description

<p>The string <code>&quot;PAYPALISHIRING&quot;</code> is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)</p>

<pre>
P   A   H   N
A P L S I I G
Y   I   R
</pre>

<p>And then read line by line: <code>&quot;PAHNAPLSIIGYIR&quot;</code></p>

<p>Write the code that will take a string and make this conversion given a number of rows:</p>

<pre>
string convert(string s, int numRows);
</pre>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;PAYPALISHIRING&quot;, numRows = 3
<strong>Output:</strong> &quot;PAHNAPLSIIGYIR&quot;
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;PAYPALISHIRING&quot;, numRows = 4
<strong>Output:</strong> &quot;PINALSIGYAHRPI&quot;
<strong>Explanation:</strong>
P     I    N
A   L S  I G
Y A   H R
P     I
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;A&quot;, numRows = 1
<strong>Output:</strong> &quot;A&quot;
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 1000</code></li>
	<li><code>s</code> consists of English letters (lower-case and upper-case), <code>&#39;,&#39;</code> and <code>&#39;.&#39;</code>.</li>
	<li><code>1 &lt;= numRows &lt;= 1000</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Zigzag Conversion
// Link: https://leetcode.com/problems/zigzag-conversion/
// Difficulty: Medium
// Language: java

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length())
        {
            return s;
        }
        StringBuilder rows[] = new StringBuilder[numRows];
        for(int i = 0 ; i < numRows ; i++)
        {
            rows[i] = new StringBuilder();
        }
        int row = 0 ;
        int direction = 1;
        for(int i = 0 ; i < s.length() ; i++)
        {
            rows[row].append(s.charAt(i));
            if(row == numRows - 1)
            {
                direction = -1;
            }
            else if(row == 0)
            {
                direction = 1;
            }
            row += direction;
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < numRows ; i++)
        {
            result.append(rows[i]);
        }
        return result.toString();

    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
