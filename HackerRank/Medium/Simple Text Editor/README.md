# Simple Text Editor

**Difficulty:** Medium  
**Topics:** N/A  
**HackerRank URL:** [Simple Text Editor](https://www.hackerrank.com/challenges/simple-text-editor/problem)

## Problem Description

Implement a simple text editor. The editor initially contains an empty string, . Perform  operations of the following  types:

* *append* - Append string  to the end of .

* *delete* - Delete the last  characters of .

* *print* - Print the  character of .

* *undo* - Undo the last (not previously undone) operation of type  or , reverting  to the state it was in prior to that operation.

**Example**

 **

```
operation
index   S       ops[index]  explanation
-----   ------  ----------  -----------
0       abcde   1 fg        append fg
1       abcdefg 3 6         print the 6th letter - f
2       abcdefg 2 5         delete the last 5 letters
3       ab      4           undo the last operation, index 2
4       abcdefg 3 7         print the 7th characgter - g
5       abcdefg 4           undo the last operation, index 0
6       abcde   3 4         print the 4th character - d

```

The results should be printed as:

```
f
g
d

```

Input Format**

The first line contains an integer, , denoting the number of operations. **
Each line  of the  subsequent lines (where ) defines an operation to be performed. Each operation starts with a single integer,  (where ), denoting a type of operation as defined in the *Problem Statement* above. If the operation requires an argument,  is followed by its space-separated argument. For example, if  and , line  will be `1 abcd`.

Constraints**

*

*

* The sum of the lengths of all  in the input .

* The sum of  over all delete operations .

* All input characters are lowercase English letters.

* It is guaranteed that the sequence of operations given as input is possible to perform.

**Output Format**

Each operation of type  must print the  character on a new line.

**Sample Input**

```
STDIN   Function
-----   --------
8       Q = 8
1 abc   ops[0] = '1 abc'
3 3     ops[1] = '3 3'
2 3     ...
1 xy
3 2
4
4
3 1

```

**Sample Output**

```
c
y
a

```

**Explanation**

Initially,  is empty. The following sequence of  operations are described below:

* . We append  to , so .

* Print the  character on a new line. Currently, the  character is `c`.

* Delete the last  characters in  (), so .

* Append  to , so .

* Print the  character on a new line. Currently, the  character is `y`.

* Undo the last update to , making  empty again (i.e., ).

* Undo the next to last update to  (the deletion of the last  characters), making .

* Print the  character on a new line. Currently, the  character is `a`.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Simple Text Editor
// Link: https://www.hackerrank.com/challenges/simple-text-editor/problem
// Difficulty: Medium
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Stack<String> history = new Stack<>();
        StringBuilder currentText = new StringBuilder();
        for(int i = 0 ; i< q ; i++)
        {
            int type= sc.nextInt();
            switch(type)
            {
                case 1:
                    String w = sc.next();
                    history.push(currentText.toString());
                    currentText.append(w);
                    break;
                case 2:
                    int k = sc.nextInt();
                    history.push(currentText.toString());
                    currentText.delete(currentText.length() - k,currentText.length());
                    break;
                case 3:
                    int m = sc.nextInt(); 
                    System.out.println(currentText.charAt(m - 1));
                    break;
                case 4:
                    currentText = new StringBuilder(history.pop());
                    break;
            }
        }
        
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
