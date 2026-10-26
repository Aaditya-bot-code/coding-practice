# QHEAP1

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [QHEAP1](https://www.hackerrank.com/challenges/qheap1/problem)

## Problem Description

This question is designed to help you get a better understanding of *basic heap* operations.

There are  types of query:

* " " - Add an element  to the heap.

* " " - Delete the element  from the heap.

* "" - Print the minimum of all the elements in the heap.

**NOTE**: It is guaranteed that the element to be deleted will be there in the heap. Also, at any instant, only distinct elements will be in the heap.

**Input Format**

The first line contains the number of queries, . **
Each of the next  lines contains one of the  types of query.

Constraints** **

Output Format**

For each query of type , print the minimum value on a single line.

**Sample Input**

```
STDIN       Function
-----       --------
5           Q = 5
1 4         insert 4
1 9         insert 9
3           print minimum
2 4         delete 4
3           print minimum

```

**Sample Output**

```
4
9

```

**Explanation**

After the first  queries, the heap contains {}. Printing the minimum gives  as the output. Then, the  query deletes  from the heap, and the  query gives  as the output.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: QHEAP1
// Link: https://www.hackerrank.com/challenges/qheap1/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++)
        {
            int type = sc.nextInt();
            if(type == 1)
            {
                int value = sc.nextInt();
                heap.add(value);
            }
            else if(type == 2)
            {
                int value= sc.nextInt();
                heap.remove(value);
            }
            else if(type == 3)
            {
                System.out.println(heap.peek());
            }
        }
        sc.close();
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
