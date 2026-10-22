# Get Node Value

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Get Node Value](https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem)

## Problem Description

This challenge is part of a tutorial track by [MyCodeSchool](http://www.youtube.com/mycodeschool)

Given a pointer to the head of a linked list and a specific position, determine the data value at that position. Count backwards from the tail node.  The tail is at postion 0, its parent is at 1 and so on.

**Example** **
 refers to

Each of the data values matches its distance from the tail.  The value  is at the desired position.

Function Description**

Complete the *getNode* function in the editor below.

*getNode* has the following parameters:

* *SinglyLinkedListNode pointer head:* refers to the head of the list

* *int positionFromTail:* the item to retrieve

**Returns**

* *int:* the value at the desired position

**Input Format**

The first line contains an integer , the number of test cases.

Each test case has the following format: **
The first line contains an integer , the number of elements in the linked list.

The next  lines contains an integer, the data value for an element of the linked list.

The last line contains an integer , the position from the tail to retrieve the value of.

Constraints**

*

*

* , where  is the  element of the linked list.

*

**Sample Input**

```
2
1
1
0
3
3
2
1
2

```

**Sample Output**

```
1
3

```

**Explanation**

In the first case, there is one element in linked list with a value of 1. The last (only) element contains 1.

In the second case, the list is . The element with position of 2 from tail contains 3.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Get Node Value
// Link: https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
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
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

class Result {

    /*
     * Complete the 'getNode' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER positionFromTail
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

    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    // Write your code here
    SinglyLinkedListNode temp = llist;
    int length = 0 ;
    while(temp != null)
    {
        temp = temp.next;
        length++;
    }
    int targetIndex = length - 1 - positionFromTail;
    SinglyLinkedListNode current = llist;
    int i = 0;
    while( i < targetIndex)
    {
        current = current.next;
        i++;
    } 
    return current.data;
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

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

                int position = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.getNode(llist.head, position);

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
