# Left Rotation

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Left Rotation](https://www.hackerrank.com/challenges/array-left-rotation/problem)

## Problem Description

A  operation on a circular array shifts each of the array's elements  unit to the left. The elements that fall off the left end reappear at the right end. Given an integer , rotate the array that many steps to the left and return the result.

**Example** **

After  rotations, .

Function Description**

Complete the  function with the following parameters:

* : the amount to rotate by

* : the array to rotate

**Returns**

* : the rotated array

**Input Format**

The first line contains two space-separated integers that denote , the number of integers, and , the number of left rotations to perform. **
The second line contains  space-separated integers that describe .

Constraints**

*

*

*

**Sample Input**

```
STDIN      Function
-----      --------
5 4         n = 5 d = 4
1 2 3 4 5  arr = [1, 2, 3, 4, 5]

```

**Sample Output**

```
5 1 2 3 4

```

**Explanation**

To perform  left rotations, the array undergoes the following sequence of changes:

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Left Rotation
// Link: https://www.hackerrank.com/challenges/array-left-rotation/problem
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
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    List<Integer> result = new ArrayList<>();
    for(int i = 0 ;i < arr.size() ;i++)
    {
        int Index = (i+d)%arr.size();
        result.add(arr.get(Index));
        
    }
    return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
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
