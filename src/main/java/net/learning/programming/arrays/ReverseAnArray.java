package net.learning.programming.arrays;

import org.testng.annotations.Test;

/**
 * using swap technquies
 *
 * Using two variable start and end,
 *
 * Start set to 0 and end set to (n-1). Increment start and decrement end.
 *
 * Keep a local variable and swap the values, stop when start is equal to end or start is greater than end.
 */

public class ReverseAnArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int start =0, end = arr.length-1, swap;

        while (start<=end){
            swap = arr[start];
            arr[start] = arr[end];
            arr[end] = swap;
            start++; end--;
        }

        for (int i = 0; i < arr.length ; i++) {
           System.out.println(arr[i]);
        }

    }

    public static int[] reverseArray(int[] a,int i,int j){
        //Tail Recursion.
        if(i<j){
            //swap elements a[i],a[j]
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            reverseArray(a, i+1, j-1);
        }
        return a;
    }


    @Test
    public void usingRecursion(){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int reversed[]= reverseArray(arr,0,arr.length-1);
       for (int i = 0; i < reversed.length ; i++) {
           System.out.println(reversed[i]);
       }
    }
}
