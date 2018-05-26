package net.learning.programming.recursive;

/**
 * 5 * 4 * 3 * 2 * 1
 */

public class Factorial {

    public int factorial(int i){
       if(i<=1){
            return 1;
        }
        return i * factorial(i-1);
    }

    public static void main(String[] args) {

        Factorial fact = new Factorial();

        int f =  fact.factorial(10);

        System.out.println(f);
    }

}
