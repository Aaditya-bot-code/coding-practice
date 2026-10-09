# Insert a Node at the Tail of a Linked List

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Insert a Node at the Tail of a Linked List](https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem)

## Problem Description

This challenge is part of a tutorial track by [MyCodeSchool](http://www.youtube.com/mycodeschool) and is accompanied by a video lesson.

You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the initial list is empty.

**Function Description**

Complete the  function with the following parameters:

* : a reference to the head of a list

* : the data value for the node to insert

**Returns**

* : reference to the head of the modified linked list

**Input Format**

The first line contains an integer , the number of elements in the linked list. **
The next  lines contain an integer each, the value that needs to be inserted at tail.

Constraints**

*

*

**Sample Input**

```
STDIN   Function
-----   --------
5       size of linked list n = 5
141     linked list data values 141..474
302
164
530
474

```

**Sample Output**

```
141
302
164
530
474

```

**Explanation**

First the linked list is NULL. After inserting 141, the list is 141 -> NULL.

After inserting 302, the list is 141 -> 302 -> NULL.

After inserting 164, the list is 141 -> 302 -> 164 -> NULL.

After inserting 530, the list is 141 -> 302 -> 164 -> 530 -> NULL.
After inserting 474, the list is 141 -> 302 -> 164 -> 530 -> 474 -> NULL, which is the final list.

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Insert a Node at the Tail of a Linked List
// Link: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
// Difficulty: Easy
// Language: java8



    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode p = new SinglyLinkedListNode( data);
        if( temp == null)
        {
            p.next = temp ;
            temp = p; 
            return temp ;
        }
        while(temp.next != null)
        {
            temp = temp .next;
        }
        p.next = temp.next;
        temp.next = p;
        return head;


    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
