package net.learning.programming.arrays;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicatesElements {

    /**
     * Exhaustive search or Brute force for each element in array find if there is some other element with the same value.
     * This is done using two for loop, first loop to select the element and second loop to find the its duplicate entry.
     * Time Complexity : O(n2)
     * Space Complexity : O(1)
     */
    @Test
    public void usingNaive(){
      int arr[] = {1,1,2,2,1,6,7,8,9,10};

       for(int i=0;i<arr.length;i++){

          for(int j=i+1;j<arr.length;j++){

              if(arr[i]==arr[j]){

                  System.out.println("Duplicates found " + arr[i]);

              }
          }
      }
    }

    /**
     * Sorting, sort all the elements in the array and after this in a single scan,
     * we find the duplicates.
     *
     * Time Complexity : O(n log n) for Sorting and Single scan take O(n)
     * Space Complexity : O(1)
     *
     */
    @Test
    public void usingSorting(){
        int arr[] = {1,1,2,2,1,6,7,8,9,10};
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
              System.out.println(" " + arr[i]);
            }
        }
    }

    /**
     * Using a HashTable, using HashTable we can keep track of the elements we have already seen and we can find
     * duplicates in just one scan.
     * Time Complexity:
     * HashTable insert and find take constant time O(1) so the total time complexity of the algorithm is O(n) time
     * Space Complexity: O(n)
     */
    @Test
    public void usingHashMap(){
        int arr[] = {1,1,2,2,1,6,7,8,9,10};
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                int count = hashMap.get(arr[i]);
                hashMap.put(arr[i], count+1);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }
        //Iteratie the hashmap to get the count
        hashMap.forEach((k,v)-> {
          if(v > 1) {
             System.out.println("Found Duplicates for " + k + " and " + v + " times " );
            }
        });
    }


    /**
     *
     * //TODO : Approch is not good
     * Counting this approach is only possible if we know the range of the input.
     * If we know that, the elements in the array are in the range 0 to n-1.
     * We can reserve and array of length n and when we see an element we can increast its count.
     * In just one single scan, we know the duplicates. If we know the range of the elements, then this is
     * the fatest way to find the duplicates
     *
     */

    @Test
    public void usingSpecialArray(){
        int arr[] = {99,1,1,2,2,1,6,7,8,9,10};
        int count[] = new int[arr.length+1];
        //Fill initially all the values as 0
        for(int i=0; i<arr.length;i++){
            count[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            if(count[arr[i]]==1){
               System.out.println(" " + arr[i]);
            }
            else{
                count[arr[i]]++;
            }
        }



    }

}
