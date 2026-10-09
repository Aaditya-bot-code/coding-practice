# Loops

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Loops](https://www.hackerrank.com/challenges/python-loops/problem)

## Problem Description

Check [Tutorial](https://www.hackerrank.com/challenges/python-loops/tutorial) tab to know how to to solve.

**Task** **
The provided code stub reads an integer, , from STDIN. For all non-negative integers , print .

Example** **

The list of non-negative integers that are less than  is .  Print the square of each number on a separate line.

```
0
1
4

```

Input Format**

The first and only line contains the integer, .

**Constraints**

**Output Format**

Print  lines, one corresponding to each .

**Sample Input 0**

```
5

```

**Sample Output 0**

```
0
1
4
9
16

```

## Examples



## Constraints



## Solution

```pypy3
// HackerRank Problem: Loops
// Link: https://www.hackerrank.com/challenges/python-loops/problem
// Difficulty: Easy
// Language: pypy3

if __name__ == '__main__':
    n = int(input())
    for i in range(0,n):
        print(i*i)

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
