# Is This a Binary Search Tree?

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Is This a Binary Search Tree?](https://www.hackerrank.com/challenges/is-binary-search-tree/problem)

## Problem Description

For the purposes of this challenge, we define a [binary tree](https://en.wikipedia.org/wiki/Binary_tree) to be a [binary search tree](https://en.wikipedia.org/wiki/Binary_search_tree) with the following ordering requirements:

* The  value of every node in a node's left subtree is *less than* the data value of that node.

* The  value of every node in a node's right subtree is *greater than* the data value of that node.

Given the root node of a binary tree, can you determine if it's also a binary search tree?

Complete the function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must return a *boolean* denoting whether or not the binary tree is a binary search tree. You may have to write one or more helper functions to complete this challenge.

**Input Format**

You are not responsible for reading any input from stdin. Hidden code stubs will assemble a binary tree and pass its root node to your function as an argument.

**Constraints**

*

**Output Format**

You are not responsible for printing any output to stdout. Your function must return *true* if the tree is a binary search tree; otherwise, it must return *false*. Hidden code stubs will print this result as a *Yes* or *No* answer on a new line.

**Sample Input**

![tree](https://s3.amazonaws.com/hr-challenge-images/8131/1461698192-c9e0fcb28d-BTinput.png)

**Sample Output**

```
No

```

## Examples



## Constraints



## Solution

```java
// HackerRank Problem: Is This a Binary Search Tree?
// Link: https://www.hackerrank.com/challenges/is-binary-search-tree/problem
// Difficulty: Medium
// Language: java




/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
     return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);   
    }
    static boolean isBST(Node root,int min,int max)
    {
       if(root == null)
       {
        return true;
       } 
       if(root.data <= min || root.data >= max)
       {
            return false;
       }
       
       if(!isBST(root.left,min,root.data))
       {
        return false;
       }
       
       if(!isBST(root.right,root.data,max))
       {
        return false;
       }
       return true;
    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
