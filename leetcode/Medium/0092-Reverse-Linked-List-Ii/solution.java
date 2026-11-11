// LeetCode Problem: Reverse Linked List II
// Link: https://leetcode.com/problems/reverse-linked-list-ii/
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 0 ; i < left - 1 ;i++)
        {
            prev = prev.next;
        }
        ListNode before = null;
        ListNode current = prev.next;
        ListNode leftNode = prev.next;
        for(int i = left ; i <= right ; i++)
        {
            ListNode next = current.next;
            current.next= before;
            before = current;
            current = next;
        }
        leftNode.next = current;
        prev.next = before;
        return dummy.next;
    }
}