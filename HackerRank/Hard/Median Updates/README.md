# Median Updates

**Difficulty:** Hard  
**Topics:** N/A  
**HackerRank URL:** [Median Updates](https://www.hackerrank.com/challenges/median/problem)

## Problem Description

The median of  numbers is defined as the middle number after sorting them in order if  is odd. Or it is the average of the middle two numbers if  is even. You start with an empty number list. Then, you can add numbers to the list, or remove existing numbers from it. After each add or remove operation, output the median.

**Example:** **
For a set of  numbers  the median is the third number in the sorted set , which is . Similarly, for a set of  numbers, , the median is the average of the second and the third element in the sorted set , which is .

Input:** **
The first line is an integer, , that indicates the number of operations. Each of the next  lines is either *a x* or *r x*. *a x* indicates that  is added to the set, and *r x* indicates that  is removed from the set.

Output:** **
For each operation: If the operation is *add*, output the median after adding  in a single line. If the operation is *remove* and the number  is not in the list, output *Wrong!* in a single line. If the operation is *remove* and the number  is in the list, output the median after deleting  in a single line. (If the result is an integer DO NOT output decimal point. And if the result is a real number, DO NOT output trailing 0s.)

Note** **
If your median is 3.0, print only 3. And if your median is 3.50, print only 3.5. Whenever you need to print the median and the list is empty, print *Wrong!*

Constraints:** **

For each *a x* or *r x*,  will always be a signed integer (which will fit in 32 bits).

Sample Input:**

```
7
r 1
a 1
a 2
a 1
r 1
r 2
r 1

```

**Sample Output:**

```
Wrong!
1
1.5
1
1.5
1
Wrong!

```

**Note:** As evident from the last line of the input, if after remove operation the list becomes empty, you have to print *Wrong!*.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Median Updates
// Link: https://www.hackerrank.com/challenges/median/problem
// Difficulty: Hard
// Language: java15


import java.io.*;
import java.util.*;

public class Solution {
    static TreeMap<Integer, Integer> left = new TreeMap<>();
    static TreeMap<Integer, Integer> right = new TreeMap<>();

    static int leftSize = 0;
    static int rightSize = 0;

    static void add(TreeMap<Integer, Integer> map, int num) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    static void remove(TreeMap<Integer, Integer> map, int num) {
        int count = map.get(num);

        if (count == 1) {
            map.remove(num);
        } else {
            map.put(num, count - 1);
        }
    }

    static void rebalance() {
        while (leftSize > rightSize + 1) {
            int num = left.lastKey();
            remove(left, num);
            add(right, num);
            leftSize--;
            rightSize++;
        }

        while (rightSize > leftSize + 1) {
            int num = right.firstKey();
            remove(right, num);
            add(left, num);
            rightSize--;
            leftSize++;
        }

        if (leftSize > 0 && rightSize > 0
                && left.lastKey() > right.firstKey()) {
            int a = left.lastKey();
            int b = right.firstKey();

            remove(left, a);
            remove(right, b);

            add(left, b);
            add(right, a);
        }
    }

    static void insert(int num) {
        if (leftSize == 0 || num <= left.lastKey()) {
            add(left, num);
            leftSize++;
        } else {
            add(right, num);
            rightSize++;
        }

        rebalance();
    }

    static boolean delete(int num) {
        if (left.containsKey(num)) {
            remove(left, num);
            leftSize--;
        } else if (right.containsKey(num)) {
            remove(right, num);
            rightSize--;
        } else {
            return false;
        }

        rebalance();
        return true;
    }

    static void printMedian() {
        if (leftSize + rightSize == 0) {
            System.out.println("Wrong!");
            return;
        }

        if (leftSize > rightSize) {
            System.out.println(left.lastKey());
        } else if (rightSize > leftSize) {
            System.out.println(right.firstKey());
        } else {
            long sum = (long) left.lastKey() + right.firstKey();

            if (sum % 2 == 0) {
                System.out.println(sum / 2);
            } else {
                System.out.println(String.format(
                    java.util.Locale.US, "%.1f", sum / 2.0
                ));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < n; i++) {
            StringTokenizer st =
                new StringTokenizer(br.readLine());

            String operation = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (operation.equals("a")) {
                insert(num);
                printMedian();
            } else if (operation.equals("r")) {
                if (!delete(num)) {
                    System.out.println("Wrong!");
                } else {
                    printMedian();
                }
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
