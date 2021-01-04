package com.dongyl.study.alg.queue;

/**
 *
 */
public class Queue<Item> {
    private Node first;
    private Node last;
    private int N;

    public class Node {
        private Item item;
        private Node next;

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return first == null || N == 0;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {

        Node tmp = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            tmp.next = last;
        }
        N++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }

}
