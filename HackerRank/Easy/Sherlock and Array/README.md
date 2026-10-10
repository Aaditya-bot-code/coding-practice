# Sherlock and Array

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Sherlock and Array](https://www.hackerrank.com/challenges/three-month-preparation-kit-sherlock-and-array/problem)

## Problem Description

Watson gives Sherlock an array of integers.  His challenge is to find an element of the array such that the sum of all elements to the left is equal to the sum of all elements to the right.

**Example**

 is between two subarrays that sum to .

The answer is  since left and right sum to .

You will be given arrays of integers and must determine whether there is an element that meets the criterion.  If there is, return `YES`.  Otherwise, return `NO`.

**Function Description**

Complete the *balancedSums* function in the editor below.

balancedSums has the following parameter(s):

* *int arr[n]:* an array of integers

**Returns**

* *string:* either `YES` or `NO`

**Input Format**

The first line contains , the number of test cases.

The next  pairs of lines each represent a test case. **
- The first line contains , the number of elements in the array .

- The second line contains  space-separated integers  where .

Constraints**

 **

Sample Input**

```
2
3
1 2 3
4
1 2 3 3

```

**Sample Output**

```
NO
YES

```

**Explanation**

For the first test case, no such index exists.

For the second test case, , therefore index  satisfies the given conditions.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Sherlock and Array
// Link: https://www.hackerrank.com/challenges/three-month-preparation-kit-sherlock-and-array/problem
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
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
    // Write your code here
    int totalSum = 0;
    for(int num : arr){
        totalSum += num;
    }
    int leftSum = 0;
    for(int i=0; i<arr.size() ; i++)
    {
        int rightSum = totalSum-leftSum-arr.get(i);
        if(leftSum == rightSum)
        {
            return "YES";
        }
        else{
            leftSum += arr.get(i);
        }
    }
    return "NO";
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = Result.balancedSums(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

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
