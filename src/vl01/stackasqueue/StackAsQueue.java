package vl01.stackasqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackAsQueue<T>{

    private Queue<T> mainQueue;
    private final Queue<T> helpQueue;

    public StackAsQueue() {
        mainQueue = new LinkedList<>();
        helpQueue = new LinkedList<>();
    }

    public T pop() {
        return mainQueue.poll();
    }

    public void push(T t) {
        while (!mainQueue.isEmpty()){
            helpQueue.offer(mainQueue.poll());
        }
        mainQueue.offer(t);
        while (!helpQueue.isEmpty()) {
            mainQueue.offer(helpQueue.poll());
        }
    }

    @Override
    public String toString() {
        return mainQueue.toString();
    }
}
