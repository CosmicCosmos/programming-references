package net.learning.programming.arrays;

public class RemoveDuplicateInSortedArray {

     public static int[] removeDuplicatesNaive(int[] A) {

        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] == A[j]) {
                i++;
            } else {
                j++;
                A[j] = A[i];
                i++;
            }
        }

        return A;
    }


    public static void main(String[] args) {

         int a[] = {1,1,1,1,2,2};

        int re []= removeDuplicatesNaive(a);

        for (int i = 0; i < re.length; i++) {

            System.out.println(re[i]);

        }

    }
}
