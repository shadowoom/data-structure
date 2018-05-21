package com.imooc.stack;

import java.util.Stack;
/**
 * Data-Structure
 * com.imooc.stack
 * Created by Zhang Chen
 * 2018/5/21
 */
public class CompleteParenthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if(s.charAt(i) == ')') {
                        char temp = stack.pop();
                        if (temp != '(')
                            return false;
                    } else if(s.charAt(i) == '}') {
                        char temp = stack.pop();
                        if(temp != '{')
                            return false;
                    } else {
                        char temp = stack.pop();
                        if(temp != '[')
                            return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

}
