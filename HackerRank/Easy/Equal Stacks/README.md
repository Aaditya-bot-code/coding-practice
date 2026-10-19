# Equal Stacks

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Equal Stacks](https://www.hackerrank.com/challenges/equal-stacks/problem)

## Problem Description

You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. You can change the height of a stack by removing and discarding its topmost cylinder any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they are all the same height, then return the height.

**Example**

 **

There are  and  cylinders in the three stacks, with their heights in the three arrays.  Remove the top 2 cylinders from  (heights = [1, 2]) and from  (heights = [1, 1]) so that the three stacks all are 2 units tall.  Return  as the answer.

Note:** An empty stack is still a stack.

**Function Description**

Complete the *equalStacks* function in the editor below.

*equalStacks* has the following parameters:

* *int h1[n1]:* the first array of heights

* *int h2[n2]:* the second array of heights

* *int h3[n3]:* the third array of heights

**Returns**

* *int:* the height of the stacks when they are equalized

**Input Format**

The first line contains three space-separated integers, , , and , the numbers of cylinders in stacks , , and . The subsequent lines describe the respective heights of each cylinder in a stack *from top to bottom*:

* The second line contains  space-separated integers, the cylinder heights in stack . The first element is the top cylinder of the stack.

* The third line contains  space-separated integers, the cylinder heights in stack . The first element is the top cylinder of the stack.

* The fourth line contains  space-separated integers, the cylinder heights in stack . The first element is the top cylinder of the stack.

**Constraints**

*

*

**Sample Input**

```
STDIN       Function
-----       --------
5 3 4       h1[] size n1 = 5, h2[] size n2 = 3, h3[] size n3 = 4
3 2 1 1 1   h1 = [3, 2, 1, 1, 1]
4 3 2       h2 = [4, 3, 2]
1 1 4 1     h3 = [1, 1, 4, 1]

```

**Sample Output**

```
5

```

**Explanation**

Initially, the stacks look like this:

![initial stacks](https://s3.amazonaws.com/hr-challenge-images/21404/1465645257-57311b88de-piles1.png)

To equalize thier heights, remove the first cylinder from stacks  and , and then remove the top two cylinders from stack  (shown below).

![modified stacks](https://s3.amazonaws.com/hr-challenge-images/21404/1465645312-e48f85c176-piles2.png)

The stack heights are reduced as follows:

*

*

*

All three stacks now have , the value to return.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Equal Stacks
// Link: https://www.hackerrank.com/challenges/equal-stacks/problem
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
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    // Write your code here
    int sum1= 0,sum2 =0 ,sum3 =0;
    int i=0,j=0,k=0;
    for(int num : h1)
    {
        sum1+=num;
    }
    for(int num : h2)
    {
        sum2+=num;
    }
    for(int num : h3)
    {
        sum3+=num;
    }
    while(sum1 != sum2 || sum2 != sum3)
    {
        if(sum1 >=sum2 && sum1 >= sum3)
        {
            if(i<h1.size())
            {
            sum1 -=h1.get(i);
            i++;
            }
            else{
                return 0;
            }
        }
        else if(sum2 >= sum1 && sum2 >= sum3)
        {
            if(j<h2.size())
            {
            sum2 -=h2.get(j);
            j++;
            }
            else{
                return 0;
            }
        }
        else
        {
            if(k<h3.size())
            {
            sum3 -=h3.get(k);
            k++;
            }
            else{
                return 0;
            }
        }
    }
    return sum1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

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
