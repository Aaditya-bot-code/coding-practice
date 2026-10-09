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

