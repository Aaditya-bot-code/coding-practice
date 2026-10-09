# Calculate the Nth term

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Calculate the Nth term](https://www.hackerrank.com/challenges/recursion-in-c/problem)

## Problem Description

**Objective** **
This challenge will help you learn the concept of recursion.

A function that calls itself is known as a recursive function. The C programming language supports recursion. But while using recursion, one needs to be careful to define an exit condition from the function, otherwise it will go into an infinite loop.

To prevent infinite recursion,  statement (or similar approach) can be used where one branch makes the recursive call and other doesn't.

```
void recurse() {
    .....
    recurse()  //recursive call
    .....
}
int main() {
    .....
    recurse(); //function call
    .....
}

```

Task**

There is a series, , where the next term is the sum of pervious three terms. Given the first three terms of the series, , , and  respectively, you have to output the *nth* term of the series using recursion.

Recursive method for calculating *nth* term is given below.

**Input Format**

*
The first line contains a single integer, .

*
The next line contains *3* space-separated integers, , , and .

**Constraints**

*

*

**Output Format**

Print the *nth* term of the series, .

**Sample Input 0**

```
5
1 2 3

```

**Sample Output 0**

```
11

```

**Explanation 0**

Consider the following steps:

*

*

*

*

*

From steps , , , and , we can say ; then using the values from step , , , and , we get . Thus, we print  as our answer.

## Examples



## Constraints



## Solution

```c
// HackerRank Problem: Calculate the Nth term
// Link: https://www.hackerrank.com/challenges/recursion-in-c/problem
// Difficulty: Easy
// Language: c

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.

int find_nth_term(int n, int a, int b, int c) {
  //Write your code here.
  int term,t1=a,t2=b,t3=c;
  if(n==1)
  term=t1;
  else if(n==2)
  term=t2;
  else if(n==3)
  term=t3;
  else{
    for(int i=4;i<=n;i++)
    {term=t1+t2+t3;
    t1 = t2;
    t2 = t3;
    t3 = term;
    }
  }
  return term;
}

int main() {
    int n, a, b, c;
  
    scanf("%d %d %d %d", &n, &a, &b, &c);
    int ans = find_nth_term(n, a, b, c);
 
    printf("%d", ans); 
    return 0;
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
