package net.learning.programming.strings;

/**
 * Problem : Write a method to find the sum of every number in an int number.
 * Example Inputs = 1984 output: 32 (1+9+8+4)
 */

public class FindSumOfEveryNumber {

    static int total;

    public static void main(String args[]){

        recursive(2984);

        System.out.println(total);



    }

    public static int recursive(int num){
       if(num<=0){
            return total+num;
        }

        total+=num%10;
        num = num/10;

        return recursive(num);
    }

}
