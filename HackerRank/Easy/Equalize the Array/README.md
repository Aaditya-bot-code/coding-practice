# Equalize the Array

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Equalize the Array](https://www.hackerrank.com/challenges/equality-in-a-array/problem)

## Problem Description

Given an array of integers, determine the minimum number of elements to delete to leave only elements of equal value.

**Example**

Delete the  elements  and  leaving . If both twos plus either the  or the  are deleted, it takes  deletions to leave either  or .  The minimum number of deletions is .

**Function Description**

Complete the *equalizeArray* function in the editor below.

equalizeArray has the following parameter(s):

* *int arr[n]:* an array of integers

**Returns**

* *int:* the minimum number of deletions required

**Input Format**

The first line contains an integer , the number of elements in . **
The next line contains  space-separated integers .

Constraints**

*

*

**Sample Input**

```
STDIN       Function
-----       --------
5           arr[] size n = 5
3 3 2 1 3   arr = [3, 3, 2, 1, 3]

```

**Sample Output**

```
2

```

**Explanation**

Delete  and  to leave . This is minimal.  The only other options are to delete  elements to get an array of either  or .

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Equalize the Array
// Link: https://www.hackerrank.com/challenges/equality-in-a-array/problem
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
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
    HashMap<Integer,Integer> frequency = new HashMap<>();
    int maxCount =0;
    for(int num : arr){
        int count = frequency.getOrDefault((num), 0);
        frequency.put(num,count+1);
        if(maxCount < frequency.get(num))
        {
            maxCount = frequency.get(num); 
        }
    }
    return (arr.size()-maxCount);
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalizeArray(arr);

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
