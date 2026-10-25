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
