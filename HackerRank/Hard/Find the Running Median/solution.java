// HackerRank Problem: Find the Running Median
// Link: https://www.hackerrank.com/challenges/find-the-running-median/problem
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
     * Complete the 'runningMedian' function below.
     *
     * The function is expected to return a DOUBLE_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Double> runningMedian(List<Integer> a) {
    // Write your code here
    PriorityQueue<Integer> lower = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> upper = new PriorityQueue<>();
    
    List<Double> result = new ArrayList<>();
    for(int i = 0 ; i< a.size() ; i++)
    {
        int x = a.get(i);
        if(lower.isEmpty() || x <= lower.peek())
        {
            lower.add(x);
        }
        else{
            upper.add(x);
        }
        if(lower.size() > upper.size() +1)
        {
            upper.add(lower.poll());
        }
        else if(upper.size() > lower.size())
        {
            lower.add(upper.poll());
        }
        if(lower.size() == upper.size())
        {
            result.add(((double)lower.peek() + upper.peek())/2.0);
        }
        else{
            result.add((double)lower.peek());
        }
        
    }
    return result;
    
    
     }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Double> result = Result.runningMedian(a);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
