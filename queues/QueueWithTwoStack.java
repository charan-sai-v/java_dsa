package queues;

import java.util.Arrays;
import java.util.Stack;


public class QueueWithTwoStack {
    // By using two stacks we can implement the Queue
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // O(1)
    public void enqueue(int item){
        stack1.push(item);
    }
    // O(n)
    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();

        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());

        return stack2.pop();
    }

    // O(n)
    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();

        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());

        return stack2.peek();
    }


    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }




}
