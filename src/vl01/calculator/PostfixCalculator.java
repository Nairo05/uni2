package vl01.calculator;

import java.util.Scanner;
import java.util.Stack;

public class PostfixCalculator {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        s = s.replaceAll(" ", "");

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {

                String sub = s.substring(i,i+1);
                int temp = Integer.parseInt(sub);

                stack.push(temp);
            } else {
                stack.push(calculate(stack.pop(), stack.pop(), s.charAt(i)));
            }
        }

        System.out.println(stack.pop());
    }

    private static int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            case '^':
                return (int) Math.pow(a,b);
        }
        return -1;
    }
}
