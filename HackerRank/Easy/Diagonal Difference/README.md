# Diagonal Difference

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem)

## Problem Description

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

```
1 2 3
4 5 6
9 8 9

```

* The left-to-right diagonal = .

* The right-to-left diagonal = .

Their absolute difference is .

**Function description**

Complete the  function with the following parameter:

* : a 2-D array of integers

**Return**

* : the absolute difference in sums along the diagonals

**Input Format**

The first line contains a single integer, ,  the number of rows and columns in the square matrix . **
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints**

*

**Sample Input**

```
STDIN      Function
-----      --------
3           arr[][] sizes n = 3, m = 3
11 2 4     arr = [[11, 2, 4], [4, 5, 6], [10, 8, -12]]
4 5 6
10 8 -12

```

**Sample Output**

```
15

```

**Explanation**

The primary diagonal is:

```
11
   5
     -12

```

Sum across the primary diagonal: .

The secondary diagonal is:

```
     4
   5
10

```

Sum across the secondary diagonal:  **
Difference:

Note:** |x| is the [absolute value](https://www.mathsisfun.com/numbers/absolute-value.html) of x.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Diagonal Difference
// Link: https://www.hackerrank.com/challenges/diagonal-difference/problem
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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int primarySum = 0;
    int secondarySum = 0;
    for( int i = 0 ; i<arr.size() ; i++)
    {
        primarySum += arr.get(i).get(i);
        secondarySum +=arr.get(i).get(arr.size() - 1 - i);
    }
    return Math.abs(primarySum - secondarySum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

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
