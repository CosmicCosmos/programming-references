package net.learning.programming.arrays;

import org.testng.annotations.Test;

/**
 *  Given an array of 0 and 1, sort it in way all 0 before 1s.
 *
 *
 *  Use two variables start and end. Start set to 0 and end set to n-1
 *  Increment start and decrement end.
 *  Swap the values stored at arr[start] and arr[end] only when arr[start]==1 and arr[end]==0.
 *  Stop when start is equal to end or start is greater than end.
 *
 *
 */

//TODO: Will not work above logic need to find a better one

/**
 *  other option is Iteratie array and count 0 and 1
 *  Later fill the number of 0 based on the count and number 1 based on the count.
 *
 */

public class Sort0And1InArray {



    @Test
    public void usingRecursion(){



    }

    @Test
    public void usingIteration(){
       int arr [] = {0,1,1,0,1,1,0,1,1,0,1};
       int start =0, end=arr.length, swap;
        /* Initialize left and right indexes */
            int left = 0, right = arr.length - 1;

            while (left < right)
            {
                /* Increment left index while we see 0 at left */
                while (arr[left] == 0 && left < right)
                    left++;

                /* Decrement right index while we see 1 at right */
                while (arr[right] == 1 && left < right)
                    right--;

            /* If left is smaller than right then there is a 1 at left
               and a 0 at right.  Exchange arr[left] and arr[right]*/
                if (left < right)
                {
                    arr[left] = 0;
                    arr[right] = 1;
                    left++;
                    right--;
                }
            }
        }
    }





