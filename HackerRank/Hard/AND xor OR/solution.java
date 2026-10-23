// HackerRank Problem: AND xor OR
// Link: https://www.hackerrank.com/challenges/and-xor-or/problem
// Difficulty: Hard
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
     * Complete the 'andXorOr' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int andXorOr(List<Integer> a) {
    // Write your code here
    Stack<Integer> stack = new Stack<>();
    int maxXor = 0 ;
    
    for(int i = 0; i < a.size() ; i++)
    {
        int current = a.get(i);
        while(!stack.isEmpty())
        {
            maxXor = Math.max(maxXor, current ^ stack.peek());
            if(stack.peek() > current)
            {
            stack.pop();
            }
            else{
                break;
            }
        }
        stack.push(current);
    }
    return maxXor;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.andXorOr(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
