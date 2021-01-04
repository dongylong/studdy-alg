package com.dongyl.study.alg.stack;

public class Stack<Item> {
    private Node first;
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

    public void push(Item item) {
        //first 放tmp
        Node tmp = first;
        first = new Node();
        first.item = item;
        first.next = tmp;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
