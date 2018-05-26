package net.learning.programming.linkedlist;

/**
 * @author syarram
 * Created on : 5/25/18
 */


import java.util.Stack;

/**
 *  Solution 1 : Iterative the linked list and push the element into Stack (LIFO)
 *
 *  Solution 2 : Iterative the LL and point the current element to previous element
 *
 *  Solution 3 : Recursively
 *
 */
public class ReverseALinkedList {

  public static void main(String args[]) {
        LinkedListNode head = new LinkedListNode(10);
        LinkedListNode first = new LinkedListNode(20);
        LinkedListNode second = new LinkedListNode(30);
        LinkedListNode third = new LinkedListNode(40);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = null;

        //printLinkedList(head);
        //LinkedListNode reversed = reverseALinkedList(head);
       //printLinkedList(reversed);

       printReverseStack(usingStackApproach(head));

    }

    public static Stack<Integer> usingStackApproach(LinkedListNode node) {
        Stack<Integer> stack = new Stack<Integer>();
        LinkedListNode currentNode = node;
        while (currentNode != null) {
            stack.push(currentNode.value);
            currentNode=currentNode.next;
        }
        return stack;
    }


    public static void printReverseStack(Stack<Integer> stack){
      while (!stack.isEmpty()) {
         System.out.println(stack.pop());
        }
    }



    public static void printLinkedList(LinkedListNode node){
        LinkedListNode linkedListNode = node;
        while (linkedListNode != null) {
            System.out.println(linkedListNode.value);
            linkedListNode = linkedListNode.next;
        }
    }


    /**
     * Solution 2 : Iterative pass the linked list and point the previous node.
     * @param node
     * @return
     */
    public static LinkedListNode reverseALinkedList(LinkedListNode node) {

        LinkedListNode currentNode = node;
        LinkedListNode previousNode = null;
        LinkedListNode nextNode = null;

        while (currentNode != null) {
            // copy a pointer to the next element
            nextNode = currentNode.next;

            // reverse the 'next' pointer
            currentNode.next = previousNode;

            // step forward in the list
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}


