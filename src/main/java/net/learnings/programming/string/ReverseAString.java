package net.learnings.programming.string;

import org.testng.annotations.Test;

public class ReverseAString {

    String actual ="reverse";

    char temp;

    @Test
    public void reverseBySwap(){
       char[] before = actual.toCharArray();
       int j = actual.length()-1;
       for(int i=0;i<actual.length()/2;i++,j--){
           temp = before[i];
           before[i] = before[j];
           before[j] = temp;
        }
        System.out.println(String.valueOf(before));
    }

}
