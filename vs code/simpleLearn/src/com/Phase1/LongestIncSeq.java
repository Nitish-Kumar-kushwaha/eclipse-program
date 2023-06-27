package com.Phase1;
import java.util.*;

public class LongestIncSeq {

    public static List<Integer> findLongestIncSeq(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        int n = nums.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        int maxLength = 1;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }

            if (dp[i] > maxLength) {
                maxLength = dp[i];
                endIndex = i;
            }
        }

        List<Integer> longestSubsequence = new ArrayList<>();
        while (endIndex != -1) {
            longestSubsequence.add(0, nums[endIndex]);
            endIndex = prev[endIndex];
        }

        return longestSubsequence;
    }

    

}
