package net.learning.programming.strings;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUniqueCharacters {


    @Test
    public void testisStringContainsUniqueCharacters(){

        Assert.assertEquals(false, new StringUniqueCharacters().isStringContainsUniqueCharacters("sriman"));
        Assert.assertEquals(true, new StringUniqueCharacters().isStringContainsUniqueCharacters("srimaan"));
        Assert.assertEquals(true, new StringUniqueCharacters().isStringContainsUniqueCharacters("ss"));
        Assert.assertEquals(false, new StringUniqueCharacters().isStringContainsUniqueCharacters("s"));
        Assert.assertEquals(false, new StringUniqueCharacters().isStringContainsUniqueCharacters(""));
        Assert.assertEquals(true, new StringUniqueCharacters().isStringContainsUniqueCharacters("aabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        Assert.assertEquals(false, new StringUniqueCharacters().isStringContainsUniqueCharacters("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        Assert.assertEquals(false, new StringUniqueCharacters().isStringContainsUniqueCharacters("$!@#%^&*()_+"));
        Assert.assertEquals(true, new StringUniqueCharacters().isStringContainsUniqueCharacters("$!@#%^&*()_++"));
        Assert.assertEquals(false, new StringUniqueCharacters().isStringContainsUniqueCharacters("~><.,?|}{[]()"));

    }

    @Test
    public void testisUniqueChars2(){

        Assert.assertEquals(false, new StringUniqueCharacters().isUniqueChars2("sriman"));
        Assert.assertEquals(true, new StringUniqueCharacters().isUniqueChars2("srimaan"));
        Assert.assertEquals(true, new StringUniqueCharacters().isUniqueChars2("ss"));
        Assert.assertEquals(false, new StringUniqueCharacters().isUniqueChars2("s"));
        Assert.assertEquals(false, new StringUniqueCharacters().isUniqueChars2(""));
        Assert.assertEquals(true, new StringUniqueCharacters().isUniqueChars2("aabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        Assert.assertEquals(false, new StringUniqueCharacters().isUniqueChars2("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        Assert.assertEquals(false, new StringUniqueCharacters().isUniqueChars2("$!@#%^&*()_+"));
        Assert.assertEquals(true, new StringUniqueCharacters().isUniqueChars2("$!@#%^&*()_++"));
        Assert.assertEquals(false, new StringUniqueCharacters().isUniqueChars2("~><.,?|}{[]()"));

    }

    /**
     * @author : Srimaan Yarram
     * In this technique i am initally setting up an integer array with size of 256, we will find the index where this characters sits,
     * then increment the value, after incrementing we are immeidately checking the value is greater than 1, if yes then we break and return false.
     *
     * Approach : Linear Approach works.
     *
     * @param input
     * @return
     */
    public boolean isStringContainsUniqueCharacters(String input){
        int ia[] = new int[256]; //Used 256 inorder to validate all the ascii characters
        int length = input.length();
        if(length<=1 || length > 128){
            return false;
        }
        for (int i = 0; i<length; i++) {
            ia[input.charAt(i)]++; //Increment value by 1
            if(ia[input.charAt(i)]>1){ //Checks if the value is greater than 1, if yes then we are done doesn't have unqiue characters
               return true;
            }
        }
        return false;
    }


    /**
     * @author CrackingCodingInterview.
     * @param input
     * @return
     */
    public boolean isUniqueChars2(String input){
        int length = input.length();
        if(length>128){
            return false;
        }
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < length; i++) {
            int val = input.charAt(i);
            if(char_set[val]){
                return true;
            }
           char_set[val] = true;
        }
        return false;
    }


    public boolean isUniqueCharsUsingBitVector(String input){

        int checker = 0;

        for (int i = 0; i < input.length(); i++) {

            int val = input.charAt(i) - 'a';

            if ((checker & (1 << val)) > 0) {
                return false;
            }
                 checker |= (1 << val);

        }

        return true;

        }

    }





