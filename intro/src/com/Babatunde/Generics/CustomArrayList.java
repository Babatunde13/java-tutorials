package com.Babatunde.Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
        this.size = 0;
    }

    public CustomArrayList(int size) {
        this.data = new int[size];
        this.size = 0;
    }

    public void add(int value) {
        if (this.isFull()) {
            this.resize();
        }
        this.data[this.size++] = value;
    }

    private void resize() {
        int[] newData = new int[this.data.length * 2];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }

        this.data = newData;
    }

    private boolean isFull() {
        return this.size == this.data.length;
    }

    public int get(int index) {
        this.isValidIndex(index);
        return this.data[index];
    }

    public void set(int index, int value) {
        this.data[index] = value;
    }

    public int size() {
        return this.size;
    }

    public int[] getData() {
        return this.data;
    }

    public void clear () {
        this.data = new int[DEFAULT_SIZE];
        this.size = 0;
    }

    public int remove(int index) {
        int value = this.get(index);
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
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        customArrayList.add(4);

        System.out.println(customArrayList);
    }
}
