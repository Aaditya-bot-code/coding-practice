# Tree: Preorder Traversal

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Tree: Preorder Traversal](https://www.hackerrank.com/challenges/tree-preorder-traversal/problem)

## Problem Description

Complete the  function in the editor below, which has  parameter: a pointer to the root of a binary tree. It must print the values in the tree's preorder traversal as a single line of space-separated values.

**Input Format**

Our test code passes the root node of a binary tree to the *preOrder* function.

**Constraints**

 Nodes in the tree

**Output Format**

Print the tree's preorder traversal as a single line of space-separated values.

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
1 2 5 3 4 6

```

**Explanation**

The preorder traversal of the binary tree is printed.

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Tree: Preorder Traversal
// Link: https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
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

    public static void preOrder(Node root) {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
