# Find the Running Median

**Difficulty:** Hard  
**Topics:** N/A  
**HackerRank URL:** [Find the Running Median](https://www.hackerrank.com/challenges/find-the-running-median/problem)

## Problem Description

The median of a set of integers is the midpoint value of the data set for which an equal number of integers are less than and greater than the value. To find the median, you must first sort your set of integers in non-decreasing order, then:

* If your set contains an odd number of elements, the median is the middle element of the sorted sample. In the sorted set ,  is the median.

* If your set contains an even number of elements, the median is the average of the two middle elements of the sorted sample. In the sorted set ,  is the median.

Given an input stream of  integers, perform the following task for each  integer:

* Add the  integer to a running list of integers.

* Find the median of the updated list (i.e., for the first element through the  element).

* Print the updated median on a new line. The printed value must be a double-precision number scaled to  decimal place (i.e.,  format).

**Example** **

```
Sorted          Median
[7]             7.0
[3, 7]          5.0
[3, 5, 7]       5.0
[2, 3, 5, 7]    4.0

```

Each of the median values is stored in an array and the array is returned for the main function to print.

Note:**  Add formatting to the print statement.

**Function Description** **
Complete the *runningMedian* function in the editor below.

*runningMedian* has the following parameters:

- *int a[n]:* an array of integers

Returns** **
- *float[n]:* the median of the array after each insertion, modify the print statement in main to get proper formatting.

Input Format**

The first line contains a single integer, , the number of integers in the data stream. **
Each line  of the  subsequent lines contains an integer, , to be inserted into the list.

Constraints**

*

*

**Sample Input**

```
STDIN   Function
-----   --------
6       a[] size n = 6
12      a = [12, 4, 5, 3, 8, 7]
4
5
3
8
7

```

**Sample Output**

```
12.0
8.0
5.0
4.5
5.0
6.0

```

**Explanation**

There are  integers, so we must print the new median on a new line as each integer is added to the list:

*

*

*

*

*

*

## Examples



## Constraints



## Solution

```java15
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

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
