package com.DataStructures;

public class SingleLinkedList {
    private Node head;
    private int size;

    private class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    
        @Override
        public String toString() {
            return "Node{ " +
                    "value= " + value +
                    ", next= " + next +
                    " }";
        }
    }

    public SingleLinkedList() {
        this.size = 0;
    }

    public void addFirst(int value) {
        this.add(value, 0);
    }

    public void addLast(int value) {
        this.add(value, this.size + 1);
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
