// HackerRank Problem: Largest Rectangle 
// Link: https://www.hackerrank.com/challenges/largest-rectangle/problem
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
     * Complete the 'largestRectangle' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */

    public static long largestRectangle(List<Integer> h) {
    // Write your code here
    Stack<Integer> stack = new Stack<>();
    long maxArea = 0;
    int n = h.size();
    for(int i = 0 ; i < n ; i++)
    {
        while(!stack.empty() && h.get(stack.peek()) > h.get(i))
        {
            int top = stack.pop();
            int height = h.get(top);
            
            int width;
            if(stack.empty()){
                width = i;
            }
            else{
                width = i - stack.peek() - 1;
            }
            long area = height*width;
            maxArea = Math.max(maxArea,area);
        }
        stack.push(i);
    }
    while(!stack.empty())
    {
        int top = stack.pop();
        int height = h.get(top);
        
        int width;
        if(stack.empty())
        {
            width = n;
        }
        else{
            width = n - stack.peek() - 1;
        }
        long area = height*width;
        maxArea = Math.max(maxArea,area);
    }
    return maxArea;
    
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
