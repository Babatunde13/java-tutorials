package com.DataStructures;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    
        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public DoubleLinkedList() {
        this.size = 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void add(int index, int value) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }

        Node current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node node = new Node(value);
        node.next = current.next;
        current.next = node;
        this.size++;
    }
}
