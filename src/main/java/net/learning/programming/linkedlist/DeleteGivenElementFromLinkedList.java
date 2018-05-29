package net.learning.programming.linkedlist;

/**
 * @author syarram
 * Created on : 5/26/18
 */
public class DeleteGivenElementFromLinkedList extends  LinkedListUtil {

    public static LinkedListNode removeElements(LinkedListNode head, int val) {
        if(head == null){
            return null;
        }
        while(head != null && head.value == val){
            head = head.next;
        }
        LinkedListNode curr = head;
        LinkedListNode prev = head;
        while(curr != null){
            if(curr.value != val){
                prev = curr;
                curr = curr.next;
            }else{
                prev.next = curr.next;
                curr = prev.next;
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
