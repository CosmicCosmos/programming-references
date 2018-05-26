package net.learning.programming.strings;

public class FindFirstUpperChar {

    public static int isUpperNonRecursive(char c){

      if(Character.isUpperCase(c)){
          return 0;
      }
      return 1;

    }


    //Iteration Example
    public static void main1(String[] args) {

        String s = "srimaaN";

        char[] chs = s.toCharArray();


        for (int i = 0; i < chs.length; i++) {

             if (isUpperNonRecursive(chs[i])==0){
               System.out.println("Detect upper case " + chs[i] + " at index " + i);
                 break;
             }

        }
    }

    public static void main(String[] args) {
       String s = "srimaaN";
       int i = isUpperRecursive(s, 0);

       if( i >= 0 ){

           System.out.println("Detect upper case " + s.charAt(i) + " at index " + i);


       }
    }


    //Recursive Example


    public static int isUpperRecursive(String s, int i){

        if(i==s.length()){  //Termination Condition

            return -1;
        }

        if(Character.isUpperCase(s.charAt(i))){
            return i;  //if we found a upper character we will come out from recursion.
        }
        return isUpperRecursive(s, i + 1);
    }
}
