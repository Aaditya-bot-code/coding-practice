// HackerRank Problem: QHEAP1
// Link: https://www.hackerrank.com/challenges/qheap1/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++)
        {
            int type = sc.nextInt();
            if(type == 1)
            {
                int value = sc.nextInt();
                heap.add(value);
            }
            else if(type == 2)
            {
                int value= sc.nextInt();
                heap.remove(value);
            }
            else if(type == 3)
            {
                System.out.println(heap.peek());
            }
        }
        sc.close();
    }
}
