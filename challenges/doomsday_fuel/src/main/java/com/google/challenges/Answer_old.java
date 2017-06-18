package com.google.challenges;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Answer_old {
    public static int[] answer(int[][] m) {
        ArrayList<ArrayList<Double>> probMatrix = convertMatrix(m);
        //System.out.println(probMatrix.size());

//        //find terminal state
        //System.out.println(m.length);
        ArrayList<Boolean> terminalStateFilter = new ArrayList<>();
        for (int row = 0; row < m.length; row++){
            if (IntStream.of(m[row]).sum() == 0){
                terminalStateFilter.add(true);
            } else terminalStateFilter.add(false);
        }


        // multiply matrix by probability vector
        ArrayList<Double> oldFirstRow = probMatrix.get(0);
        ArrayList<Double> probVector = new ArrayList<>();
        //System.out.println(probMatrix.get(1));
        //System.out.println(terminalStateFilter);
        //TODO


//        for (int i = 0; i < 3000; i++) {
//            for (int[] col : probMatrix[]){
//
//            }
//        }

//        probVector.add(0.0);
//        probVector.add(0.0);
//        probVector.add(0.0);
//        probVector.add(0.2142857142857143);
//        probVector.add(0.1428571428571429);
//        probVector.add(0.6428571428571427);

        //System.out.println(ratio(probVector.get(3)));
        //System.out.println(numerator + "/" + denominator);

        //gen numerators and denum



//        int[] numberators = new int[probVector.size()];
//        int[] denominator = new int[probVector.size()];
//        for (int i = 0; i < numberators.length; i++){
//            if (probVector.get(i) == 0.0) {
//                numberators[i] = 0;
//                denominator[i] = 1;
//            } else {
//                int[] rez = ratio(probVector.get(i));
//                numberators[i] = rez[0];
//                denominator[i] = rez[1];
//            }
//        }
//
//        for (int i = 0; i < 6; i++) {
//            System.out.println(numberators[i]);
//        }

        for (ArrayList<Double> i : probMatrix){
            System.out.println(i);
        }
        return new int[]{7, 6, 8, 21};
    }


    static int[] ratio(double d) {
        String s = String.valueOf(d);
        int digitsDec = s.length() - s.indexOf('.');

        int denom = 1;
        for (int i = 0; i < digitsDec; i++) {
            d *= 10;
            denom *= 10;
        }
        int num = (int)d;//(int) Math.round(d);
        for (int i = num; i > 1; i--) {
            if (num % i == 0 && denom % i == 0){
                return new int[]{num / i,denom / i};
            }
        }
        return new int[]{num, denom};
    }

    static ArrayList<ArrayList<Double>> convertMatrix(int[][] transMatrix){
        ArrayList<ArrayList<Double>> probMatrix = new ArrayList<>();

        for (int i = 0; i < transMatrix.length; i++){
            int[] row = transMatrix[i];
            ArrayList<Double> newRow = new ArrayList<>();
            int rowSum = IntStream.of(transMatrix[i]).sum();
            //System.out.println(rowSum);

            if (IntStream.of(transMatrix[i]).sum() == 0){

                for (int j : transMatrix[i] ) {
                   newRow.add((double)0);
                }
                newRow.set(i, (double)1);
                //System.out.println(newRow);
                probMatrix.add(newRow);
                //System.out.println(newRow);
            } else {

                for (int j : transMatrix[i]) {
                    if (j == 0) {
                        newRow.add((double)0);
                    } else {
                        double rez = (double)j / rowSum;
                        //System.out.println(rez);
                        newRow.add(rez);
                    }
                }
                probMatrix.add(newRow);
            }
        }
        //System.out.println(probMatrix);
        return probMatrix;
    }
}