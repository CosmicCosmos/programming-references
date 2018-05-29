package net.learning.programming.linkedlist;

/**
 * @author syarram
 * Created on : 5/29/18
 */
public class IsLinkedListCircular {

    public static void main (String args[]) {

        LinkedListNode head = new LinkedListNode(10);
        LinkedListNode first = new LinkedListNode(20);
        LinkedListNode second = new LinkedListNode(30);
        LinkedListNode third = new LinkedListNode(40);
        LinkedListNode fourth = new LinkedListNode(50);
        LinkedListNode fifth = new LinkedListNode(60);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
    }

    public boolean isLinkedListCircular(LinkedListNode linkedListNode) {

        LinkedListNode head = linkedListNode.next;


        //An Empty linked list is circular
        if(linkedListNode == null) {
            return false;
        }

        // Loop over the linked list, stop if the linked list is reached to end or
        // if the linked list is pointing to head.
        while (linkedListNode != null && linkedListNode != head) {
            linkedListNode = linkedListNode.next;
        }

        //if the loop stopped beacuse of ciruclar condition.
        return (head==linkedListNode);
    }
}
