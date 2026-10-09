# Printing Pattern Using Loops

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Printing Pattern Using Loops](https://www.hackerrank.com/challenges/printing-pattern-2/problem)

## Problem Description

Print a pattern of numbers from  to  as shown below.  Each of the numbers is separated by a single space.

```
                            4 4 4 4 4 4 4
                            4 3 3 3 3 3 4
                            4 3 2 2 2 3 4
                            4 3 2 1 2 3 4
                            4 3 2 2 2 3 4
                            4 3 3 3 3 3 4
                            4 4 4 4 4 4 4

```

**Input Format**

The input will contain a single integer .

**Constraints**

**Sample Input 0**

```
2

```

**Sample Output 0**

```
2 2 2
2 1 2
2 2 2

```

**Sample Input 1**

```
5

```

**Sample Output 1**

```
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

```

**Sample Input 2**

```
7

```

**Sample Output 2**

```
7 7 7 7 7 7 7 7 7 7 7 7 7
7 6 6 6 6 6 6 6 6 6 6 6 7
7 6 5 5 5 5 5 5 5 5 5 6 7
7 6 5 4 4 4 4 4 4 4 5 6 7
7 6 5 4 3 3 3 3 3 4 5 6 7
7 6 5 4 3 2 2 2 3 4 5 6 7
7 6 5 4 3 2 1 2 3 4 5 6 7
7 6 5 4 3 2 2 2 3 4 5 6 7
7 6 5 4 3 3 3 3 3 4 5 6 7
7 6 5 4 4 4 4 4 4 4 5 6 7
7 6 5 5 5 5 5 5 5 5 5 6 7
7 6 6 6 6 6 6 6 6 6 6 6 7
7 7 7 7 7 7 7 7 7 7 7 7 7

```

## Examples



## Constraints



## Solution

```c
// HackerRank Problem: Printing Pattern Using Loops
// Link: https://www.hackerrank.com/challenges/printing-pattern-2/problem
// Difficulty: Medium
// Language: c

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n;
    scanf("%d", &n);
  	// Complete the code to print the pattern.
    int len = 2*n - 1;
    for (int i = 0; i < len; i++) {
        for (int j = 0; j < len; j++) {
            int min = i < j ? i : j;
            min = min < len-i ? min : len-i-1;
            min = min < len-j-1 ? min : len-j-1;
            printf("%d ", n-min);
        }
        printf("\n");
    }

    return 0;
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
