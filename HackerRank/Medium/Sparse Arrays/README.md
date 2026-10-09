# Sparse Arrays

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Sparse Arrays](https://www.hackerrank.com/challenges/sparse-arrays/problem)

## Problem Description

There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

**Example**

 **

There are  instances of '',  of '', and  of ''. For each query, add an element to the return array: .

Function Description**

Complete the function  with the following parameters:

* : an array of strings to search

* : an array of query strings

**Returns**

* : the results of each query

**Input Format**

The first line contains and integer , the size of . **
Each of the next  lines contains a string .

The next line contains , the size of .

Each of the next  lines contains a string .

Constraints**

 .

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Sparse Arrays
// Link: https://www.hackerrank.com/challenges/sparse-arrays/problem
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
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
    // Write your code here
    List<Integer>result = new ArrayList<>();
    HashMap<String,Integer> map = new HashMap<>();
    for(String str : stringList)
    {
        map.put(str,map.getOrDefault(str, 0)+1);
    }
    for(String str : queries)
    {
        if(map.containsKey(str))
        {
            result.add(map.get(str));
        }
        else{
            result.add(0);
        }
    }
    return result;
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> stringList = IntStream.range(0, stringListCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.matchingStrings(stringList, queries);

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

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
