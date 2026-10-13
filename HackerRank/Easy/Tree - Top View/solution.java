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

