# Print in Reverse

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Print in Reverse](https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem)

## Problem Description

This challenge is part of a tutorial track by [MyCodeSchool](http://www.youtube.com/mycodeschool) and is accompanied by a video lesson.

Given a pointer to the head of a singly-linked list, print each  value from the reversed list.  If the given list is empty, do not print anything.

**Example**

 refers to the linked list with  values

Print the following: **
`
3

2

1

`

Function Description**

Complete the *reversePrint* function in the editor below.

*reversePrint* has the following parameters:

* *SinglyLinkedListNode pointer head:* a reference to the head of the list

**Prints**

The  values of each node in the reversed list.

**Input Format**

The first line of input contains , the number of test cases.

The input of each test case is as follows:

* The first line contains an integer , the number of elements in the list.

* Each of the next *n* lines contains a data element for a list node.

**Constraints**

*

* , where  is the  element in the list.

**Sample Input**

```
3
5
16
12
4
2
5
3
7
3
9
5
5
1
18
3
13

```

**Sample Output**

```
5
2
4
12
16
9
3
7
13
3
18
1
5

```

**Explanation**

There are three test cases.  There are no blank lines between test case output.

The first linked list has  elements: . Printing this in reverse order produces:

`5

2

4

12

16`

The second linked list has  elements: . Printing this in reverse order produces:

`9

3

7`

The third linked list has  elements: . Printing this in reverse order produces:

`13

3

18

1

5`

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Print in Reverse
// Link: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem
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

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }
}

class Result {

    /*
     * Complete the 'reversePrint' function below.
     *
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static void reversePrint(SinglyLinkedListNode llist) {
    // Write your code here
     if(llist ==null)
     {
        return ;
     }
     reversePrint(llist.next);
     System.out.println(llist.data);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, tests).forEach(testsItr -> {
            try {
                SinglyLinkedList llist = new SinglyLinkedList();

                int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

                IntStream.range(0, llistCount).forEach(i -> {
                    try {
                        int llistItem = Integer.parseInt(bufferedReader.readLine().trim());

                        llist.insertNode(llistItem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                Result.reversePrint(llist.head);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
