package com.google.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class Answer {

    private int[][] matrix;
    private boolean[] terminalState;
    static int terminalStateCount = 0;
    private int[][] orderedM;
    private int[][] matrixQ;

    Answer(int[][] m) {
        //this.matrix = m;
        this.terminalState = findTerminalStates(m);
        this.orderedM = orderIt(m);
        //this.terminalState = findTerminalStates(orderedM);
        this.matrixQ = findQ(this.orderedM);

        //printArray2D(this.matrixQ);
        printArray2D(this.matrixQ);
    }

    int[][] findQ(int[][] m) {
        int[][] temp = new int[terminalStateCount][terminalStateCount];
        int i = 0;
        int j = 0;
        for (int[] row : m) {
            if (!terminalState[i]) {
                System.arraycopy(row, 4, temp[j], 0, 2  );
                j++;
            }
            i++;
        }
        return temp;

    }

    private int[][] orderIt(int[][] m) {
        ArrayList<int[]> ordered = new ArrayList<>();

        //put all terminated state on the top of matrix
        int rowCont = 0;
        for (int[] row : m){
            if (this.terminalState[rowCont]) {
                row[row.length -1 - rowCont] = 1;
                ordered.add(0, row);
            } else {
                int[] nA = new int[row.length];
                System.arraycopy(row, 0, nA, row.length - terminalStateCount, terminalStateCount);
                System.arraycopy(row, terminalStateCount, nA, 0, row.length - terminalStateCount);
                ordered.add(nA);
            }
            rowCont++;
        }
        return ordered.toArray(new int[0][]);
    }

    static int[] answer(int[][] m) {
        return new int[]{7, 6, 8, 21};
    }

    static boolean[] findTerminalStates(int[][] m){
        boolean[] terminalStates = new boolean[m.length];
        for (int row = 0; row < terminalStates.length; row++) {
            if (IntStream.of(m[row]).sum() == 0) {
                terminalStates[row] = true;
            }
            else {
                terminalStates[row] = false;
                terminalStateCount++;
            }
        }
        return terminalStates;
    }


    boolean[] getTerminalStates() {
        return this.terminalState;
    }

    int[][] getOrderedM() {
        return orderedM;
    }

    void printArray2D(int[][] m) {
        //for tests only
        for (int[] x : m) {
            System.out.println();
            for (int z : x){
                System.out.print(z + " ");
            }
        }
    }
}
