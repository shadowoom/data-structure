package com.imooc.linkedlist;

/**
 * data-structure
 * com.imooc.linkedlist
 * Created by Zhang Chen
 * 5/22/2018
 */
public class LinkedList<E> {

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

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public LinkedList(E[] array) {
        assert(array.length > 0);
        Node head = new Node(array[0]);
        if(array.length == 1) {
            size = 1;
            return;
        }
        Node current = new Node(array[1]);
        head.next = current;
        size = 2;
        for(int i = 2; i < array.length; i++) {
            Node next = new Node(array[i]);
            current.next = next;
            current = next;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
        head = new Node(e, head);
        size++;
    }

    public void addLast(E e) {
        Node current = head;
        while(current.next != null)
            current = current.next;
        Node newNode = new Node(e);
        current.next = newNode;
        size++;
//         // another way of implementation
//        add(size, e);
    }

    public void add(int index, E e) {
        assert(index >= 0 && index <= size);
        if(index == 0) {
            addFirst(e);
        } else {
            Node pre = head;
            for(int i = 1; i < index; i++)
                pre = pre.next;
            pre.next = new Node(e, pre.next);
            size++;
        }
    }

<<<<<<< HEAD

=======
    public E get(int index) {
        if(index < 0 || index >= size )
            throw new IllegalArgumentException("Get failed, Illegal index.");
        Node cur = head;
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
        Node cur = head;
        for(int i = 0; i < index; i++)
            cur = cur.next;
        cur.e = e;
    }

    public boolean contains(E e) {
        Node cur = head;
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
        Node cur = head;
        while(cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
>>>>>>> 88cfe9bd1fdb3110fd4ce3ae9ddba9aa3682f811

}
