# Insert a node at the head of a linked list

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Insert a node at the head of a linked list](https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem)

## Problem Description

This challenge is part of a tutorial track by [MyCodeSchool](http://www.youtube.com/mycodeschool) and is accompanied by a video lesson.

Given a pointer to the head of a linked list, insert a new node before the head.  The  value in the new node should point to  and the  value should be replaced with a given value.  Return a reference to the new head of the list. The head pointer given may be null meaning that the initial list is empty.

**Function Description**

Complete the function  with the following parameter(s):

* : a reference to the head of a list

* : the value to insert in the  field of the new node

**Input Format**

The first line contains an integer , the number of elements to be inserted at the head of the list. **
The next  lines contain an integer each, the elements to be inserted, one per function call.

Constraints**

*

*

**Sample Input**

```
STDIN   Function
-----   --------
5       n = 5
383     data items to insert 383 ... 321
484
392
975
321

```

**Sample Output**

```
321
975
392
484
383

```

**Explanation**

Intially the list in NULL.
After inserting 383, the list is 383 -> NULL.

After inserting 484, the list is 484 -> 383 -> NULL.

After inserting 392, the list is 392 -> 484 -> 383 -> NULL.

After inserting 975, the list is 975 -> 392 -> 484 -> 383 -> NULL.

After inserting 321, the list is 321 -> 975 -> 392 -> 484 -> 383 -> NULL.

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Insert a node at the head of a linked list
// Link: https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem
// Difficulty: Easy
// Language: java8



    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode p = new SinglyLinkedListNode(data);
        if( llist== null )
        {
          llist = p;  
        }
        else{
            p.next= llist ;
            llist = p;
            
        }
        return llist;


    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
