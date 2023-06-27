package com.Dsa;

import java.lang.reflect.Array;
import java.lang.*;
import java.util.*;

public class Bubblesort {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 10, 99, 25 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
