package net.learning.programming.recursive;

/**
 * The below program will demonstrate how to use recursion for the first 1000 numbers.
 *
 * Tips : When we are using recursion we need to rember the following
 *
 * 1) Termination Condition
 *
 * 2) Recursion Function.
 */

public class First10Numbers {

    public int recursiveNumbers(int i){

        System.out.println(i);

        if(i==1000){
            return 0;
        }

        return recursiveNumbers(i+1);

    }

    public static void main(String[] args) {

        First10Numbers first = new First10Numbers();

        first.recursiveNumbers(1);
    }
}
