package com.imooc.array;

import java.util.NoSuchElementException;

public class Array<T> {

    private T[] data;
    private int size;

    public Array(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    // constructor, pass in the capacity to construct the array
    public Array() {
        data = (T[]) new Object[1];
        size = 0;
    }

    // get the number of elements
    public int getSize() {
        return size;
    }

    // get the capacity of the array
    public int getCapacity() {
        return data.length;
    }

    // check whether the array is empty
    public boolean isEmpty() {
        return size == 0;
    }


    // insert a new element at a given index
    public void add(int index, T e) {
        if(index > size || index < 0)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size");
        if(size == data.length)
            resize(size * 2);
        for(int i = size - 1; i >= index; i--)
            data[i+1] = data[i];
        data[index] = e;
        size++;
    }

    // insert a new element at last
    public void addLast(T e) {
        add(size, e);
    }

    // insert a new element in the front
    public void addFirst(T e) {
        add(0, e);
    }

    // obtain the element at a specific index
    public T get(int index) {
        if(index >= size || index < 0)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index < size");
        return data[index];
    }

    public T getLast() {
        return get(size - 1);
    }

    public T getFirst() {
        return get(0);
    }

    // modify the element at a specific index
    public void set(int index, T e) {
        if(index >= size || index < 0)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index < size");
        data[index] = e;
    }

    // search whether an element is in the array
    public boolean contains(T e){
        for(int i = 0; i < size; i++) {
            if(data[i].equals(e))
                return true;
        }
        return false;
    }

    // search the specific index of an element
    public int find(T e){
        for(int i = 0; i < size; i++) {
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    // remove an element from a specific index
    public T remove(int index) {
        if(isEmpty())
            throw new NoSuchElementException("com.imooc.array.Array is empty");
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Require index >= 0 and index < size");
        T ret = data[index];
        for(int i = index + 1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        data[size] = null;

        if(size == data.length / 4 && data.length / 2 != 0)
            resize(data.length / 2);
        return ret;
    }

    // remove the element at the first index
    public T removeFirst(){
        return remove(0);
    }

    // remove the element at the last index
    public T removeLast(){
        return remove(size-1);
    }

    // remove the first occurrence of an element
    public boolean removeElement(T e){
        int index = find(e);
        if(index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    // remove all occurrences of an element
    public boolean removeAllElement(T e){
        int index = 0;
        boolean flag = false;
        while(index != -1) {
            index = getIndexFromSubArray(index, e);
            if(index != -1) {
                remove(index);
                flag = true;
            }
        }
        return flag;
    }

    private int getIndexFromSubArray(int index, T e) {
        for(int i = index; i < size; i++)
            if(data[i].equals(e))
                return i;
        return -1;
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0; i < size; i++) {
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append("]");
        return res.toString();
    }

    private void resize(int capacity) {
        T[] temp = (T[]) new Object[capacity];
        for(int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

}
