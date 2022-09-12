package com.DataStructures;

public class Main {
    public static void main(String[] args) {
        Node node = new Node();
        node.value = 1;
        node.next = new Node();
        node.next.value = 2;
        node.next.next = new Node();
        node.next.next.value = 3;
        System.out.println(node.value);
        System.out.println(node.next);
        System.out.println(node.next.next);

    }
}
