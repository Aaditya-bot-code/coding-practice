# Find the Runner-Up Score!  

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Find the Runner-Up Score!  ](https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem)

## Problem Description

Given the participants' score sheet for your University Sports Day, you are required to find the runner-up score. You are given  scores. Store them in a list and find the score of the runner-up.

**Input Format**

The first line contains . The second line contains an array   of  integers each separated by a space.

**Constraints**

*

*

**Output Format**

Print the runner-up score.

**Sample Input 0**

```
5
2 3 6 6 5

```

**Sample Output 0**

```
5

```

**Explanation 0**

Given list is . The maximum score is , second maximum is . Hence, we print  as the runner-up score.

## Examples



## Constraints



## Solution

```pypy3
// HackerRank Problem: Find the Runner-Up Score!  
// Link: https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem
// Difficulty: Easy
// Language: pypy3

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    max1=max(arr)
    while max1 in arr:
        arr.remove(max1)
    print(max(arr))

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
