# Strings: Making Anagrams

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Strings: Making Anagrams](https://www.hackerrank.com/challenges/ctci-making-anagrams/problem)

## Problem Description

A student is taking a cryptography class and has found *anagrams* to be very useful. Two strings are anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency. For example, `bacdc` and `dcbac` are anagrams, but `bacdc` and `dcbad` are not.

The student decides on an encryption scheme that involves two large strings.  The encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Determine this number.

Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.

**Example** **

Delete  from  and  from  so that the remaining strings are  and  which are anagrams. This takes  character deletions.

Function Description**

Complete the *makeAnagram* function in the editor below.

makeAnagram has the following parameter(s):

* *string a*: a string

* *string b*: another string

**Returns**

* *int:* the minimum total characters that must be deleted

**Input Format**

The first line contains a single string, . **
The second line contains a single string, .

Constraints**

*

* The strings  and  consist of lowercase English alphabetic letters, ascii[a-z].

**Sample Input**

```
cde
abc

```

**Sample Output**

```
4

```

**Explanation**

Delete the following characters from the strings make them anagrams:

* Remove `d` and `e` from `cde` to get `c`.

* Remove `a` and `b` from `abc` to get `c`.

It takes  deletions to make both strings anagrams.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Strings: Making Anagrams
// Link: https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
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
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
    // Write your code here
    int frequency[] = new int[26];
    int common = 0;
    for(int i=0;i<a.length();i++)
    {
        int index = a.charAt(i)-'a';
        frequency[index]++;
    }   
    for(int i=0;i<b.length();i++)
    {
        int index = b.charAt(i)-'a';
        if(frequency[index]>0)
        {
            common++;
            frequency[index]--;
        }
    } 
    int totalDeletion = (a.length()+b.length())-(2*common);
    return totalDeletion;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
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
