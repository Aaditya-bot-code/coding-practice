# Python If-Else

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Python If-Else](https://www.hackerrank.com/challenges/py-if-else/problem)

## Problem Description

Check [Tutorial](https://www.hackerrank.com/challenges/py-if-else/tutorial) tab to know how to solve.

**Task** **
Given an integer, , perform the following conditional actions:

* If  is odd, print `Weird`

* If  is even and in the inclusive range of  to , print `Not Weird`

* If  is even and in the inclusive range of  to , print `Weird`

* If  is even and greater than , print `Not Weird`

Input Format**

A single line containing a positive integer, .

**Constraints**

*

**Output Format**

Print `Weird` if the number is weird.  Otherwise, print `Not Weird`.

**Sample Input 0**

```
3

```

**Sample Output 0**

```
Weird

```

**Explanation 0**

 **
 is odd and odd numbers are weird, so print `Weird`.

Sample Input 1**

```
24

```

**Sample Output 1**

```
Not Weird

```

**Explanation 1**

 and  is even, so it is not weird.

## Examples



## Constraints



## Solution

```pypy3
// HackerRank Problem: Python If-Else
// Link: https://www.hackerrank.com/challenges/py-if-else/problem
// Difficulty: Easy
// Language: pypy3

#!/bin/python3
import math
import os
import random
import re
import sys
n=int(input())
if n%2!=0:
    print("Weird")
elif n%2==0:
    if n>=2 and n<=5:
        print("Not Weird")
    elif n>=6 and n<=20:
        print("Weird")
    else:
        print("Not Weird")

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
