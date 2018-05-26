package net.learning.programming.strings;

import java.util.regex.Pattern;

public class PreFormatting {


    public static void main(String[] args) {

        String preFormat = "Feature1 1485475000 3:P:1 1:P:2"; //P 2 2

        String k[] =

                preFormat.split("^(\\S+).(\\S+)");

        for (String s: k) {
            System.out.println("Test" + s);
        }





        String split[] = preFormat.split(" ");

        String a[] = new String[10];

        String finalOutput = " ";

        int totalDuration = 0;

        int exeuction = 1;


        for(int i=2;i<split.length; i++){

           String sp[] = split[i].split(":");

            for (int j = 0; j < sp.length ; j++) {


                int testCaseId = Integer.parseInt(sp[0]);

                a[testCaseId] = sp[1] + " " + exeuction + " " + Integer.parseInt(sp[2]);


            }

            totalDuration+=Integer.parseInt(sp[2]);


            exeuction++;
        }

        finalOutput = split[0] + " " + split[1] + " " + totalDuration;


        for (int i = 1; i < a.length; i++) {

            if(a[i]==null){
                finalOutput+=" " + "NULL NULL NULL";
            }
            else {
                finalOutput+=" " +a[i];
            }


        }

        System.out.println(finalOutput);

    }

}
