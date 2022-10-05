package com.DataStructures;

public class DoublyLinkedQueue<T> {
    public int length;
    private GenericNode<T> head;
    private GenericNode<T> tail;

    public DoublyLinkedQueue() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public DoublyLinkedQueue(T head) {
        this.length = 1;
        this.head = new GenericNode<T>(head);
        this.tail = this.head;
    }

    public void enqueue(T item) {
        if (this.length == 0) {
            this.head = new GenericNode<T>(item);
            this.tail = this.head;
        } else {
            GenericNode<T> newNode = new GenericNode<T>(item);
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public T dequeue() {
        if (this.head == null) {
            return null;
        }
        this.length--;
        T value = this.head.value;
        this.head = this.head.next;
        return value;
    }

    public T peek() {
        if (this.head == null) {
            return null;
        }
        return this.head.value;
    }
}
