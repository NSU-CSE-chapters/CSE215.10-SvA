package com.cse215;

public class Queue {
    int[] elements;
    int size;


    // unsolved


    public Queue() {
        elements = new int[8];

    }

    public void enqueue(int v) {

    }

    public void dequeue() {


    }

    public boolean empty() {
        if (elements.length == 0) {
            return true;
        }

        return false;
    }

    public int getSize() {
        return elements.length;
    }

}
