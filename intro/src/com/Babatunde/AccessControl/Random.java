package com.Babatunde.AccessControl;

public class Random {
    private int num;
    protected String name;
    int[] arr;
    public int x;

    public Random (int num, String name) {
        this.name = name;
        this.num = num;
        this.arr = new int[num];
    }

    public int getNum () {
        return this.num;
    }

    public void setNum (int num) {
        this.num = num;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int[] getArr () {
        return this.arr;
    }

    public void setArr (int[] arr) {
        this.arr = arr;
    }
}
