package net.learning.programming.strings;

/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 Example 1:
 Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 Note: In the string, each word is separated by single space and there will not be any extra space in the string.


 */

public class ReverseWordsInString {


    public static void main(String args[]){

        String input = "LendingClub! rocks";

        String splitedInput[] = input.split(" ");

        String finalString = "";

        for(String s : splitedInput){

            finalString+=new ReverseWordsInString().reverseString(s)+" ";

        }

        System.out.println(finalString);


    }


    public String reverseWords(String sa) {

        StringBuilder rString = new StringBuilder(reverseString(sa));

        String[] split = rString.toString().split(" ");

        String returnS="";

        for(int i=split.length-1; i>=0; i--){

            returnS += split[i];

            if(i!=0){
                returnS+=" ";

            }


        }

        return returnS;

    }

    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int j = arr.length-1;
        char replace = '0';

        for(int i=0;i<arr.length/2;i++,j--){

            replace = arr[i];

            arr[i] = arr[j];

            arr[j] = replace;

        }

        return String.valueOf(arr);

    }
}
