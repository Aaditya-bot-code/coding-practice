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

