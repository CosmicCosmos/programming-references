package net.learning.programming.linkedlist;

/**
 * @author syarram
 * Created on : 5/26/18
 */
public class DeleteANodeFromLinkedList extends LinkedListUtil {

    public static LinkedListNode deleteANode(LinkedListNode head, int deletePosition) {

     LinkedListNode current = head;

     LinkedListNode previous = null;

     int count = 0;
       while (current != null) {
            if(count == deletePosition) {
                previous.next = current.next;
            }
           previous = current;
           current = current.next;
            count ++;
       }
      return head;

    }

    public static void main(String args[]) {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode first = new LinkedListNode(1);
        LinkedListNode second = new LinkedListNode(2);
        LinkedListNode third = new LinkedListNode(2);
        LinkedListNode fourth = new LinkedListNode(4);
        LinkedListNode fifth = new LinkedListNode(5);
        LinkedListNode sixth = new LinkedListNode(6);
        LinkedListNode seven = new LinkedListNode(7);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seven;

        LinkedListNode node = deleteANode(head, 4);

        printLinkedList(node);
    }


}
