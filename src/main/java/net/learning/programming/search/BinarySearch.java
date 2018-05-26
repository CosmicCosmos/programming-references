package net.learning.programming.search;

//LGTM

/**
 * A binary search or half-interval search algorithm finds the position of a specified value (the input "key") within a sorted array.
 * In each step, the algorithm compares the input key value with the key value of the middle element of the array.
 * If the keys match, then a matching element has been found so its index, or position, is returned.
 * Otherwise, if the sought key is less than the middle element's key, then the algorithm repeats its action on the sub-array to the left of the middle element or,
 * if the input key is greater, on the sub-array to the right.
 * If the remaining array to be searched is reduced to zero, then the key cannot be found in the array and a special "Not found" indication is returned.
 *
 * Every iteration eliminates half of the remaining possibilities. This makes binary searches very efficient - even for large collections.
 * Binary search requires a sorted collection. Also, binary searching can only be applied to a collection that allows random access (indexing).
 *
 * Worst case performance: O(log n)
 * Best case performance: O(1)
 */

public class BinarySearch {


    public static void main(String args[]) {

        int index = binarySearchUsingIteration(new int[]{2, 4, 6, 8, 10, 12, 14, 16}, 2);

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Searching element not found");
        }
    }


    public static int binarySearchUsingIteration(int array[], int key) {
        //Get the length of the array
        int end = array.length - 1;
        int start = 0;

        while (start <= end) {   //Continue only if the start size is smaller than end
           /**
             * Since the array is sorted, In first iteration we find the middle index
             * we check the middle element value is less than the searching value
             * Refer yes condition in line 20
             * Refer No condition in line 24
             * We continue this process by dividing till we find the element.
             */

            int mid = (start + end) / 2;
            if (key == array[mid]) {
                return mid;
            }
            if (key < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    /**
     *
     * Recursion is used in this algorithm because with each pass a new array is created by cutting the old one in half.
     * The binary search procedure is then called recursively, this time on the new array.
     * Typically the array's size is adjusted by manipulating a beginning and ending index.
     * The algorithm exhibits a logarithmic order of growth because it essentially divides the problem domain in half with each pass.
     *
     */

    //TODO : Learning for recurisve

    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
         if (start < end) {
            int mid = start + (end - start) / 2;

            if(sortedArray[mid]==key){
                return mid;
            }
            else if (key < sortedArray[mid]) {
               //now pass start and middle as the end
                return recursiveBinarySearch(sortedArray, start, mid, key);

            } else if (key > sortedArray[mid]) {
                //now pass start as middle and the end
                return recursiveBinarySearch(sortedArray, mid+1, end , key);
           }
        }
        return - (start + 1);
    }

}