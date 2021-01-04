package com.dongyl.study.alg.bag;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author dongyl-work
 * @date 2021/1/4 下午3:59
 **/
public class Bag<Item> implements Iterable<Item> {
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

    public void add(Item item) {
        Node tmp = first;
        first = new Node();
        first.item = item;
        first.next = tmp;
        N++;
    }

    public Item remove() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super Item> action) {

        }
    }
}
