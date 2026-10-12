// HackerRank Problem: Anagram
// Link: https://www.hackerrank.com/challenges/anagram/problem
// Difficulty: Easy
// Language: java8

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
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
    // Write your code here
    if(s.length()%2 !=0)
    {
        return-1;
    }
    int mid =s.length()/2;
    int frequency[] = new int[26];
    for(int i=0;i<mid;i++)
    {
        int index = s.charAt(i)-'a';
        frequency[index]++;
    }
    for(int i=mid;i<s.length();i++)
    {
        int index = s.charAt(i)-'a';
        if(frequency[index]>0)
        {
            frequency[index]--;
        }
    }
    int change=0;
    for(int i=0;i<frequency.length;i++)
    {
        if(frequency[i]>0){
        change += frequency[i];
        }
    }
    return change;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.anagram(s);

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
