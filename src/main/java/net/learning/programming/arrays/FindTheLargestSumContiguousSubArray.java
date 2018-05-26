package net.learning.programming.arrays;

/**
 * Problem : Given an array of positive and negative integers s,
 * find a contiguous subarray whose sum (sum of elements) is maximized.
 */

//TODO Understadning

public class FindTheLargestSumContiguousSubArray {


    public static void main(String[] args) {

        int [] arr = {1,-2,3,4,-4,5,6,-14,8,2};

        System.out.println(maxSubArraySum(arr));
    }

    public static int maxSubArraySum(int[] arr){

        int maxSoFar= 0, maxEndingHere=0;

        for (int i = 0; i < arr.length ; i++) {

            maxEndingHere = maxEndingHere + arr[i];

            if(maxEndingHere<0){
                maxEndingHere=0;
            }
            if(maxSoFar<maxEndingHere){
                maxSoFar=maxEndingHere;
            }


        }
        return maxSoFar;
    }

}
