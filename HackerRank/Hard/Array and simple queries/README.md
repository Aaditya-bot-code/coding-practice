# Array and simple queries

**Difficulty:** Hard  
**Topics:** N/A  
**HackerRank URL:** [Array and simple queries](https://www.hackerrank.com/challenges/array-and-simple-queries/problem)

## Problem Description

Given two numbers  and .  indicates the number of elements in the array  and  indicates number of queries. You need to perform two types of queries on the array .

You are given  queries. Queries can be of two types, type **1** and type **2**.

*
Type 1 queries are represented as `1 i j` : Modify the given array by removing elements from  to  and adding them to the front.

*
Type 2 queries are represented as `2 i j` : Modify the given array by removing elements from  to  and adding them to the back.

Your task is to simply print  of the resulting array after the execution of  queries followed by the resulting array.

**Note** While adding at back or front the order of elements is preserved.

**Input Format**

First line consists of two space-separated integers,  and . **
Second line contains  integers, which represent the elements of the array.

 queries follow. Each line contains a query of either *type 1* or *type 2* in the form

Constraints** **

Output Format**

Print the absolute value i.e.  in the first line. **
Print elements of the resulting array in the second line. Each element should be seperated by a single space.

Sample Input**

```
8 4
1 2 3 4 5 6 7 8
1 2 4
2 3 5
1 4 7
2 1 4

```

**Sample Output**

```
1
2 3 6 5 7 8 4 1

```

**Explanation**

Given array is .

After execution of query , the array becomes .

After execution of query , the array becomes .

After execution of query , the array becomes .

After execution of query , the array becomes .

Now  is  i.e.  and the array is

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Array and simple queries
// Link: https://www.hackerrank.com/challenges/array-and-simple-queries/problem
// Difficulty: Hard
// Language: java15

import java.io.*;
import java.util.*;
class Node{
    int val;
    int size;
    int priority;
    Node left;
    Node right;
    Node(int val)
    {
        this.val = val;
        this.size = 1;
        this.priority = new Random().nextInt();
    }
}
public class Solution {
    static int getSize(Node node)
    {
        return node == null ? 0 : node.size;
    }
    static void update(Node node)
    {
        if(node != null)
        {
            node.size = 1 + getSize(node.left) + getSize(node.right);
        }
    }
    static Node[] split(Node root, int k)
    {
        Node[] result = new Node[2];
        
        if(root == null)
        {
            return result;
        }
        int leftSize = getSize(root.left);
        if(k <= leftSize)
        {
            Node[] temp = split(root.left,k);
            root.left = temp[1];
            update(root);
            result[0] = temp[0];
            result[1] = root;
            
        }
        else{
            Node[] temp = split(root.right, k - leftSize - 1);
            root.right = temp[0];
            update(root);
            result[0] = root;
            result[1] =temp[1];
        }
        return result;
    }
    static Node merge(Node left, Node right)
    {
        if(left == null)
        return right;
        if(right == null)
        return left;
        
        if(left.priority > right.priority)
        {
            left.right = merge(left.right,right);
            update(left);
            return left;
        }
        right.left = merge(left,right.left);
        update(right);
        return right;
    }
    static void inOrder(Node root, StringBuilder sb)
    {
        if(root == null)
        return ;
        inOrder(root.left,sb);
        sb.append(root.val).append(" ");
        inOrder(root.right,sb);
    }
    static int getFirst(Node root) {
    while (root.left != null) {
        root = root.left;
    }
    return root.val;
}

static int getLast(Node root) {
    while (root.right != null) {
        root = root.right;
    }
    return root.val;
}
    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Node root = null;

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            root = merge(root, new Node(val));
        }

        for (int q = 0; q < m; q++) {

            st = new StringTokenizer(br.readLine());

            int type = Integer.parseInt(st.nextToken());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // Split into A, B, C
            Node[] first = split(root, j);

            Node[] second = split(first[0], i - 1);

            Node A = second[0];
            Node B = second[1];
            Node C = first[1];

            if (type == 1) {
                // B + A + C
                root = merge(merge(B, A), C);
            } else {
                // A + C + B
                root = merge(merge(A, C), B);
            }
        }

        // Get first and last elements

        long answer = Math.abs(
    (long) getFirst(root) - getLast(root)
);

StringBuilder sb = new StringBuilder();

sb.append(answer).append('\n');

inOrder(root, sb);

System.out.println(sb);
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
