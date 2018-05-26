package net.learning.programming.linkedlist;

/**
 * @author syarram
 * Created on : 5/25/18
 */

/**
 * Solution 1 : Using a two pointer approach
 * <p>
 * Solution 2 :
 */
public class MiddleOfLinkedList {


    private static LinkedListNode twoPointer(LinkedListNode linkedListNode) {
        LinkedListNode slowPointer = linkedListNode;

        LinkedListNode fastPointer = linkedListNode.next.next;

        while (slowPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer;
    }


    public static void main(String args[]){

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

        System.out.println(twoPointer(head).value);
    }


}

