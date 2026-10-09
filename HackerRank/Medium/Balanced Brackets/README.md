# Balanced Brackets

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Balanced Brackets](https://www.hackerrank.com/challenges/balanced-brackets/problem)

## Problem Description

A bracket is considered to be any one of the following characters: `(`, `)`, `{`, `}`, `[`, or `]`.

Two brackets are considered to be a *matched pair* if the an opening bracket (i.e., `(`, `[`, or `{`) occurs to the left of a closing bracket (i.e., `)`, `]`, or `}`) *of the exact same type*. There are three types of matched pairs of brackets: `[]`, `{}`, and `()`.

A matching pair of brackets is *not balanced* if the set of brackets it encloses are not matched. For example, `{[(])}` is not balanced because the contents in between `{` and `}` are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, `(`, and the pair of parentheses encloses a single, unbalanced closing square bracket, `]`.

By this logic, we say a sequence of brackets is *balanced* if the following conditions are met:

* It contains no unmatched brackets.

* The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.

Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return `YES`.  Otherwise, return `NO`.

**Function Description**

Complete the function *isBalanced* in the editor below.

isBalanced has the following parameter(s):

* *string s*: a string of brackets

**Returns**

* *string:* either `YES` or `NO`

**Input Format**

The first line contains a single integer , the number of strings. **
Each of the next  lines contains a single string , a sequence of brackets.

Constraints**

*

* , where  is the length of the sequence.

* All chracters in the sequences ∈ { **{**, **}**, **(**, **)**, **[**, **]** }.

**Output Format**

For each string, return `YES` or `NO`.

**Sample Input**

```
STDIN           Function
-----           --------
3               n = 3
{[()]}          first s = '{[()]}'
{[(])}          second s = '{[(])}'
{{[[(())]]}}    third s ='{{[[(())]]}}'

```

**Sample Output**

```
YES
NO
YES

```

**Explanation**

* The string `{[()]}` meets both criteria for being a balanced string.

* The string `{[(])}` is not balanced because the brackets enclosed by the matched pair `{` and `}` are not balanced: `[(])`.

* The string `{{[[(())]]}}` meets both criteria for being a balanced string.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Balanced Brackets
// Link: https://www.hackerrank.com/challenges/balanced-brackets/problem
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
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        char ch = s.charAt(i);
        if(ch =='('|| ch =='{'|| ch=='[')
        {
          stack.push(ch);  
        }
        else if(ch == ')'|| ch == '}'|| ch == ']')
        {
            if(stack.isEmpty())
            {
                return "NO";
            }
            else if((stack.peek() =='(' && ch == ')')||(stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch == ']'))
            {
                stack.pop();
            }
            else{
                return "NO";
            }
        } 
    }
    if(stack.isEmpty())
    {
        return "YES";
    }
    else{
        return "NO";
    }

}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
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
