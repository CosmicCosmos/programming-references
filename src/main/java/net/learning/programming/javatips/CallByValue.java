package net.learning.programming.javatips;

/**
 * Parameter passing, call by value
 *
 * All the basic data types when passed as parameters are by the passed-by-value. That means a seperate copy is
 * created inside called method and the variable in the calling method remains unchanged.
 *
 *
 *  Points to Remeber :
 *
 *  Pass by value just creates a copy of varaible
 *  Pass by value, value before and afer the method call remian same.
 */

public class CallByValue {


    public static void increment(int var){

        var++;

    }

    public static void main(String[] args) {

        int i = 10;

        System.out.println("value of i before increment is : " + i);

        increment(i);

        System.out.println("value of i before increment is : " + i);
    }


}
