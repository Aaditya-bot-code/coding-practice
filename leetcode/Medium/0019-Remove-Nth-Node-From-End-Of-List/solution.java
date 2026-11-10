// LeetCode Problem: Remove Nth Node From End of List
// Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head == null || n<= 0)
       {
        return null;
       } 
       ListNode dummy = new ListNode(0);
       dummy.next = head;
       ListNode fast = dummy;
       ListNode slow = dummy;
       for(int i = 0 ; i < n ; i++)
       {
            if(fast.next == null)
            {
                return head;
            }
            fast = fast.next;
       }
       while(fast.next != null)
       {
            fast = fast.next;
            slow = slow.next;
       }
       slow.next = slow.next.next;
       return dummy.next;
    }
}