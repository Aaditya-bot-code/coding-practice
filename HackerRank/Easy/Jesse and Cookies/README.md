# Jesse and Cookies

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Jesse and Cookies](https://www.hackerrank.com/challenges/jesse-and-cookies/problem)

## Problem Description

Jesse loves cookies and wants the sweetness of some cookies to be greater than value . To do this, two cookies with the least sweetness are repeatedly mixed. This creates a special combined cookie with:

*sweetness*  *Least sweet cookie*    *2nd least sweet cookie*).

This occurs until all the cookies have a sweetness  .

Given the sweetness of a number of cookies, determine the minimum number of operations required. If it is not possible, return .

**Example** **

The smallest values are .

Remove them then return  to the array.  Now .

Remove  and return  to the array.  Now .

Remove , return  and .

Finally, remove  and return  to .  Now .

All values are  so the process stops after  iterations.  Return .

Function Description** **
Complete the *cookies* function in the editor below.

*cookies* has the following parameters:

* *int k:* the threshold value

* *int A[n]:* an array of sweetness values

Returns**

* *int:* the number of iterations required or

**Input Format**

The first line has two space-separated integers,  and , the size of  and  the minimum required sweetness respectively.

The next line contains  space-separated integers, .

**Constraints**

 **

Sample Input**

```
STDIN               Function
-----               --------
6 7                 A[] size n = 6, k = 7
1 2 3 9 10 12       A = [1, 2, 3, 9, 10, 12]

```

**Sample Output**

```
2

```

**Explanation**

Combine the first two cookies to create a cookie with *sweetness*  =

After this operation, the cookies are .

Then, combine the cookies with sweetness  and sweetness , to create a cookie with resulting *sweetness*  =

Now, the cookies are .

All the cookies have a sweetness .

Thus,  operations are required to increase the sweetness.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Jesse and Cookies
// Link: https://www.hackerrank.com/challenges/jesse-and-cookies/problem
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
     * Complete the 'cookies' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     */

    public static int cookies(int k, List<Integer> A) {
    // Write your code here
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.addAll(A);
    int operations = 0;
    while(pq.peek() < k)
    {
        if(pq.size() < 2)
        {
            return -1;
        }
        int first = pq.poll();
        int second = pq.poll();
        int sweetness = 1*first + 2*second;
        pq.offer(sweetness);
        operations++;
    }
    return operations;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.cookies(k, A);

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
