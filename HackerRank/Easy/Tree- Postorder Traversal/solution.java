// HackerRank Problem: Tree: Postorder Traversal
// Link: https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
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

    public static void postOrder(Node root) {
        if( root ==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

