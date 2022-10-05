package com.DataStructures;

public class GenericNode<T> {
    public T value;
    public GenericNode<T> next;

    public GenericNode(T value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
