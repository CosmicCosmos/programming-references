package net.learning.programming.linkedlist;

/**
 * @author syarram
 * Created on : 5/26/18
 */
public class DeleteGivenElementFromLinkedList extends  LinkedListUtil {

    public static LinkedListNode removeElements(LinkedListNode head, int val) {
        LinkedListNode previous = head;
        LinkedListNode current = head.next;
        while(current != null) {
            if(current.value==val){
                previous.next = current.next;
                current = current.next;
            }
            else {
                previous = current;
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String args[]){
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

        LinkedListNode node = removeElements(head, 2);
        printLinkedList(node);
    }
}
