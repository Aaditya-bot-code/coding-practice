# Tree: Postorder Traversal

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Tree: Postorder Traversal](https://www.hackerrank.com/challenges/tree-postorder-traversal/problem)

## Problem Description

Complete the  function in the editor below.  It received  parameter: a pointer to the root of a binary tree. It must print the values in the tree's postorder traversal as a single line of space-separated values.

**Input Format**

Our test code passes the root node of a binary tree to the  function.

**Constraints**

 Nodes in the tree

**Output Format**

Print the tree's postorder traversal as a single line of space-separated values.

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
4 3 6 5 2 1

```

**Explanation**

The postorder traversal is shown.

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Tree: Postorder Traversal
// Link: https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
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

    public static void postOrder(Node root) {
        if( root ==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
