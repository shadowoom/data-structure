package com.imooc.stack;

import com.imooc.linkedlist.LinkedListWithDummyHead;

/**
 * data-structure-master
 * com.imooc.stack
 * Created by Zhang Chen
 * 5/25/2018
 */
public class LinkedListStack<E> implements Stack<E>{

    private LinkedListWithDummyHead<E> list;

    public LinkedListStack() {
        list = new LinkedListWithDummyHead<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(list);
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for(int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }


}
