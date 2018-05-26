package net.learning.programming.javatips;

/**
 *
 * Comparsion(==) in reference variable is done by comparing the address of the variable.
 *
 * Parameter passing of a reference variable is done by copying the address of the variable.
 * This method is called pass-by-reference. Since the object is not copied, it is shared.
 * Changes doen in called funciton are also reflected to the caller of the function.
 *
 * Points to remember :
 *
 * 1. Call by reference is implemented indirectly by passing the address of an instance of class or array to the function.
 *
 *
 *
 */

public class CallByReference {

    private static class MyInt {
        int value;
    }

    public static void increment(MyInt value){

        (value.value)++;
    }

    public static void main(String[] args) {
        MyInt x = new MyInt();

        x.value=10;

        System.out.println("Value of i before increment is : " + x.value);

        increment(x);

        System.out.println("Value of i before increment is : " + x.value);

        MyInt x1 = new MyInt();

        x1.value=10;


        System.out.println("Value x1 of i before increment is : " + x1.value);

    }

}
