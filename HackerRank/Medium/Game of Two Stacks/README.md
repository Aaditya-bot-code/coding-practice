# Game of Two Stacks

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Game of Two Stacks](https://www.hackerrank.com/challenges/game-of-two-stacks/problem)

## Problem Description

Alexa has two stacks of non-negative integers, stack  and stack  where index  denotes the top of the stack. Alexa challenges Nick to play the following game:

* In each move, Nick can remove one integer from the top of either stack  or stack .

* Nick keeps a running sum of the integers he removes from the two stacks.

* Nick is disqualified from the game if, at any point, his running sum becomes greater than some integer  given at the beginning of the game.

* Nick's *final score* is the total number of integers he has removed from the two stacks.

Given , , and  for  games, find the maximum possible score Nick can achieve.

**Example** **

The maximum number of values Nick can remove is .  There are two sets of choices with this result.

* Remove  from  with a sum of .

* Remove  from  and  from  with a sum of .

Function Description** **
Complete the *twoStacks* function in the editor below.

*twoStacks* has the following parameters:
- *int maxSum:* the maximum allowed sum

- *int a[n]:* the first stack

- *int b[m]:* the second stack

Returns** **
- *int:* the maximum number of selections Nick can make

Input Format**

The first line contains an integer,  (the number of games). The  subsequent lines describe each game in the following format:

* The first line contains three space-separated integers describing the respective values of  (the number of integers in stack ),  (the number of integers in stack ), and  (the number that the sum of the integers removed from the two stacks cannot exceed).

* The second line contains  space-separated integers, the respective values of .

* The third line contains  space-separated integers, the respective values of .

**Constraints**

*

*

*

*

**Subtasks**

*  for  of the maximum score.

**Sample Input 0**

```
1
5 4 10
4 2 4 6 1
2 1 8 5

```

**Sample Output 0**

```
4

```

**Explanation 0**

The two stacks initially look like this:

![image](https://s3.amazonaws.com/hr-assets/0/1485853935-9b24f12026-twoarray3.png)

The image below depicts the integers Nick should choose to remove from the stacks. We print  as our answer, because that is the maximum number of integers that can be removed from the two stacks without the sum exceeding .

![image](https://s3.amazonaws.com/hr-assets/0/1485849154-50c4a29f7d-twoarray2.png)

(There can be multiple ways to remove the integers from the stack, the image shows just one of them.)

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Game of Two Stacks
// Link: https://www.hackerrank.com/challenges/game-of-two-stacks/problem
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
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    // Write your code here
    int sum = 0;
    int countA = 0 ;
    int countB = 0;
    while( countA < a.size() && sum + a.get(countA) <= maxSum)
    {
        sum += a.get(countA);
        countA++;
    }
    int maxCount = countA;
    for(int i = 0 ; i<b.size() ; i++)
    {
        sum += b.get(i);
        countB++;
        while(sum >maxSum && countA > 0)
        {
            countA--;
            sum -= a.get(countA);
            
        }
        if(sum > maxSum)
        {
            break;
        }
        
        maxCount = Math.max(maxCount, countA + countB);
        
    }
    return maxCount;
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int maxSum = Integer.parseInt(firstMultipleInput[2]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                int result = Result.twoStacks(maxSum, a, b);

                bufferedWriter.write(String.valueOf(result));
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
