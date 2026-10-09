# Digit Frequency

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Digit Frequency](https://www.hackerrank.com/challenges/frequency-of-digits-1/problem)

## Problem Description

Given a string, , consisting of alphabets and digits, find the frequency of each digit in the given string.

**Input Format**

The first line contains a string,  which is the given number.

**Constraints**

 **
All the elements of num are made of english alphabets and digits.

Output Format**

Print ten space-separated integers in a single line denoting the frequency of each digit from  to .

**Sample Input 0**

```
a11472o5t6

```

**Sample Output 0**

```
0 2 1 0 1 1 1 1 0 0

```

**Explanation 0**

In the given string:

*  occurs two times.

*  and  occur one time each.

* The remaining digits  and  don't occur at all.

**Sample Input 1**

```
lw4n88j12n1

```

**Sample Output 1**

```
0 2 1 0 1 0 0 0 2 0

```

**Sample Input 2**

```
1v88886l256338ar0ekk

```

**Sample Output 2**

```
1 1 1 2 0 1 2 0 5 0

```

## Examples



## Constraints



## Solution

```c
// HackerRank Problem: Digit Frequency
// Link: https://www.hackerrank.com/challenges/frequency-of-digits-1/problem
// Difficulty: Medium
// Language: c

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    char s[1000];
    int freq[10]={0};
    scanf("%[^\n]",s);
    for(int i=0;i < strlen(s);i++)
    {
        if(s[i]>='0'&& s[i]<='9')
        {
            freq[s[i]-'0']++;
        }
    }
    for(int i=0;i<10;i++)
    {
        printf("%d ",freq[i]);
    }
      
    return 0;
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
