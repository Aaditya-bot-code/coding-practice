// HackerRank Problem: Tree: Huffman Decoding 
// Link: https://www.hackerrank.com/challenges/tree-huffman-decoding/problem
// Difficulty: Medium
// Language: java8



/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

	void decode(String s, Node root) {
        Node pointer = root;
        StringBuilder result = new StringBuilder();
        for( int i= 0 ; i <s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '0')
            {
                pointer = pointer.left;
            }
            else{
                pointer = pointer.right;
            }
            if(pointer.left == null)
            {
                result.append(pointer.data);
                pointer = root;
            }
        }
        System.out.println(result);
       
    }

