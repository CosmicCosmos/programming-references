package net.learning.programming.strings;

import org.testng.annotations.Test;

public class Palindrome {


    public boolean isPalindrome(String s) {

        int length = s.length();

        s = s.toLowerCase();


        if (length <= 1) {
            return true;
        }

        int start = 0;
        int end = length - 1;


        while (start != end) {

            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            else if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            else {
                start++;
                end--;
            }
        }

        return true;

    }

    @Test
    public void test(){

        System.out.println(new Palindrome().isPalindrome(".,"));

    }

}
