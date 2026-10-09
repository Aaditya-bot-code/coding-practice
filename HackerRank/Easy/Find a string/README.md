# Find a string

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Find a string](https://www.hackerrank.com/challenges/find-a-string/problem)

## Problem Description

In this challenge, the user enters a string and a substring. You have to print the number of times that the substring occurs in the given string. String traversal will take place from left to right, not from right to left.

**NOTE:** String letters are case-sensitive.

**Input Format**

The first line of input contains the original string. The next line contains the substring.

**Constraints**

 **
Each character in the string is an *ascii* character.

Output Format**

Output the integer number indicating the total number of occurrences of the substring in the original string.

**Sample Input**

```
ABCDCDC
CDC

```

**Sample Output**

```
2

```

**Concept**

There are a couple of new concepts: **
In Python, the length of a string is found by the function `len(s)`, where  is the string.

To traverse through the length of a string, use a *for* loop:

```
for i in range(0, len(s)):
    print (s[i])

```

A range function is used to loop over some length:

```
range (0, 5)

```

Here, the range loops over  to .  is excluded.

Constraints**

-

## Examples



## Constraints



## Solution

```pypy3
// HackerRank Problem: Find a string
// Link: https://www.hackerrank.com/challenges/find-a-string/problem
// Difficulty: Easy
// Language: pypy3

def count_substring(string, sub_string):
    p=0
    l=len(string)
    m=len(sub_string)
    for i in range(l-m+1):
        if string[i:i+m]==sub_string:
            p=p+1
    return p


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
