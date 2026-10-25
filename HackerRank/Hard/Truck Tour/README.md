# Truck Tour

**Difficulty:** Hard  
**Topics:** N/A  
**HackerRank URL:** [Truck Tour](https://www.hackerrank.com/challenges/truck-tour/problem)

## Problem Description

Suppose there is a circle. There are  petrol pumps on that circle. Petrol pumps are numbered  to  (both inclusive). You have two pieces of information corresponding to each of the petrol pump: (1) the amount of petrol that particular petrol pump will give, and (2) the distance from that petrol pump to the next petrol pump.

Initially, you have a tank of infinite capacity carrying no petrol. You can start the tour at any of the petrol pumps. Calculate the first point from where the truck will be able to complete the circle. Consider that the truck will stop at each of the petrol pumps. The truck will move one kilometer for each litre of the petrol.

**Input Format**

The first line will contain the value of .**
The next  lines will contain a pair of integers each, i.e. the amount of petrol that petrol pump will give and the distance between that petrol pump and the next petrol pump.

Constraints:****

Output Format**

An integer which will be the smallest index of the petrol pump from which we can start the tour.

**Sample Input**

```
3
1 5
10 3
3 4

```

**Sample Output**

```
1

```

**Explanation**

We can start the tour from the second petrol pump.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Truck Tour
// Link: https://www.hackerrank.com/challenges/truck-tour/problem
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
     * Complete the 'truckTour' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY petrolpumps as parameter.
     */

    public static int truckTour(List<List<Integer>> petrolpumps) {
    // Write your code here
    int start = 0;
    long currentPetrol = 0;
    long totalPetrol = 0;
    for(int i =0 ; i < petrolpumps.size() ; i++)
    {
        int petrol = petrolpumps.get(i).get(0);
        int distance= petrolpumps.get(i).get(1);
         currentPetrol += petrol - distance;
         totalPetrol += petrol - distance;
         if(currentPetrol < 0)
         {
            start = i + 1;
            currentPetrol = 0;
         }
    }
    if(totalPetrol < 0)
    {
       return -1; 
    }
    return start;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> petrolpumps = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                petrolpumps.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.truckTour(petrolpumps);

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
