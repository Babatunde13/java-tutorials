package com.DataStructures;

public class DoublyLinkedStack<T> {
    public int length;
    private GenericNode<T> head;
    private GenericNode<T> tail;

    public DoublyLinkedStack() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public DoublyLinkedStack(T head) {
        this.length = 1;
        this.head = new GenericNode<T>(head);
        this.tail = this.head;
    }

    public void push(T item) {
        if (this.length == 0) {
            this.head = new GenericNode<T>(item);
            this.tail = this.head;
        } else {
            GenericNode<T> newNode = new GenericNode<T>(item);
            this.tail = newNode;
        }
        this.length++;
    }

    public T pop() {
        if (this.head == null) {
            return null;
        }
        this.length--;
        T value = this.tail.value;
        GenericNode<T> current = this.head;
        while (current.next != this.tail) {
            current = current.next;
        }
        current.next = null;
        this.tail = current;
        return value;
    }

    public T peek() {
        if (this.tail == null) {
            return null;
        }
        return this.tail.value;
    }
}
