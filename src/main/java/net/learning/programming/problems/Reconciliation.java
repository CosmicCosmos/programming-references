package net.learning.programming.problems;

import java.util.HashMap;

public class Reconciliation {


    static HashMap<String, Integer> pos = new HashMap<String, Integer>();

    static HashMap<String, String> trn = new HashMap<String, String>();

    public static void main(String[] args) {

        String[] fileContents = {"D0-POS", "AAPL 100", "GOOG 200", " Cash 10", "D1-TRN",
                " AAPL SL 50 30000", " GOOG BY 10 10000", "D1-POS",
                " AAPL 50", " GOOG 220", " Cash 20000"};
        boolean posflag = false;
        boolean trnflag = false;

        int size = fileContents.length;

        for (int i = 0; i < fileContents.length; ) {


            System.out.println(fileContents[i]);

            if (fileContents[i].endsWith("-POS")) {

                i++;

                while (!fileContents[i].endsWith("-TRN")) {

                    String tokens[] = fileContents[i].split(" ");

                    setPos(tokens[0], Integer.parseInt(tokens[1]));

                    i++;
                }


            } else if (fileContents[i].endsWith("-TRN") && i < fileContents.length) {

                i++;

                while (!fileContents[i].endsWith("-POS") && i < fileContents.length) {

                    String tokens[] = fileContents[i].split(" ");

                    setTrn(tokens[0], tokens[1]);

                    i++;
                }


            }


        }

        System.out.println(pos);

        System.out.println(trn);

    }


    public static HashMap<String, Integer> setPos(String ticker, Integer units) {
        pos.put(ticker, units);
        return pos;
    }

    public static HashMap<String, String> setTrn(String ticker, String info) {
         /*if(pos.containsKey(ticker)){
            return pos.get(ticker).toString();
         }
         else{
             return null;
         }*/

        trn.put(ticker, info);

        return trn;
    }
}
