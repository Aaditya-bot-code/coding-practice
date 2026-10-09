# sWAP cASE

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [sWAP cASE](https://www.hackerrank.com/challenges/swap-case/problem)

## Problem Description

You are given a string and your task is to *swap cases*. In other words, convert all lowercase letters to uppercase letters and vice versa.

**For Example:**

```
Www.HackerRank.com → wWW.hACKERrANK.COM
Pythonist 2 → pYTHONIST 2

```

**Function Description**

Complete the *swap_case* function in the editor below.

*swap_case* has the following parameters:

* *string s:* the string to modify

**Returns**

* *string:* the modified string

**Input Format**

A single line containing a string .

**Constraints**

**Sample Input 0**

```
HackerRank.com presents "Pythonist 2".

```

**Sample Output 0**

```
hACKERrANK.COM PRESENTS "pYTHONIST 2".

```

## Examples



## Constraints



## Solution

```pypy3
// HackerRank Problem: sWAP cASE
// Link: https://www.hackerrank.com/challenges/swap-case/problem
// Difficulty: Easy
// Language: pypy3

def swap_case(s):
    m=""
    for i in range(0,len(s)):
        if s[i].isupper():
            m=m+s[i].lower()
        elif s[i].islower():
            m=m+s[i].upper()
        else:
            m=m+s[i]
    return m


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
