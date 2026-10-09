# Print Function

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Print Function](https://www.hackerrank.com/challenges/python-print/problem)

## Problem Description

Check [Tutorial](https://www.hackerrank.com/challenges/python-print/tutorial) tab to know how to to solve.

The included code stub will read an integer, , from STDIN.

Without using any string methods, try to print the following:

Note that "" represents the consecutive values in between.

**Example** **

Print the string .

Input Format**

The first line contains an integer .

**Constraints**

**Output Format**

Print the list of integers from  through  as a string, without spaces.

**Sample Input 0**

```
3

```

**Sample Output 0**

```
123

```

## Examples



## Constraints



## Solution

```pypy3
// HackerRank Problem: Print Function
// Link: https://www.hackerrank.com/challenges/python-print/problem
// Difficulty: Easy
// Language: pypy3

if __name__ == '__main__':
    n = int(input())
    num=1
    for num in range(1,n+1):
          print(num,end="")
            

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
