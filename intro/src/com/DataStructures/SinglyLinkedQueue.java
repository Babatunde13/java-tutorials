package com.DataStructures;

public class SinglyLinkedQueue<T> {
    public int length;
    private GenericNode<T> head;

    public SinglyLinkedQueue() {
        this.length = 0;
        this.head = null;
    }

    public SinglyLinkedQueue(T head) {
        this.length = 1;
        this.head = new GenericNode<T>(head);
    }

    public void enqueue(T item) {
        if (this.length == 0) {
            this.head = new GenericNode<T>(item);
        } else {
            GenericNode<T> newNode = new GenericNode<T>(item);
            GenericNode<T> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
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
        return null;
    }
}
