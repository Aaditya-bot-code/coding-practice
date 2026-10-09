# Insert a node at a specific position in a linked list

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Insert a node at a specific position in a linked list](https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem)

## Problem Description

This challenge is part of a tutorial track by [MyCodeSchool](http://www.youtube.com/mycodeschool) and is accompanied by a video lesson.

Given a pointer to the head node of a linked list and an integer to insert at a certain position, create a new node with the given integer as its  attribute, insert this node at the desired position, and return the head node.

A position of 0 indicates the head, a position of 1 indicates one node away from the head, and so on. The head pointer given may be null, meaning that the initial list is empty.

**Example** **
 refers to the first node in the list

Insert a node at position  with .  The new list is

Function Description** **
Complete the function  with the following parameters:

* : a reference to the head of the list

* : an integer value to insert as data in the new node

* : an integer position to insert the new node, zero-based indexing

Returns**

* : a reference to the head of the revised list

**Input Format**

The first line contains an integer , the number of elements in the linked list. **
Each of the next  lines contains an integer SinglyLinkedListNode[i].data.

The next line contains an integer , the data of the node that is to be inserted.

The last line contains an integer .

Constraints**

*

* , where  is the  element of the linked list.

* .

**Sample Input**

```
STDIN   Function
-----   --------
3       n = 3
16      llist = 16->13->7
13
7
1       data = 1
2       position = 2

```

**Sample Output**

```
16 13 1 7

```

**Explanation**

The initial linked list is . Insert  at the position  which currently has  in it. The updated linked list is .

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Insert a node at a specific position in a linked list
// Link: https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
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
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
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

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
    SinglyLinkedListNode p = new SinglyLinkedListNode(data);
    if(llist == null)
    {
        p.next = llist;
        llist = p;
        return llist;
    }
    SinglyLinkedListNode temp = llist;
    if(position == 0)
    {
        p.next = llist;
        return p;
    }
    for(int i = 0 ; i< position - 1 ; i++)
    {
       temp = temp.next; 
    }
    p.next = temp.next;
    temp.next = p;
    return llist;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

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

        int data = Integer.parseInt(bufferedReader.readLine().trim());

        int position = Integer.parseInt(bufferedReader.readLine().trim());

        SinglyLinkedListNode llist_head = Result.insertNodeAtPosition(llist.head, data, position);

        SinglyLinkedListPrintHelper.printList(llist_head, " ", bufferedWriter);
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
