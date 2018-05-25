package com.imooc.linkedlist;

/**
 * data-structure-master
 * com.imooc.linkedlist
 * Created by Zhang Chen
 * 5/25/2018
 */
public class Main {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1000,2000,3000};

        System.out.println("Linked list with dummy head-----------------------------------------------------");

        LinkedListWithDummyHead<Integer> linkedListWithDummyHeadArgs = new LinkedListWithDummyHead<>(arr);
        System.out.println(linkedListWithDummyHeadArgs);
        LinkedListWithDummyHead<Integer> linkedListWithDummyHead = new LinkedListWithDummyHead<>();
        for(int i = 0; i < 5; i++) {
            linkedListWithDummyHead.addFirst(i);
            System.out.println(linkedListWithDummyHead);
        }
        linkedListWithDummyHead.add(2, 666);
        System.out.println(linkedListWithDummyHead);

        linkedListWithDummyHead.remove(2);
        System.out.println(linkedListWithDummyHead);
        linkedListWithDummyHead.removeFirst();
        System.out.println(linkedListWithDummyHead);
        linkedListWithDummyHead.removeLast();
        System.out.println(linkedListWithDummyHead);

        System.out.println();

        System.out.println("Linked list without dummy head-----------------------------------------------------");

        LinkedList<Integer> linkedListArgs = new LinkedList<>(arr);
        System.out.println(linkedListArgs);

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        for(int i = 0; i < 5; i++) {
            linkedList1.addFirst(i);
            System.out.println(linkedList1);
        }
        linkedList1.add(2, 666);
        System.out.println(linkedList1);

        linkedList1.remove(2);
        System.out.println(linkedList1);

        linkedList1.removeFirst();
        System.out.println(linkedList1);
        linkedList1.removeLast();
        System.out.println(linkedList1);

    }

}
