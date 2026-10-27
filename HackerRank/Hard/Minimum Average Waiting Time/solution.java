// HackerRank Problem: Minimum Average Waiting Time
// Link: https://www.hackerrank.com/challenges/minimum-average-waiting-time/problem
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
     * Complete the 'minimumAverage' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY customers as parameter.
     */

    public static long minimumAverage(List<List<Integer>> customers) {
    // Write your code here
    customers.sort((a,b) -> Integer.compare(a.get(0),b.get(0)));
    
    PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a,b) ->Integer.compare(a.get(1),b.get(1)));
    
    long currentTime= 0;
    long totalWaitingTime = 0;
    int i = 0;
    while(i < customers.size() || !pq.isEmpty())
    {
        while(i < customers.size() && customers.get(i).get(0) <= currentTime)
        {
            pq.add(customers.get(i));
            i++;
        }
        if(pq.isEmpty())
        {
            currentTime = customers.get(i).get(0);
        }
        else{
            List<Integer> customer = pq.poll();
            
            int arrivalTime = customer.get(0);
            int cookingTime = customer.get(1);
            
            currentTime += cookingTime;
            totalWaitingTime += currentTime - arrivalTime; 
        }
    }
    return (totalWaitingTime/customers.size());
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> customers = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                customers.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result.minimumAverage(customers);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
