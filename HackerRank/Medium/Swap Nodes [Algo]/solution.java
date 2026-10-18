// HackerRank Problem: Swap Nodes [Algo]
// Link: https://www.hackerrank.com/challenges/swap-nodes-algo/problem
// Difficulty: Medium
// Language: java8

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
     * Complete the 'swapNodes' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY indexes
     *  2. INTEGER_ARRAY queries
     */
    static void swapAtDepth(List<List<Integer>> indexes,int node,int depth,int k)
    {
       if(node == -1)
       {
        return;
       } 
       if(depth%k == 0)
       {
        List<Integer> children = indexes.get(node-1);
        int temp = children.get(0);
        children.set(0,children.get(1));
        children.set(1,temp);
       }
       List<Integer> children = indexes.get(node-1);
       swapAtDepth(indexes,children.get(0),depth+1,k);
       swapAtDepth(indexes,children.get(1),depth+1,k);
       
    }
    static void inOrder(List<List<Integer>> indexes,int node,List<Integer> traversal)
    {
        if(node ==-1)
        {
            return;
        }
        List<Integer> children = indexes.get(node-1);
        inOrder(indexes,children.get(0),traversal);
        traversal.add(node);
        inOrder(indexes,children.get(1),traversal);
    }
    public static List<List<Integer>> swapNodes(List<List<Integer>> indexes, List<Integer> queries) {
    // Write your code here
    List<List<Integer>> result = new ArrayList<>();
    for(int k : queries)
    {
        swapAtDepth(indexes,1,1,k);
        List<Integer> traversal= new ArrayList<>();
        inOrder(indexes,1,traversal);
        result.add(traversal);
    }
    return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> indexes = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                indexes.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<List<Integer>> result = Result.swapNodes(indexes, queries);

        result.stream()
            .map(
                r -> r.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
