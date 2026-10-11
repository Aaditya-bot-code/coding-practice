# Binary Search Tree : Lowest Common Ancestor

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Binary Search Tree : Lowest Common Ancestor](https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem)

## Problem Description

You are given pointer to the root of the binary search tree and two values  and . You need to return the lowest common ancestor ([LCA](https://en.wikipedia.org/wiki/Lowest_common_ancestor)) of  and  in the binary search tree.

* **
In the diagram above, the lowest common ancestor of the nodes  and  is the node .  Node  is the lowest node which has nodes  and  as descendants.

Function Description**

Complete the function lca* in the editor below.  It should return a pointer to the lowest common ancestor node of the two values given.

lca has the following parameters: **
-  root: a pointer to the root node of a binary search tree

-  v1: a node.data value

-  v2: a node.data value

Input Format**

The first line contains an integer, , the number of nodes in the tree. **
The second line contains  space-separated integers representing  values.

The third line contains two space-separated integers,  and .

To use the test data, you will have to create the binary search tree yourself.  Here on the platform, the tree will be created for you.

Constraints**

 **

The tree will contain nodes with *data* equal to  and .

Output Format**

Return the a pointer to the node that is the lowest common ancestor of  and .

**Sample Input**

```
6
4 2 3 1 7 6
1 7

```

![image](https://s3.amazonaws.com/hr-assets/0/1527870675-1cfffe0a8a-LCASample.png)

 and .

**Sample Output**

[reference to node 4]

**Explanation**

LCA of  and  is , the root in this case.

Return a pointer to the node.

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Binary Search Tree : Lowest Common Ancestor
// Link: https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
// Difficulty: Easy
// Language: java8



	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node root, int v1, int v2) {
      	// Write your code here.
        if(root.data > v1 && root.data > v2)
        {
            return lca(root.left,v1,v2);
        }
        if(root.data < v1 && root.data < v2)
        {
            return lca(root.right,v1,v2);
        }
        return root;
    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
