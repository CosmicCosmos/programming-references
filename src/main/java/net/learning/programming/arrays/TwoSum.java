package net.learning.programming.arrays;

import java.util.HashMap;
import java.util.Map;

// LGTM

/**
 * Question:
 * Given an array of integers, find two numbers such that they add up to a specific target
 * number.  The function twoSum should return indices of the two numbers such that they add up to
 * the target, where index1 must be less than index2. Please note that your returned answers
 * (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * <p>
 * Solution:
 * O(n2) runtime, O(1) space – Brute force:
 * The brute force approach is simple. Loop through each element x and find if there is
 * another value that equals to target – x. As finding another value requires looping through
 * the rest of array, its runtime complexity is O(n2).
 * <p>
 * <p>
 * O(n) runtime, O(n) space – Hash table:
 * We could reduce the runtime complexity of looking up a value to O(1) using a hash map
 * that maps a value to its index.
 */

public class TwoSum {

    public static int[] twoSumHashMap(int a[], int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; i++) {

            if (map.containsKey(target - a[i])) {

                return new int[]{map.get(target - a[i]) + 1, i + 1}; //since i is staring from 0 let us add 1
            }

            map.put(a[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String args[]) {

        int[] k = twoSumHashMap(new int[]{1, 3, 5, 7, 9, 0}, 10);

        for (int i = 0; i < k.length; i++) {

            System.out.println(k[i]);
        }

    }

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
