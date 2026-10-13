# Tree : Top View

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Tree : Top View](https://www.hackerrank.com/challenges/tree-top-view/problem)

## Problem Description

Given a pointer to the root of a binary tree, print the top view of the binary tree.

The tree as seen from the top the nodes, is called the top view of the tree.

For example :

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

Top View :

Complete the function  and print the resulting values on a single line separated by space.

**Input Format**

You are given a function,

```
void topView(node * root) {

}

```

**Constraints**

 Nodes in the tree

**Output Format**

Print the values on a single line separated by space.

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

1 2 5 6

**Explanation**

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

From the top, only nodes  are visible.

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Tree : Top View
// Link: https://www.hackerrank.com/challenges/tree-top-view/problem
// Difficulty: Easy
// Language: java8



	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    static  class Pair{
        Node node;
        int hd;
        Pair( Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
        
    }
	public static void topView(Node root) {
      Queue<Pair> q= new LinkedList<>();
      TreeMap<Integer,Integer> map = new TreeMap<>();
      if(root == null)
      {
        return;
      }
      q.add(new Pair(root,0));
      while(!q.isEmpty())
      {
        Pair current=q.poll();
        Node node = current.node;
        int hd = current.hd;
        if(!map.containsKey(hd))
        {
            map.put(hd,node.data);
        }
        if(node.left != null)
        {
            q.add(new Pair(node.left,hd-1));
        }
        if(node.right != null)
        {
            q.add(new Pair(node.right,hd+1));
        }
        
      }
      for(int value : map.values())
      {
        System.out.print(value+" ");
      }
    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
