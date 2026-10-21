// HackerRank Problem: Simple Text Editor
// Link: https://www.hackerrank.com/challenges/simple-text-editor/problem
// Difficulty: Medium
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Stack<String> history = new Stack<>();
        StringBuilder currentText = new StringBuilder();
        for(int i = 0 ; i< q ; i++)
        {
            int type= sc.nextInt();
            switch(type)
            {
                case 1:
                    String w = sc.next();
                    history.push(currentText.toString());
                    currentText.append(w);
                    break;
                case 2:
                    int k = sc.nextInt();
                    history.push(currentText.toString());
                    currentText.delete(currentText.length() - k,currentText.length());
                    break;
                case 3:
                    int m = sc.nextInt(); 
                    System.out.println(currentText.charAt(m - 1));
                    break;
                case 4:
                    currentText = new StringBuilder(history.pop());
                    break;
            }
        }
        
    }
}
