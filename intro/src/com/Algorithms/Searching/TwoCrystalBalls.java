package com.Algorithms.Searching;

public class TwoCrystalBalls {
    public static void main(String[] args) {
        boolean[] arr = {false, false, false, false, false, false, false, false, true, true};
        int result = twoCrystalBalls(arr);
        System.out.println(result);
        System.out.println(twoCrystalBalls(new boolean[] {false, false, false, false, false, false, false, false, false, false}));
    }

    public static int twoCrystalBalls(boolean[] breaks) {
        if (breaks.length == 0) {
            return -1;
        }

        int squareRoot = (int)Math.sqrt(breaks.length);
        System.out.println(squareRoot);

        int i;
        for (i = 0; i < breaks.length; i += squareRoot) {
            if (breaks[i]) {
                break;
            }
        }

        i -= squareRoot;

        for (int j = 0; j < squareRoot && i < breaks.length; j++, i++) {
            if (breaks[j]) {
                return j;
            }
        }

        return -1;
    }
}
