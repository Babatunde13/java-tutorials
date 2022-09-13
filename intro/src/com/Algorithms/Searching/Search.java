package com.Algorithms.Searching;

public class Search {
    public int[] data;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Search linearSearch = new Search(arr);
        boolean exist = linearSearch.linearSearch(5);
        System.out.println(exist);
    }

    public Search(int[] data) {
        this.data = data;
    }

    public boolean linearSearch(int target) {
        if (this.data.length == 0) {
            return false;
        }
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean stringSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean stringSearch2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}
