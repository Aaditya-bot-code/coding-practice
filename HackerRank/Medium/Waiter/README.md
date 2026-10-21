# Waiter

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Waiter](https://www.hackerrank.com/challenges/waiter/problem)

## Problem Description

You are a waiter at a party.  There is a pile of numbered plates.  Create an empty  array.  At each iteration, , remove each plate from the top of the stack in order.  Determine if the number on the plate is evenly divisible by the  prime number.  If it is, stack it in pile .  Otherwise, stack it in stack .  Store the values in  from top to bottom in .  In the next iteration, do the same with the values in stack .  Once the required number of iterations is complete, store the remaining values in  in , again from top to bottom.  Return the  array.

**Example**

 **

An abbreviated list of primes is .  Stack the plates in reverse order.

Begin iterations.  On the first iteration, check if items are divisible by .

Move  elements to .

On the second iteration, test if  elements are divisible by .

Move  elmements to .

And on the third iteration, test if  elements are divisible by .

Move  elmements to .

All iterations are complete, so move the remaining elements in , from top to bottom, to .

.  Return this list.

Function Description**

Complete the *waiter* function in the editor below.

*waiter* has the following parameters:

* *int number[n]:* the numbers on the plates

* *int q:* the number of iterations

**Returns**

* *int[n]:* the numbers on the plates after processing

**Input Format**

The first line contains two space separated integers,  and . **
The next line contains  space separated integers representing the initial pile of plates, i.e., .

Constraints**

 **

Sample Input 0**

```
5 1
3 4 7 6 5

```

**Sample Output 0**

```
4
6
3
7
5

```

**Explanation 0**

Initially:

 = [3, 4, 7, 6, 5]<-TOP

After 1 iteration (divide by 2, the 1st prime number):

 = [5, 7, 3]<-TOP

 = [6, 4]<-TOP

Move  elements to .

All iterations are complete, so move  elements to .

.

**Sample Input 1**

```
5 2
3 3 4 4 9

```

**Sample Output 1**

```
4
4
9
3
3

```

**Explanation 1**

Initially:

 = [3, 3, 4, 4, 9]<-TOP

After  iteration (divide by 2):

 = [9, 3, 3]<-TOP

 = [4, 4]<-TOP

Move  to .

After  iteration (divide by 3):

 = []<- TOP

 = [3, 3, 9]<-TOP

Move  elements to .

There are no values remaining in .

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Waiter
// Link: https://www.hackerrank.com/challenges/waiter/problem
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
     * Complete the 'waiter' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY number
     *  2. INTEGER q
     */
    static Boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i = 2 ; i* i <= n ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
            
        }
        return true;
    }
    public static List<Integer> waiter(List<Integer> number, int q) {
    // Write your code here
    Stack<Integer> current = new Stack<>();
    List<Integer> answers = new ArrayList<>();
    for(int num : number)
    {
        current.push(num);
    }
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();
    int prime = 2;
    for(int i = 0 ; i< q ;i++)
    {
        while(!isPrime(prime))
        {
            prime++;
        }
        while(!current.empty())
        {
        int plate = current.pop();
        if(plate % prime == 0)
        {
           B.push(plate); 
        }
        else{
            A.push(plate);
        }
        }
        while(!B.empty())
        {
            answers.add(B.pop());
        }
        current = A;
        prime++;
        A = new Stack<>();
        B = new Stack<>();
    }
    while(!current.empty())
    {
        answers.add(current.pop());
    }
    return answers;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> number = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.waiter(number, q);

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
