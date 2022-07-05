package vl01.stackasqueue;

public class Main {

    //https://pastebin.com/UqVkAiLt 2992

    public static void main(String[] args) {

        StackAsQueue<Integer> stack = new StackAsQueue<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
