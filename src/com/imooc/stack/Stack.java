package com.imooc.stack;

/**
 * Data-Structure
 * com.imooc.stack
 * Created by Zhang Chen
 * 2018/5/5
 */
public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();

}
