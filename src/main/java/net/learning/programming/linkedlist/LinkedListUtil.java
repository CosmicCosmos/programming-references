package net.learning.programming.linkedlist;

/**
 * @author syarram
 * Created on : 5/26/18
 */
public class LinkedListUtil {

    public static void printLinkedList (LinkedListNode node){
        LinkedListNode linkedListNode = node;
        while (linkedListNode != null) {
            System.out.println(linkedListNode.value);
            linkedListNode = linkedListNode.next;
        }
    }
}
