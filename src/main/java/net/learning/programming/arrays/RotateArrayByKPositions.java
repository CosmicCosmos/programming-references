package net.learning.programming.arrays;

/**
 * Rotate Array By K Positions,
 *
 * For Example, an Array [10,20,30,40,50,60] rotate by 2 positions to [30,40,50,60,10,20]
 * Example 2 : 1,2,3,4,5,6,7,8,9,10 ==> K=3 ==> 4,5,6,7,8,9,10,1,2,3
 *
 * Rotating of an array is done in two parts, in first pass we reverse the elements of array first half (start to  k elements)  and
 * and then second half (k to end)
 *
 * For Example in the above case 1,2,3,4,5,6,7,8,9,10, we try divide the array in two parts by (k-1)
 * i.e in the above case the k is 3, so the first half and let say fh = 1,2,3 (not as the index starts from 0)
 * and the second half and let say sh=4,5,6,7,8,9,10
 * We will reverse the first half first which become fh= 3,2,1 and then
 * We reverse the second half which becomes sh = 10,9,8,7,6,5,4 and finally we reverse the entire array
 * 3,2,1,10,9,8,7,6,5,4 (reverse) 4,5,6,7,8,9,10,3,2,1
 *
 */

public class RotateArrayByKPositions {


    public static void main(String[] args) {
        RotateArrayByKPositions rotate = new RotateArrayByKPositions();
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        rotate.rotateArray(array, array.length, 3);

    }

    public void rotateArray(int array[], int numberOfElements, int rotateBy){
        reverseArray(array, 0, rotateBy-1); //reverse from start to k elements
        reverseArray(array, rotateBy,numberOfElements-1); //reverse from k elements to end
        reverseArray(array, 0, numberOfElements-1); //reverse the entire array.

        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

    }

    public void reverseArray(int array[], int start, int end){

        //Swapping
     for (int i = start,j=end; i < j ; i++,j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }



}
