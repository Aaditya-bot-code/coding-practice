// HackerRank Problem: Queue using Two Stacks
// Link: https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
// Difficulty: Medium
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {
    static Stack<Integer> stack1 =new Stack<>();
    static Stack<Integer> stack2 =new Stack<>();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int oper =sc.nextInt();
            if(oper ==1)
            {
                int x =sc.nextInt();
                enQueue(x);
            }
            else if(oper ==2)
            {
                deQueue();
            }
            else{
                front();
            }
        }
    }
    static void enQueue(int x)
    {
        stack1.push(x);
    }
    static void deQueue()
    {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();

    }
    static void front()
    {
        if(stack2.isEmpty())
        {
          while(!stack1.isEmpty())
          {
            stack2.push(stack1.pop());
          } 
        }   
        System.out.println(stack2.peek()); 
 
    }
}
