# Substring with Concatenation of All Words

**Difficulty:** Hard  
**Topics:** Hash Table, String, Sliding Window  
**LeetCode URL:** [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)

## Problem Description

<p>You are given a string <code>s</code> and an array of strings <code>words</code>. All the strings of <code>words</code> are of <strong>the same length</strong>.</p>

<p>A <strong>concatenated string</strong> is a string that exactly contains all the strings of any permutation of <code>words</code> concatenated.</p>

<ul>
	<li>For example, if <code>words = [&quot;ab&quot;,&quot;cd&quot;,&quot;ef&quot;]</code>, then <code>&quot;abcdef&quot;</code>, <code>&quot;abefcd&quot;</code>, <code>&quot;cdabef&quot;</code>, <code>&quot;cdefab&quot;</code>, <code>&quot;efabcd&quot;</code>, and <code>&quot;efcdab&quot;</code> are all concatenated strings. <code>&quot;acdbef&quot;</code> is not a concatenated string because it is not the concatenation of any permutation of <code>words</code>.</li>
</ul>

<p>Return an array of <em>the starting indices</em> of all the concatenated substrings in <code>s</code>. You can return the answer in <strong>any order</strong>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;barfoothefoobarman&quot;, words = [&quot;foo&quot;,&quot;bar&quot;]</span></p>

<p><strong>Output:</strong> <span class="example-io">[0,9]</span></p>

<p><strong>Explanation:</strong></p>

<p>The substring starting at 0 is <code>&quot;barfoo&quot;</code>. It is the concatenation of <code>[&quot;bar&quot;,&quot;foo&quot;]</code> which is a permutation of <code>words</code>.<br />
The substring starting at 9 is <code>&quot;foobar&quot;</code>. It is the concatenation of <code>[&quot;foo&quot;,&quot;bar&quot;]</code> which is a permutation of <code>words</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;wordgoodgoodgoodbestword&quot;, words = [&quot;word&quot;,&quot;good&quot;,&quot;best&quot;,&quot;word&quot;]</span></p>

<p><strong>Output:</strong> <span class="example-io">[]</span></p>

<p><strong>Explanation:</strong></p>

<p>There is no concatenated substring.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;barfoofoobarthefoobarman&quot;, words = [&quot;bar&quot;,&quot;foo&quot;,&quot;the&quot;]</span></p>

<p><strong>Output:</strong> <span class="example-io">[6,9,12]</span></p>

<p><strong>Explanation:</strong></p>

<p>The substring starting at 6 is <code>&quot;foobarthe&quot;</code>. It is the concatenation of <code>[&quot;foo&quot;,&quot;bar&quot;,&quot;the&quot;]</code>.<br />
The substring starting at 9 is <code>&quot;barthefoo&quot;</code>. It is the concatenation of <code>[&quot;bar&quot;,&quot;the&quot;,&quot;foo&quot;]</code>.<br />
The substring starting at 12 is <code>&quot;thefoobar&quot;</code>. It is the concatenation of <code>[&quot;the&quot;,&quot;foo&quot;,&quot;bar&quot;]</code>.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code>1 &lt;= words.length &lt;= 5000</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 30</code></li>
	<li><code>s</code> and <code>words[i]</code> consist of lowercase English letters.</li>
</ul>

## Constraints



## Solution

```java
// LeetCode Problem: Substring with Concatenation of All Words
// Link: https://leetcode.com/problems/substring-with-concatenation-of-all-words/
// Difficulty: Hard
// Language: java

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if(words.length == 0)
        {
            return new ArrayList<>();
        }
        int wordLength = words[0].length();
        int wordCount = words.length;
        HashMap<String,Integer> frequency = new HashMap<>();
        for(int i = 0 ; i < words.length ; i++)
        {
            frequency.put(words[i], frequency.getOrDefault(words[i], 0) + 1);
        }
        List<Integer> result  = new ArrayList<>();
        for(int i = 0 ; i < wordLength ; i ++)
        {
            int left = i; 
            int right = i;
            int count = 0;

            HashMap<String,Integer> current = new HashMap<>();
            while(right + wordLength <= s.length())
            {
                String word = s.substring(right, right + wordLength);
                if(!frequency.containsKey(word)){
                    current.clear();
                    count = 0;
                    left = right + wordLength;
                    right += wordLength;
                    continue;
                }
                else{
                    current.put(word,current.getOrDefault(word, 0) + 1);
                    count++;
                }
                while(current.get(word) > frequency.get(word))
                {
                    String leftMost = s.substring(left, left + wordLength);
                    current.put(leftMost,current.get(leftMost) - 1);
                    left += wordLength;
                    count--;
                }
                if(count == wordCount)
                {
                    result.add(left);
                    String leftMost = s.substring(left, left + wordLength);
                    current.put(leftMost, current.get(leftMost) - 1);
                    left += wordLength;
                    count--;
                }
                right += wordLength;
                

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
