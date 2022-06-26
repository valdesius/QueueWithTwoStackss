package valdes.com.company;

import java.util.Stack;

public class Queue<T> {

    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public Queue() {

    }

    void enQueue(T item) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(item);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    T deQueue() throws InterruptedException {
        if (stack1.isEmpty()) {
            throw new InterruptedException("Очередь пуста");
        }

        T item = stack1.peek();
        stack1.pop();
        return item;
    }
}
