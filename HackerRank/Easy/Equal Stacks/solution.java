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
