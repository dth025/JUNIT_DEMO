package com.example;

public class Main {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // Branch 1: null or empty array
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) { // Loop
            if (arr[i] > max) { // Branch 2: update max
                max = arr[i];
            }
            // Branch 3: no update
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        System.out.println("Max: " + findMax(arr));
    }
}