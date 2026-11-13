# Remove Duplicates from Sorted List II

**Difficulty:** Medium  
**Topics:** Linked List, Two Pointers  
**LeetCode URL:** [Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)

## Problem Description

<p>You are given the <code>head</code> of a <strong>sorted</strong> linked list.</p>

<p>Delete all nodes that have <strong>duplicate</strong> numbers, leaving only <strong>distinct</strong> numbers from the original list.</p>

<p>Return the linked list <strong>sorted</strong> as well.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/04/linkedlist1.jpg" style="width: 500px; height: 142px;" />
<pre>
<strong>Input:</strong> head = [1,2,3,3,4,4,5]
<strong>Output:</strong> [1,2,5]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/04/linkedlist2.jpg" style="width: 500px; height: 205px;" />
<pre>
<strong>Input:</strong> head = [1,1,1,2,3]
<strong>Output:</strong> [2,3]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is in the range <code>[0, 300]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
	<li>The list is guaranteed to be <strong>sorted</strong> in ascending order.</li>
</ul>

## Solution

```java
// LeetCode Problem: Remove Duplicates from Sorted List II
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
// Difficulty: Medium
// Language: java

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;

        while(current != null){
            if(current.next != null && current.val == current.next.val){
                while(current.next != null && current.val == current.next.val){
                    current = current.next;
                }
                current = current.next;
                prev.next = current;
            }else{
                prev = prev.next;
                current = current.next;
            }
        }
        return dummy.next;
   }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
