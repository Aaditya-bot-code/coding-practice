# Queue using Two Stacks

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Queue using Two Stacks](https://www.hackerrank.com/challenges/queue-using-two-stacks/problem)

## Problem Description

A [queue](https://en.wikipedia.org/wiki/Queue_%28abstract_data_type%29) is an abstract data type that maintains the order in which elements were added to it, allowing the oldest elements to be removed from the front and new elements to be added to the rear. This is called a *First-In-First-Out* (FIFO) data structure because the first element added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.

A basic queue has the following operations:

* *Enqueue*: add a new element to the end of the queue.

* *Dequeue*: remove the element from the front of the queue and return it.

In this challenge, you must first implement a queue using *two stacks*. Then process  queries, where each query is one of the following  types:

* `1 x`: Enqueue element  into the end of the queue.

* `2`: Dequeue the element at the front of the queue.

* `3`: Print the element at the front of the queue.

**Input Format**

The first line contains a single integer, , denoting the number of queries. **
Each line  of the  subsequent lines contains a single query in the form described in the problem statement above. All three queries start with an integer denoting the query , but only query  is followed by an additional space-separated value, , denoting the value to be enqueued.

Constraints**

*

*

*

* It is guaranteed that a valid answer always exists for each query of type .

**Output Format**

For each query of type , print the value of the element at the front of the queue on a new line.

**Sample Input**

```
STDIN   Function
-----   --------
10      q = 10 (number of queries)
1 42    1st query, enqueue 42
2       dequeue front element
1 14    enqueue 42
3       print the front element
1 28    enqueue 28
3       print the front element
1 60    enqueue 60
1 78    enqueue 78
2       dequeue front element
2       dequeue front element

```

**Sample Output**

```
14
14

```

**Explanation**

Perform the following sequence of actions:

* Enqueue ; .

* Dequeue the value at the head of the queue, ; .

* Enqueue ; .

* Print the value at the head of the queue, ; .

* Enqueue ; .

* Print the value at the head of the queue, ; .

* Enqueue ; .

* Enqueue ; .

* Dequeue the value at the head of the queue, ; .

* Dequeue the value at the head of the queue, ; .

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Queue using Two Stacks
// Link: https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
// Difficulty: Medium
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {
    static Stack<Integer> stack1 =new Stack<>();
    static Stack<Integer> stack2 =new Stack<>();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int oper =sc.nextInt();
            if(oper ==1)
            {
                int x =sc.nextInt();
                enQueue(x);
            }
            else if(oper ==2)
            {
                deQueue();
            }
            else{
                front();
            }
        }
    }
    static void enQueue(int x)
    {
        stack1.push(x);
    }
    static void deQueue()
    {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();

    }
    static void front()
    {
        if(stack2.isEmpty())
        {
          while(!stack1.isEmpty())
          {
            stack2.push(stack1.pop());
          } 
        }   
        System.out.println(stack2.peek()); 
 
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
