package net.learning.programming.strings;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

/**
 *  Note : Only small change in the yesterday dicussion is instead of making -1 if the element appears make it -2 and intialize the index array by -1 instead of 0
 *
 *  Lets create an index array and initialzie the index array elements to -1
 *  Traverse the Character array or String, check the value of index of that string element in index array.
 *  There would be chance if the first occurence in the String set index of that array to i
 *  If not then if the element is repeating set index to -2
 *  Once the String array is traversed, i will traverse the index array and find the minimum value in the array
 *  which is non negative. If found this is the index else return null
 */

public class NonRepatingCharacter {

        //Return type is characters since we wanted to return the first non repating character.
        public static Character findfirstNonRepatingChar(String strArray) {


            int strLength = strArray.length();

            //check if the is size is empty or null usign Apache StringUtils of apache commons
            if(StringUtils.isEmpty(strArray)){
                  return  null;
            }

            //Check if the Length is 1 then there is no need to traverse so return first character in string
            if(strLength == 1) {
                return strArray.charAt(0);
            }

            //This is the index array
            int[] charIndexArray = new int[256];   // Index of non repeating characters. If repeating, then index = -2


            // Initialize to -1 everything
            for(int i = 0; i < 256; i++) {
                charIndexArray[i] = -1;
            }

            for(int i = 0; i < strLength; i++) {
                if(charIndexArray[strArray.charAt(i)] == -1) {
                    // character seen first time
                    charIndexArray[strArray.charAt(i)] = i;
                } else {
                    // Repeated character
                    charIndexArray[strArray.charAt(i)] = -2;
                }
            }

            int minIdx = strLength; // Index of first non repeating character
            for(int i = 0; i < 256; i++) {
                if(charIndexArray[i] >= 0 && minIdx > charIndexArray[i]) {
                    minIdx = charIndexArray[i];
                }
            }

            if(minIdx >= 0 && minIdx < strLength) {
                return strArray.charAt(minIdx);
            }
            else{
                return null;
            }
        }


    
        
        @Test
          public void simpleTest(){
            String simpleText = "z,a,b,a,c,d,e,e,f,b";
            System.out.println("Frist Non Repating character for SimpleTest " + findfirstNonRepatingChar(simpleText));
            
            }
            


        @Test
        public void LargeText(){



            String largeText = "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeef" +
                    "zabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefzabacdeefk";

            System.out.println("Frist Non Repating character for Large Text" + findfirstNonRepatingChar(largeText));

     }
}




