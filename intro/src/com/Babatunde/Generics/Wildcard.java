package com.Babatunde.Generics;

import java.util.Arrays;

public class Wildcard<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public Wildcard() {
        this.data = new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public Wildcard(int size) {
        this.data = new Object[size];
        this.size = 0;
    }

    public void add(T value) {
        if (this.isFull()) {
            this.resize();
        }
        this.data[this.size++] = value;
    }

    private void resize() {
        Object[] newData = new Object[this.data.length * 2];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    private boolean isFull() {
        return this.size == this.data.length;
    }

    public T get(int index) {
        this.isValidIndex(index);
        return (T)this.data[index];
    }

    public void set(int index, T value) {
        this.data[index] = value;
    }

    public int size() {
        return this.size;
    }

    public T[] getData() {
        return (T[])this.data;
    }

    public void clear () {
        this.data = new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public T remove(int index) {
        T value = this.get(index);
        this.isValidIndex(index);
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.size--;
        return value;
    }

    private void isValidIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
    }

    public String toString () {
        return "CustomArrayList {data=" + Arrays.toString(this.data) + ", size=" + this.size + "}";
    }

    public static void main(String[] args) {
        Wildcard<Integer> wildCard = new Wildcard<Integer>();
        wildCard.add(1);
        wildCard.add(2);
        wildCard.add(3);
        wildCard.add(4);
        // wildCard.add("4");
        System.out.println(wildCard);

        // Wildcard<String> wildCard2 = new Wildcard<String>();
    }
}
