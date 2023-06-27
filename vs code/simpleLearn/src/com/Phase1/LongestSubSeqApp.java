package com.Phase1;

import java.util.*;
import java.lang.*;

public class LongestSubSeqApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entre the Array ");
        System.out.println("entre the size of Array: ");
        int size = sc.nextInt();
        // System.out.println("for 100 arrays");
        int[] nums = new int[size];
        // int  nums[] = {785, 302, 515, 936, 260, 897, 631, 463, 711, 346, 828, 148, 673, 123, 684, 759, 873, 404, 605, 216, 431, 659, 930, 266, 570, 972, 253, 204, 429, 502, 108, 646, 933, 170, 679, 278, 609, 490, 598, 397, 413, 853, 388, 308, 535, 495, 619, 831, 152, 248, 377, 82, 698, 91, 907, 355, 411, 810, 584, 113, 430, 342, 542, 70, 209, 546, 683, 858, 575, 519, 629, 912, 124, 632, 147, 850, 685, 665, 769, 746, 381, 781, 56, 161, 751, 787, 873, 498, 499, 648, 674, 854, 825, 131, 890, 712, 905, 137, 327, 797, 743, 428, 447};

        System.out.println("Entre the elements of array: ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("entered Array : " + Arrays.toString(nums));

        LongestIncSeq l = new LongestIncSeq();
        List<Integer> longestSubSeq = l.findLongestIncSeq(nums);

        System.out.println("longest Subsequence is : ");

        for (Integer a : longestSubSeq) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
