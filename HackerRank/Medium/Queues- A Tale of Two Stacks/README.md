# Queues: A Tale of Two Stacks

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Queues: A Tale of Two Stacks](https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem)

## Problem Description

A [queue](https://en.wikipedia.org/wiki/Queue_(abstract_data_type)) is an abstract data type that maintains the order in which elements were added to it, allowing the oldest elements to be removed from the front and new elements to be added to the rear. This is called a *First-In-First-Out* (FIFO) data structure because the first element added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.

A basic queue has the following operations:

* *Enqueue*: add a new element to the end of the queue.

* *Dequeue*: remove the element from the front of the queue and return it.

In this challenge, you must first implement a queue using *two stacks*. Then process  queries, where each query is one of the following  types:

* `1 x`: Enqueue element  into the end of the queue.

* `2`: Dequeue the element at the front of the queue.

* `3`: Print the element at the front of the queue.

For example, a series of queries might be as follows:

*

**Function Description**

Complete the put*, *pop*, and *peek* methods in the editor below.  They must perform the actions as described above.

**Input Format**

The first line contains a single integer, , the number of queries.

Each of the next  lines contains a single query in the form described in the problem statement above. All queries start with an integer denoting the query , but only query  is followed by an additional space-separated value, , denoting the value to be enqueued.

**Constraints**

*

*

*

* It is guaranteed that a valid answer always exists for each query of types  and .

**Output Format**

For each query of type , return the value of the element at the front of the fifo queue on a new line.

**Sample Input**

```
10
1 42
2
1 14
3
1 28
3
1 60
1 78
2
2

```

**Sample Output**

```
14
14

```

**Explanation**

![image](https://s3.amazonaws.com/hr-assets/0/1529529771-c0881122ff-twostackssample.png)

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Queues: A Tale of Two Stacks
// Link: https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem
// Difficulty: Medium
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {
    public static Stack<Integer> stack1 = new Stack<>();
    public static Stack<Integer> stack2 = new Stack<>();

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i= 0 ;i < n ;i ++)
        {
            int type = sc.nextInt();
            if(type==1)
            {
                int x = sc.nextInt();
                enQueue(x);
            }
            else if(type == 2)
            {
                deQueue();
            }
            else{
                front();
            }
        }
    }
    public static void enQueue(int x)
    {
        stack1.push(x);
    }
    public static void deQueue()
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

public static void front()
{
    if(stack2.isEmpty())
    {
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
    }

    System.out.println(stack2.peek());
}}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
