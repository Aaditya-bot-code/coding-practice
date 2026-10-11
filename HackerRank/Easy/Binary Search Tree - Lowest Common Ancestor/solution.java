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

