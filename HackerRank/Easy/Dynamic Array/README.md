# Dynamic Array

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Dynamic Array](https://www.hackerrank.com/challenges/dynamic-array/problem)

## Problem Description

* Declare a 2-dimensional array, , with  empty arrays, all zero-indexed.

* Declare an integer, , and initialize it to 0.

You need to process two types of queries:

*
Query:
 Compute .

* Append the integer  to .

*
Query:
 Compute .

* Set .

* Store the new value of  in an answers array.

**Notes:** **
-  is the *bitwise XOR* operation, which corresponds to the `^` operator in most languages. Learn more about it on [Wikipedia](https://en.wikipedia.org/wiki/Exclusive_or).

-  is the modulo operator.

- Finally,  is the number of elements in .

Function Description**

Complete the  function with the following parameters: **
- : the number of empty arrays to initialize in

- : 2-D array of integers

Returns**

* : the results of each type 2 query in the order they are presented

**Input Format**

The first line contains two space-separated integers, , the size of  to create, and , the number of queries, respectively. **
Each of the  subsequent lines contains a query string, .

Constraints**

*

*

* It is guaranteed that query type  will never query an empty array or index.

**Sample Input**

```
STDIN    Function
-----    --------
2 5      size of arr[] n = 2, size of queries[] q = 5
1 0 5    queries = [[1,0,5],[1,1,7],[1,0,3],[2,1,0],[2,1,1]]
1 1 7
1 0 3
2 1 0
2 1 1

```

**Sample Output**

```
7
3

```

**Explanation**

*Initial Values:*

 = [ ]

 = [ ]

*Query 0:* Append  to .

 = [5]

 = [ ]

*Query 1:* Append  to .

 = [5]

 = [7]

*Query 2:* Append  to .

 = [5, 3]

 = [7]

*Query 3:* Assign the value at index  of  to . Store  in your answer array.

 = [5, 3]

 = [7]

*Query 4:* Assign the value at index  of  to . Store  in your answer array.

 = [5, 3]

 = [7]

Return your answer array [7, 3]. The code stub prints its elements on separate lines.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Dynamic Array
// Link: https://www.hackerrank.com/challenges/dynamic-array/problem
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
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
    List<List<Integer>> arr = new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        arr.add(new ArrayList<>());
    }
    List<Integer> answers = new ArrayList<>();
    
    int lastAnswer =0;
    for(List<Integer> query : queries)
    {
       int type = query.get(0); 
       int x = query.get(1);
       int y = query.get(2);
       
       int idx =(x^lastAnswer)%n;
       if(type == 1)
       {
        arr.get(idx).add(y);
       }
       else{
        int elementIndex = y%arr.get(idx).size();
        lastAnswer = arr.get(idx).get(elementIndex);
        
        answers.add(lastAnswer);
       }
    }
    return answers;
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

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

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
