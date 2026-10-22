# Merge two sorted linked lists

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Merge two sorted linked lists](https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem)

## Problem Description

This challenge is part of a tutorial track by [MyCodeSchool](http://www.youtube.com/mycodeschool)

Given pointers to the heads of two sorted linked lists, merge them into a single, sorted linked list. Either head pointer may be null meaning that the corresponding list is empty.

**Example** **
 refers to

 refers to

The new list is

Function Description**

Complete the *mergeLists* function in the editor below.

*mergeLists* has the following parameters:

* *SinglyLinkedListNode pointer headA:* a reference to the head of a list

* *SinglyLinkedListNode pointer headB:* a reference to the head of a list

**Returns**

* *SinglyLinkedListNode pointer:* a reference to the head of the merged list

**Input Format**

The first line contains an integer , the number of test cases.

The format for each test case is as follows:

The first line contains an integer , the length of the first linked list. **
The next  lines contain an integer each, the elements of the linked list.

The next line contains an integer , the length of the second linked list.

The next  lines contain an integer each, the elements of the second linked list.

Constraints**

*

*

* , where  is the  element of the list.

**Sample Input**

```
1
3
1
2
3
2
3
4

```

**Sample Output**

```
1 2 3 3 4

```

**Explanation**

The first linked list is:

The second linked list is:

Hence, the merged linked list is:

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Merge two sorted linked lists
// Link: https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
// Difficulty: Easy
// Language: java8



    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode list1 = head1;
        SinglyLinkedListNode list2 = head2;
        SinglyLinkedListNode head = null;
        SinglyLinkedListNode tail = null;
        SinglyLinkedListNode selected;
        if(list1 == null)
        {
            return list2;
        }
        if(list2 == null)
        {
            return list1;
        }
        while(list1 != null && list2 != null)
        {
            if(list1.data > list2.data)
            {
                selected = list2;
                if(head == null && tail == null)
                {
                    head= selected;
                    tail = selected;
                }
                else{
                tail.next = selected;
                tail = tail.next;
                }
                list2 = list2.next;
            }
            else{
                selected = list1;
                if(head == null && tail == null)
                {
                    head = selected;
                    tail = selected;
                }
                else{
                tail.next = selected;
                tail= tail.next;
                }
                list1 = list1.next;

            }
        }
        
       if(list1 != null)
       {
            tail.next = list1;
       }
       else
       {
            tail.next = list2;
       }
       return head;

    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
