# Tree: Inorder Traversal

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Tree: Inorder Traversal](https://www.hackerrank.com/challenges/tree-inorder-traversal/problem)

## Problem Description

In this challenge, you are required to implement inorder traversal of a tree.

Complete the  function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must print the values in the tree's inorder traversal as a single line of space-separated values.

**Input Format**

Our hidden tester code passes the root node of a binary tree to your $inOrder* function.

**Constraints**

**Output Format**

Print the tree's inorder traversal as a single line of space-separated values.

**Sample Input**

```
     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4

```

**Sample Output**

```
1 2 3 4 5 6

```

**Explanation**

The tree's inorder traversal results in       as the required result.

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Tree: Inorder Traversal
// Link: https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
// Difficulty: Easy
// Language: java8



/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void inOrder(Node root) {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
