package com.imooc.queue;

/**
 * Data-Structure
 * com.imooc.queue
 * Created by Zhang Chen
 * 2018/5/21
 */
public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();

    int getCapacity();

}
