package vl01.queueasstack;

public class Main {

    //https://pastebin.com/ekZU9hFc 2992

    public static void main(String[] args) {

        QueueAsStack<Integer> queueAsStack = new QueueAsStack<Integer>();

        queueAsStack.enqueu(1);
        queueAsStack.enqueu(2);
        queueAsStack.enqueu(3);
        queueAsStack.enqueu(4);
        queueAsStack.enqueu(5);
        queueAsStack.enqueu(6);

        System.out.println("DEQUEUE: " + queueAsStack.dequeu());
        System.out.println("DEQUEUE: " + queueAsStack.dequeu());
        System.out.println("DEQUEUE: " + queueAsStack.dequeu());
        System.out.println("DEQUEUE: " + queueAsStack.dequeu());
        System.out.println("DEQUEUE: " + queueAsStack.dequeu());
        System.out.println("DEQUEUE: " + queueAsStack.dequeu());
    }

}
