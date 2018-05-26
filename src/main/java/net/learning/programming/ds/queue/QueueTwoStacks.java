package net.learning.programming.ds.queue;

import org.testng.annotations.Test;

import java.util.Stack;

/**
 * @author syarram
 * Created on : 5/8/18
 */
public class QueueTwoStacks {

    private Stack<Integer> enqueueStack = new Stack<>();

    private Stack<Integer> dequeueStack = new Stack<>();


    private void enqueue(int item){
        enqueueStack.push(item);
    }


    private void dequeue(){
        if(this.dequeueStack.isEmpty()) {
            while(!enqueueStack.isEmpty()) {
                int item = enqueueStack.pop();
                dequeueStack.push(item);
            }

            if(dequeueStack.isEmpty()) {
                throw new IllegalArgumentException("Stack is empty");
            }
        }
        dequeueStack.pop();
    }

    private void printQueue(){
      if(!dequeueStack.isEmpty()) {
            Object[] stackItems = dequeueStack.toArray();
            for(int i=stackItems.length-1; i>=0; i--) {
                 System.out.println(stackItems[i].toString());
            }
        }

        if(!enqueueStack.isEmpty()) {
            Object[] stackItems = enqueueStack.toArray();
            for (Object item : stackItems) {
                System.out.println(item.toString());
            }
        }
    }



    @Test
    public void testStack(){

        QueueTwoStacks queueTwoStacks = new QueueTwoStacks();
        queueTwoStacks.enqueue(10);
        queueTwoStacks.enqueue(20);
        queueTwoStacks.enqueue(30);
        queueTwoStacks.dequeue();
        queueTwoStacks.enqueue(40);
        queueTwoStacks.enqueue(50);
        queueTwoStacks.dequeue();
        queueTwoStacks.enqueue(60);
        queueTwoStacks.printQueue();
    }
}
