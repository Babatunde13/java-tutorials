package com.Algorithms.Searching;

public class Search {
    public int[] data;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Search linearSearch = new Search(arr);
        int exist = linearSearch.linearSearch(5);
        System.out.println(new Search(arr).binarySearch(4));
        System.out.println(exist);
    }

    public Search(int[] data) {
        this.data = data;
    }

    public int linearSearch(int target) {
        if (this.data.length == 0) {
            return -1;
        }
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int target) {
        if (this.data.length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = this.data.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (this.data[mid] == target) {
                return mid;
            } else if (this.data[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
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
