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