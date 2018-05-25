package com.imooc.linkedlist;

/**
 * data-structure
 * com.imooc.linkedlist
 * Created by Zhang Chen
 * 5/22/2018
 */
public class LinkedListWithDummyHead<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null);
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    private Node dummyHead;
    private int size;

    public LinkedListWithDummyHead() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public LinkedListWithDummyHead(E[] array) {
        assert(array.length > 0);
<<<<<<< HEAD
=======
        dummyHead = new Node(null, null);
>>>>>>> 88cfe9bd1fdb3110fd4ce3ae9ddba9aa3682f811
        Node current = new Node(array[0]);
        dummyHead.next = current;
        size = 1;
        for(int i = 1; i < array.length; i++) {
            current.next = new Node(array[i]);
            current = current.next;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, E e) {
        assert(index >= 0 && index <= size);
        Node pre = dummyHead;
        for(int i = 0; i < index; i++)
            pre = pre.next;
        pre.next = new Node(e, pre.next);
        size++;

    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

<<<<<<< HEAD
=======
    public E get(int index) {
        if(index < 0 || index >= size )
            throw new IllegalArgumentException("Get failed, Illegal index.");
        Node cur = dummyHead.next;
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    public void set(int index, E e) {
        if(index < 0 || index >= size )
            throw new IllegalArgumentException("Get failed, Illegal index.");
        Node cur = dummyHead.next;
        for(int i = 0; i < index; i++)
            cur = cur.next;
        cur.e = e;
    }

    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while(cur != null) {
            if(cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while(cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }

>>>>>>> 88cfe9bd1fdb3110fd4ce3ae9ddba9aa3682f811
}
