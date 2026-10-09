// HackerRank Problem: Print the Elements of a Linked List
// Link: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
// Difficulty: Easy
// Language: java8



    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        //SinglyLinkedListNode temp = head;
    if( head == null){
        System.out.println("no element");
    }

    while(head!= null)
    {
        System.out.println(head.data);
        head= head.next;
    

    }
    }

