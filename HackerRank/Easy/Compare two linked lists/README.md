# Compare two linked lists

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Compare two linked lists](https://www.hackerrank.com/challenges/compare-two-linked-lists/problem)

## Problem Description

This challenge is part of a tutorial track by [MyCodeSchool](http://www.youtube.com/mycodeschool)

You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to check if they are equal. If all data attributes are equal and the lists are the same length, return .  Otherwise, return .

**Example**

 **

The two lists have equal data attributes for the first  nodes.   is longer, though, so the lists are not equal.  Return .

Function Description**

Complete the *compare_lists* function in the editor below.

*compare_lists* has the following parameters:

* *SinglyLinkedListNode llist1:* a reference to the head of a list

* *SinglyLinkedListNode llist2:* a reference to the head of a list

**Returns**

* *int:* return 1 if the lists are equal, or 0 otherwise

**Input Format**

The first line contains an integer , the number of test cases.

Each of the test cases has the following format: **
The first line contains an integer , the number of nodes in the first linked list.

Each of the next  lines contains an integer, each a value for a data attribute.

The next line contains an integer , the number of nodes in the second linked list.

Each of the next  lines contains an integer, each a value for a data attribute.

Constraints**

*

*

*

**Output Format**

Compare the two linked lists and `return` 1 if the lists are equal. Otherwise, `return` 0. Do NOT print anything to stdout/console.

The output is handled by the code in the editor and it is as follows:

For each test case, in a new line, print  if the two lists are equal, else print .

**Sample Input**

```
2
2
1
2
1
1
2
1
2
2
1
2

```

**Sample Output**

```
0
1

```

**Explanation**

There are  test cases, each with a pair of linked lists.

*
In the first case, linked lists are: 1 -> 2 -> NULL and 1 -> NULL

*
In the second case, linked lists are: 1 -> 2 -> NULL and 1 -> 2 -> NULL

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Compare two linked lists
// Link: https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
// Difficulty: Easy
// Language: java8



    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while(head1 != null && head2 != null)
        {
            if(head1.data != head2.data)
            {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1 == null && head2 == null)
        {
            return true;
        }
        return false;

    }


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
