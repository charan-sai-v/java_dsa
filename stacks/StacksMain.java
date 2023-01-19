package stacks;

import java.util.Scanner;

public class StacksMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImpl stack = new StackImpl();

        // Revered String using Stack
//        System.out.print("Enter the String: ");
//        String s = sc.nextLine();
//
//        String output = stack.reverseString(s);
//        System.out.println(output);

        // Checking balanced Expression using Stack
//        String s1 = sc.nextLine();
//        Boolean output = stack.isBalancedExpression(s1);
//        System.out.println(output);


        // Stack Implementation
        Stack stack1 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack1);
        stack1.pop();
        System.out.println(stack1);
        System.out.println(stack1.peek());
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.isEmpty());
        stack1.pop();




    }
}
