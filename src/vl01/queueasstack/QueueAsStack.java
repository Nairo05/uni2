package vl01.queueasstack;

import java.util.Stack;

public class QueueAsStack<T> {

    private Stack<T> mainStack;
    private final Stack<T> helpStack;

    public QueueAsStack() {
        mainStack = new Stack<>();
        helpStack = new Stack<>();
    }

    //O(n) = 2n+1
    public void enqueu(T t) {
        while (!mainStack.isEmpty()){
            helpStack.push(mainStack.pop());
        }

        mainStack.push(t);

        while (!helpStack.isEmpty()) {
            mainStack.push(helpStack.pop());
        }
    }

    //O(n) = 1
    public T dequeu() {
        return mainStack.pop();
    }

    //O(n) = 1
    public void makeNull() {
        mainStack = new Stack<>();
    }

    @Override
    public String toString() {
        return mainStack.toString();
    }
}
