package com.Algorithms.Sorting;

public class MergeSort {
    int[] arr;

    public MergeSort(int[] data) {
        this.arr = data;
    }

    public void sort() {
        this.arr = this._mergeSort(this.arr);
    }

    public int[] _mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }
        _mergeSort(left);
        _mergeSort(right);

        int[] result = new int[arr.length];
        int leftIdx = 0;
        int rightIdx = 0;
        int resultIdx = 0;
        while (leftIdx < left.length && rightIdx < right.length) {
            if (left[leftIdx] <= right[rightIdx]) {
                result[resultIdx] = left[leftIdx];
                leftIdx++;
            } else {
                result[resultIdx] = right[rightIdx];
                rightIdx++;
            }
            resultIdx++;
        }

        while (leftIdx < left.length) {
            result[resultIdx] = left[leftIdx];
            leftIdx++;
            resultIdx++;
        }

        while (rightIdx < right.length) {
            result[resultIdx] = right[rightIdx];
            rightIdx++;
            resultIdx++;
        }

        return result;
    }
}
