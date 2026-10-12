// HackerRank Problem: Making Anagrams
// Link: https://www.hackerrank.com/challenges/making-anagrams/problem
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
     * Complete the 'makingAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int makingAnagrams(String s1, String s2) {
    // Write your code here
    int frequency[] =new int[26];
    int common=0;
    for(int i=0;i<s1.length();i++)
    {
        int index =s1.charAt(i)-'a';
        frequency[index]++;
    }
    for(int i=0;i<s2.length();i++)
    {
        int index = s2.charAt(i)-'a';
        if(frequency[index]>0)
        {
            common++;
            frequency[index]--;
            
        }
    }
    int totalDeletion = s1.length()+s2.length() -(2*common);
    return totalDeletion;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
