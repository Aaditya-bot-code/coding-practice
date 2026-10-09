# Text Wrap

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Text Wrap](https://www.hackerrank.com/challenges/text-wrap/problem)

## Problem Description

Check [Tutorial](https://www.hackerrank.com/challenges/text-wrap/tutorial) tab to know how to to solve.

You are given a string  and width . **
Your task is to wrap the string into a paragraph of width .

Function Description**

Complete the *wrap* function in the editor below.

*wrap* has the following parameters:

* *string string:* a long string

* *int max_width:* the width to wrap to

**Returns**

* *string:* a single string with newline characters ('\n') where the breaks should be

**Input Format**

The first line contains a string, . **
The second line contains the width, .

Constraints**

*

*

**Sample Input 0**

```
ABCDEFGHIJKLIMNOQRSTUVWXYZ
4

```

**Sample Output 0**

```
ABCD
EFGH
IJKL
IMNO
QRST
UVWX
YZ

```

## Examples



## Constraints



## Solution

```pypy3
// HackerRank Problem: Text Wrap
// Link: https://www.hackerrank.com/challenges/text-wrap/problem
// Difficulty: Easy
// Language: pypy3



def wrap(string, max_width):
    r=""
    for i in range(0,len(string),max_width):
        r+=string[i:i+max_width]+"\n"
    return r


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
