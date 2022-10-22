package com.Algorithms.Sorting;

public class QuickSort {
    int[] arr;

    public static void main(String[] args) {
        // create new class with array
        QuickSort qs = new QuickSort(new int[]{1, 2, 3, 11, 5, 6, 1, 8, 4, 10});

        for (int i = 0; i < qs.arr.length; i++) {
            System.out.println(qs.arr[i]);
        }
        System.out.println("**********");
        qs.sort();
        for (int i = 0; i < qs.arr.length; i++) {
            System.out.println(qs.arr[i]);
        }
    }

    public QuickSort(int[] data) {
        this.arr = data;
    }

    public void sort() {
        this.arr = this._quickSort(this.arr);
    }

    private int[] _quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int pivot = arr[0];
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= pivot) {
                left[i] = arr[i];
            } else {
                right[i] = arr[i];
            }
        }

        int[] leftSorted = _quickSort(left);
        int[] rightSorted = _quickSort(right);

        int[] result = new int[arr.length];
        for (int i = 0; i < leftSorted.length; i++) {
            result[i] = leftSorted[i];
        }

        result[leftSorted.length] = pivot;
        for (int i = 0; i < rightSorted.length; i++) {
            result[i + leftSorted.length + 1] = rightSorted[i];
        }

        return result;
    }
}
