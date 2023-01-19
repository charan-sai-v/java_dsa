package stacks;

import java.util.Stack;

public class StackImpl {

    // Reverse String with stack
    public String reverseString(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> characterStack = new Stack<>();
        for (char ch: input.toCharArray()){
            characterStack.push(ch);
        }
        // StringBuffer is used in String manipulation
        StringBuffer stringBuffer = new StringBuffer();
        while(!characterStack.empty()){
            stringBuffer.append(characterStack.pop());
        }
        return stringBuffer.toString();
    }

    // isBalanced String
    public boolean isBalancedExpression(String input){
        if(input == null)
            throw new IllegalArgumentException();

        Stack<Character> characterStack = new Stack<>();

        for (char ch: input.toCharArray()){
            if (ch == '(' || ch == '<' || ch == '[' || ch == '{'){
                characterStack.push(ch);
            }

            if(ch == ')' || ch == '>' || ch == ']' || ch == '}'){
                if(characterStack.empty())
                    return false;
                Character top = characterStack.pop();
                if(ch == ']' && top != '[' || ch == '>' && top != '<' || ch == ')' && top != '(' || ch == '}' && top != '{')
                    return  false;
            }
        }
        return characterStack.empty();
    }


}
