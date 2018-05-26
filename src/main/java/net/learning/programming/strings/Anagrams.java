package net.learning.programming.strings;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Anagrams {

    String actual = "abcdef";
    String expected = "fedcbk";

    @Test //using sort technquie
    public void isStringAnagram(){
        Assert.assertEquals(actual.length(), expected.length());
        char[] ac = actual.toCharArray();
        char[] ex = expected.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(ex);
        Assert.assertEquals(ac,ex);
       }

    @Test
    public void usingLoop(){

        int[] chsMap = new int[26];

        for(char c: actual.toCharArray()) {
            chsMap[c - 'a']++;
        }

        for(char c: expected.toCharArray()) {
            chsMap[c - 'a']--;
        }

        for(int cnt: chsMap) {
            if(cnt != 0) {
               Assert.assertFalse(false);
            }
        }

    }
    }

