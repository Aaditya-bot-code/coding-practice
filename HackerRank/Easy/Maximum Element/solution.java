// HackerRank Problem: Maximum Element
// Link: https://www.hackerrank.com/challenges/maximum-element/problem
// Difficulty: Easy
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
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
    // Write your code here

    List<Integer> list = new ArrayList<>();
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    for(String operation : operations)
    {
        String[] parts = operation.split(" ");
        int type = Integer.parseInt(parts[0]);
        if(type == 1)
        {
            int x = Integer.parseInt(parts[1]);
            stack1.push(x);
            if(stack2.isEmpty())
            {
                stack2.push(x);
            }
            else if(stack2.peek() < x)
            {
                stack2.push(x);
            }
            else{
                stack2.push(stack2.peek());
            }
            
        }
        if(type == 2)
        {
            if(!stack1.isEmpty())
            {
            stack1.pop();
            stack2.pop();
            }
        }
        if(type == 3)
        {
            if(!stack2.isEmpty())
            {
            list.add(stack2.peek());
            }
        }
    }
    return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
