// HackerRank Problem: Tree: Height of a Binary Tree
// Link: https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
// Difficulty: Easy
// Language: java8



	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
        int maxHeight;
        if(root == null)
        {
            return -1;
        }
        int left =height(root.left);
        int right = height(root.right);
        maxHeight =1+Math.max(left,right);
        return maxHeight;
        
    }

