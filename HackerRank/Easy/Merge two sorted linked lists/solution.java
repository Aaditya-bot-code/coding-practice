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

