# Tree: Level Order Traversal

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Tree: Level Order Traversal](https://www.hackerrank.com/challenges/tree-level-order-traversal/problem)

## Problem Description

Given a pointer to the root of a binary tree, you need to print the level order traversal of this tree. In level-order traversal, nodes are visited level by level from left to right. Complete the function  and print the values in a single line separated by a space.

For example:

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

For the above tree, the level order traversal is .

**Input Format**

You are given a function,

```
void levelOrder(Node * root) {

}

```

**Constraints**

 Nodes in the tree

**Output Format**

Print the values in a single line separated by a space.

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

1 2 5 3 6 4

**Explanation**

We need to print the nodes level by level. We process each level from left to right.

Level Order Traversal: .

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Tree: Level Order Traversal
// Link: https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
// Difficulty: Easy
// Language: java8



	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
      Queue<Node> queue = new LinkedList<>();
      if(root != null)
      {
        queue.add(root);
      }
      while(!queue.isEmpty())
      {
        Node current = queue.poll();
        System.out.print(current.data + " ");
        if(current.left != null)
        {
            queue.add(current.left);
        }
        if(current.right != null)
        {
            queue.add(current.right);
        }
        
      }
      
      
    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
