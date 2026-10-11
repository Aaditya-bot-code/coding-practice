# Binary Search Tree : Insertion

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Binary Search Tree : Insertion](https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem)

## Problem Description

You are given a pointer to the root of a binary search tree and values to be inserted into the tree. Insert the values into their appropriate position in the binary search tree and return the root of the updated binary tree.
You just have to complete the function.

**Input Format**

You are given a function,

```
Node * insert (Node * root ,int data) {

}

```

**Constraints**

* No. of nodes in the tree  500

**Output Format**

Return the root of the binary search tree after inserting the value into the tree.

**Sample Input**

```
        4
       / \
      2   7
     / \
    1   3

```

The value to be inserted is 6.

**Sample Output**

```
         4
       /   \
      2     7
     / \   /
    1   3 6

```

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Binary Search Tree : Insertion
// Link: https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
// Difficulty: Easy
// Language: java8



 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
        if(root == null)
        {
            return new Node(data);
        }
        if(data < root.data)
        {
            root.left = insert(root.left,data);
        }
        else
        {
            root.right = insert(root.right,data);
        }
        return root;
    
    	
    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
