# Maximum Element

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Maximum Element](https://www.hackerrank.com/challenges/maximum-element/problem)

## Problem Description

You have an empty sequence, and you will be given  queries. Each query is one of these three types:

```
1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.

```

**Function Description**

Complete the *getMax* function in the editor below.

*getMax* has the following parameters: **
- *string operations[n]:* operations as strings

Returns** **
- *int[]:* the answers to each type 3 query

Input Format**

The first line of input contains an integer, . The next  lines each contain an above mentioned query.

**Constraints**

**Constraints** **

All queries are valid.

Sample Input**

```
STDIN   Function
-----   --------
10      operations[] size n = 10
1 97    operations = ['1 97', '2', '1 20', ....]
2
1 20
2
1 26
1 20
2
3
1 91
3

```

**Sample Output**

```
26
91

```

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Maximum Element
// Link: https://www.hackerrank.com/challenges/maximum-element/problem
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
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
    // Write your code here

    List<Integer> list = new ArrayList<>();
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    for(String operation : operations)
    {
        String[] parts = operation.split(" ");
        int type = Integer.parseInt(parts[0]);
        if(type == 1)
        {
            int x = Integer.parseInt(parts[1]);
            stack1.push(x);
            if(stack2.isEmpty())
            {
                stack2.push(x);
            }
            else if(stack2.peek() < x)
            {
                stack2.push(x);
            }
            else{
                stack2.push(stack2.peek());
            }
            
        }
        if(type == 2)
        {
            if(!stack1.isEmpty())
            {
            stack1.pop();
            stack2.pop();
            }
        }
        if(type == 3)
        {
            if(!stack2.isEmpty())
            {
            list.add(stack2.peek());
            }
        }
    }
    return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
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
