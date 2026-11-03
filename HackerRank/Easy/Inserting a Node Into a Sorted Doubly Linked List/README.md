# Inserting a Node Into a Sorted Doubly Linked List

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Inserting a Node Into a Sorted Doubly Linked List](https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem)

## Problem Description

Given a reference to the head of a doubly-linked list and an integer, , create a new *DoublyLinkedListNode* object having data value  and insert it at the proper location to maintain the sort.

**Example**

 refers to the list  **

Return a reference to the new list: .

Function Description**

Complete the *sortedInsert* function in the editor below.

sortedInsert has two parameters:

*
*DoublyLinkedListNode pointer head*: a reference to the head of a doubly-linked list

*
*int data*: An integer denoting the value of the  field for the *DoublyLinkedListNode* you must insert into the list.

**Returns**

* *DoublyLinkedListNode pointer:* a reference to the head of the list

**Note:** Recall that an empty list (i.e., where ) and a list with one element *are* sorted lists.

**Input Format**

The first line contains an integer , the number of test cases.

Each of the test case is in the following format:

* The first line contains an integer , the number of elements in the linked list.

* Each of the next  lines contains an integer, the *data* for each node of the linked list.

* The last line contains an integer, , which needs to be inserted into the sorted doubly-linked list.

**Constraints**

*

*

*

**Sample Input**

```
STDIN   Function
-----   --------
1       t = 1
4       n = 4
1       node data values = 1, 3, 4, 10
3
4
10
5       data = 5

```

**Sample Output**

```
1 3 4 5 10

```

**Explanation**

The initial doubly linked list is:  .

The doubly linked list after insertion is:

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Inserting a Node Into a Sorted Doubly Linked List
// Link: https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
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

class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }
}

class DoublyLinkedListPrintHelper {
    public static void printList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
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
     * Complete the 'sortedInsert' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_DOUBLY_LINKED_LIST llist
     *  2. INTEGER data
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
    // Write your code here
    DoublyLinkedListNode newNode = new  DoublyLinkedListNode(data);
    if(llist == null)
    {
      return newNode;  
    }
    if(data < llist.data)
    {
        newNode.next = llist;
        llist.prev = newNode;
        return newNode;   
    }
    DoublyLinkedListNode temp = llist;
    while(temp.next != null && temp.next.data < data)
    {
        temp = temp.next;
    }
    if(temp.next == null)
    {
        temp.next = newNode;
        newNode.prev = temp;
    }
    else{
       newNode.next = temp.next;
       newNode.prev = temp;
       temp.next.prev = newNode;
       temp.next = newNode;
        
    }
    return llist;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                DoublyLinkedList llist = new DoublyLinkedList();

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

                DoublyLinkedListNode llist1 = Result.sortedInsert(llist.head, data);

                DoublyLinkedListPrintHelper.printList(llist1, " ", bufferedWriter);
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
