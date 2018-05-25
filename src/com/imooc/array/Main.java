package com.imooc.array;

public class Main {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        for(int i = 0; i < 10; i++)
            arr.addLast(i);
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        arr.addFirst(-1);
        System.out.println(arr);
        //[-1, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr.remove(2);
        System.out.println(arr);
        //[-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr.removeElement(4);
        System.out.println(arr);
        //[-1, 0, 1, 2, 3, 5, 6, 7, 8, 9]

        arr.removeFirst();
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);

        arr.addLast(8888);
        arr.addFirst(8888);
        arr.add(2,8888);
        arr.add(3,8888);
        arr.add(4,8888);
        arr.add(5,8888);
        arr.add(10,8888);
        arr.add(11,8888);
        System.out.println(arr);
        arr.removeElement(8888);
        System.out.println(arr);
        arr.removeAllElement(8888);
        System.out.println(arr);
        //[0, 1, 2, 3, 5, 6, 7, 8]
        arr.removeLast();
        System.out.println(arr);
        //[0, 1, 2, 3, 5, 6, 7]
        arr.removeLast();
        System.out.println(arr);
        //[0, 1, 2, 3, 5, 6]
        arr.removeLast();
        System.out.println(arr);
        //[0, 1, 2, 3, 5]
        arr.removeLast();
        System.out.println(arr);
        //[0, 1, 2, 3]
        arr.removeLast();
        System.out.println(arr);
        //[0, 1, 2]
        arr.removeLast();
        System.out.println(arr);
        //[0, 1]
        arr.removeLast();
        System.out.println(arr);
        //[0]
        arr.removeLast();
        System.out.println(arr);
        //[]
        arr.removeLast();
    }
}