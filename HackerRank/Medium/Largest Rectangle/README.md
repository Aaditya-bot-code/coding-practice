# Largest Rectangle 

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Largest Rectangle ](https://www.hackerrank.com/challenges/largest-rectangle/problem)

## Problem Description

*Skyline Real Estate Developers* is planning to demolish a number of old, unoccupied buildings and construct a shopping mall in their place. Your task is to find the largest solid area in which the mall can be constructed.

There are a number of buildings in a certain two-dimensional landscape. Each building has a height, given by . If you join  adjacent buildings, they will form a solid rectangle of area .

**Example** **

A rectangle of height  and length  can be constructed within the boundaries.  The area formed is .

Function Description**

Complete the function `largestRectangle` int the editor below.  It should return an integer representing the largest rectangle that can be formed within the bounds of consecutive buildings.

largestRectangle has the following parameter(s):

* *int h[n]:* the building heights

**Returns** **
- *long:* the area of the largest rectangle that can be formed within the bounds of consecutive buildings

Input Format**

The first line contains , the number of buildings. **
The second line contains  space-separated integers, each the height of a building.

Constraints**

*

*

**Sample Input**

```
STDIN       Function
-----       --------
5           h[] size n = 5
1 2 3 4 5   h = [1, 2, 3, 4, 5]

```

**Sample Output**

```
9

```

**Explanation**

An illustration of the test case follows.

![image](https://s3.amazonaws.com/hr-challenge-images/8136/1436794554-75e178e325-drawing47.svg)

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Largest Rectangle 
// Link: https://www.hackerrank.com/challenges/largest-rectangle/problem
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
     * Complete the 'largestRectangle' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */

    public static long largestRectangle(List<Integer> h) {
    // Write your code here
    Stack<Integer> stack = new Stack<>();
    long maxArea = 0;
    int n = h.size();
    for(int i = 0 ; i < n ; i++)
    {
        while(!stack.empty() && h.get(stack.peek()) > h.get(i))
        {
            int top = stack.pop();
            int height = h.get(top);
            
            int width;
            if(stack.empty()){
                width = i;
            }
            else{
                width = i - stack.peek() - 1;
            }
            long area = height*width;
            maxArea = Math.max(maxArea,area);
        }
        stack.push(i);
    }
    while(!stack.empty())
    {
        int top = stack.pop();
        int height = h.get(top);
        
        int width;
        if(stack.empty())
        {
            width = n;
        }
        else{
            width = n - stack.peek() - 1;
        }
        long area = height*width;
        maxArea = Math.max(maxArea,area);
    }
    return maxArea;
    
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.largestRectangle(h);

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
