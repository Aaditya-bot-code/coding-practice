# Simple Array Sum

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Simple Array Sum](https://www.hackerrank.com/challenges/simple-array-sum/problem)

## Problem Description

Given an array of integers, find the sum of its elements.

For example, if the array , , so return .

**Function Description**

Complete the  function with the following parameter(s):

* : an array of integers

**Returns**

* : the sum of the array elements

**Input Format**

The first line contains an integer, , denoting the size of the array. **
The second line contains  space-separated integers representing the array's elements.

Constraints**

**Sample Input**

```
STDIN           Function
-----           --------
6               ar[] size n = 6
1 2 3 4 10 11   ar = [1, 2, 3, 4, 10, 11]

```

**Sample Output**

```
31

```

**Explanation**

Print the sum of the array's elements: .

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Simple Array Sum
// Link: https://www.hackerrank.com/challenges/simple-array-sum/problem
// Difficulty: Easy
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
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
    // Write your code here
    int sum = 0;
    for(int i = 0 ; i < ar.size() ; i++)
    {
        sum += ar.get(i);
    }
    return sum;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

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
