# Designer Door Mat

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Designer Door Mat](https://www.hackerrank.com/challenges/designer-door-mat/problem)

## Problem Description

Mr. Vincent works in a door mat manufacturing company. One day, he designed a new door mat with the following specifications:

* Mat size must be X. ( is an odd natural number, and  is  times .)

* The design should have 'WELCOME' written in the center.

* The design pattern should only use `|`, `.` and `-` characters.

**Sample Designs**

```
    Size: 7 x 21
    ---------.|.---------
    ------.|..|..|.------
    ---.|..|..|..|..|.---
    -------WELCOME-------
    ---.|..|..|..|..|.---
    ------.|..|..|.------
    ---------.|.---------

    Size: 11 x 33
    ---------------.|.---------------
    ------------.|..|..|.------------
    ---------.|..|..|..|..|.---------
    ------.|..|..|..|..|..|..|.------
    ---.|..|..|..|..|..|..|..|..|.---
    -------------WELCOME-------------
    ---.|..|..|..|..|..|..|..|..|.---
    ------.|..|..|..|..|..|..|.------
    ---------.|..|..|..|..|.---------
    ------------.|..|..|.------------
    ---------------.|.---------------

```

**Input Format**

A single line containing the space separated values of  and .

**Constraints**

*

*

**Output Format**

Output the design pattern.

**Sample Input**

```
9 27

```

**Sample Output**

```
------------.|.------------
---------.|..|..|.---------
------.|..|..|..|..|.------
---.|..|..|..|..|..|..|.---
----------WELCOME----------
---.|..|..|..|..|..|..|.---
------.|..|..|..|..|.------
---------.|..|..|.---------
------------.|.------------

```

## Examples



## Constraints



## Solution

```python3
# HackerRank Problem: Designer Door Mat
# Link: https://www.hackerrank.com/challenges/designer-door-mat/problem
# Difficulty: Easy
# Language: python3

# Enter your code here. Read input from STDIN. Print output to STDOUT
# Read space-separated N and M from stdin
N, M = map(int, input().split())

# Upper part
for i in range(N // 2):
    pattern = ".|." * (2*i + 1)
    print(pattern.center(M, "-"))

# Middle line
print("WELCOME".center(M, "-"))

# Lower part
for i in range(N // 2 - 1, -1, -1):
    pattern = ".|." * (2*i + 1)
    print(pattern.center(M, "-"))

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
