package vl01.calculator;

import java.util.Scanner;
import java.util.Stack;

public class InfixCalculator {

    //https://pastebin.com/J3AUcTsC 2992

    public static void main(String[] args) {

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        s = s.replaceAll(" ", "");

        //fill Stacks
        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                int push = Integer.parseInt(s.substring(i, i + 1));
                operands.push(push);

            } else {

                if (operators.isEmpty()) {

                    operators.push(s.charAt(i));

                } else {
                    //handle ( )
                    if (s.charAt(i) == '(') {
                        operators.push('(');
                    } else if (s.charAt(i) == ')') {
                        while (operators.peek() != '(') {
                            int output = calculate(operands.pop(), operands.pop(), operators.pop());
                            operands.push(output);
                        }
                        operators.pop();
                        //handle priorities 1. */ 2. +-
                    } else {
                        while (!operators.isEmpty() && getPriority(s.charAt(i)) <= getPriority(operators.peek())) {
                            int output = calculate(operands.pop(), operands.pop(), operators.pop());
                            operands.push(output);
                        }
                        operators.push(s.charAt(i));
                    }
                }

            }
        }


        //calculate expression without () and priorities
        while (!operands.isEmpty()) {
            int a = operands.pop();
            int b = -1;

            if (operands.isEmpty()) {
                operands.push(a);
                break;
            } else {
                b = operands.pop();
            }

            char operator = operators.pop();

            operands.push(calculate(a, b, operator));
        }

        System.out.println(operands.pop());
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

    private static int getPriority(char c) {
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
