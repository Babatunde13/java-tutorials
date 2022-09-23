package com.Algorithms.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 11, 5, 6, 1, 8, 4, 10};
        int[] result = bubbleSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println("**********");
        int[] result2 = bubbleSortOptimized(arr);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }
        System.out.println("**********");
        for (int i = 0; i < result2.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] bubbleSort(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        // copy the array
        int[] arr2 = arr.clone();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    arr2 = swap(arr2, j, j + 1);
                }
            }
        }

        return arr2;
    }

    public static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static int[] bubbleSortOptimized(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }

        int[] arr2 = arr.clone();

        for (int i = 0; i < arr2.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    arr2 = swap(arr2, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return arr2;
    }
}
