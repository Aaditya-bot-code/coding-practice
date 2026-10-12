# Anagram

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Anagram](https://www.hackerrank.com/challenges/anagram/problem)

## Problem Description

Two words are [*anagrams*](https://en.wikipedia.org/wiki/Anagram) of one another if their letters can be rearranged to form the other word.

Given a string, split it into two contiguous substrings of equal length.  Determine the minimum number of characters to change to make the two substrings into anagrams of one another.

**Example** **

Break  into two parts: 'abc' and 'cde'.  Note that all letters have been used, the substrings are contiguous and their lengths are equal.  Now you can change 'a' and 'b' in the first substring to 'd' and 'e' to have 'dec' and 'cde' which are anagrams.  Two changes were necessary.

Function Description**

Complete the *anagram* function in the editor below.

anagram has the following parameter(s):

* *string s:* a string

**Returns**

* *int:* the minimum number of characters to change or -1.

**Input Format**

The first line will contain an integer, , the number of test cases. **
Each test case will contain a string .

Constraints**

*  **

*

*  consists only of characters in the range ascii[a-z].

Sample Input**

```
6
aaabbb
ab
abc
mnop
xyyx
xaxbbbxx

```

**Sample Output**

```
3
1
-1
2
0
1

```

**Explanation**

*Test Case #01:* We split  into two strings ='aaa' and ='bbb'.  We have to replace all three characters from the first string with 'b' to make the strings anagrams.

*Test Case #02:* You have to replace 'a' with 'b', which will  generate "bb".

*Test Case #03:* It is not possible for two strings of unequal length to be anagrams of one another.

*Test Case #04:* We have to replace both the characters of first string ("mn") to make it an anagram of the other one.

*Test Case #05:*  and  are already anagrams of one another.

*Test Case #06:* Here *S1 = "xaxb"* and *S2 = "bbxx"*. You must replace 'a' from *S1* with 'b' so that *S1 = "xbxb"*.

## Examples



## Constraints



## Solution

```java8
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

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
