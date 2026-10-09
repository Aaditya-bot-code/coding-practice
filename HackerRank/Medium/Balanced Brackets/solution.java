// HackerRank Problem: Balanced Brackets
// Link: https://www.hackerrank.com/challenges/balanced-brackets/problem
// Difficulty: Medium
// Language: java15

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        char ch = s.charAt(i);
        if(ch =='('|| ch =='{'|| ch=='[')
        {
          stack.push(ch);  
        }
        else if(ch == ')'|| ch == '}'|| ch == ']')
        {
            if(stack.isEmpty())
            {
                return "NO";
            }
            else if((stack.peek() =='(' && ch == ')')||(stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch == ']'))
            {
                stack.pop();
            }
            else{
                return "NO";
            }
        } 
    }
    if(stack.isEmpty())
    {
        return "YES";
    }
    else{
        return "NO";
    }

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

