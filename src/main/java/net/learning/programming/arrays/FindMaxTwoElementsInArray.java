package net.learning.programming.arrays;


/**
 *  Approach 1 : Linear
 *
 *  Keep two variable fMax, sMax and initialize both values to Min Value.
 *
 *  Iterate the array and check if current element is greater than fMax, if then copy the current fMax value to sMax
 *
 *  and current element i.e a[i] value to fMax.
 *
 *
 *  Approach 2 : Sort the Array and then last two elements are the max elements
 *
 */
public class FindMaxTwoElementsInArray {


    public static void main(String[] args) {
        int fMax=Integer.MIN_VALUE, sMax = Integer.MIN_VALUE;
        int[] a = {90,20,10,40,50,160, 10};
        for (int i = 0; i <= a.length-1 ; i++) {
           if(fMax<=a[i]){
                sMax=fMax;
                fMax=a[i];
            }


        }

        System.out.println(fMax +  " " + sMax );
    }



}
