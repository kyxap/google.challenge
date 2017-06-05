package com.withgoogle.foobar.level2_1;

public class Answer {
    public static String answer(int x, int y) {
        //find N row
        long yN = 1;
        for (int i = 0; i < y; i++){
            yN = i + yN;
        }
        //System.out.print("yN>> " + yN + "  ");

        //find M elemnt in N row
        long xM = yN;
        for (int i = 1; i < x; i++){
            xM = xM + y + i;
        }
        //System.out.print("xM>> " + xM + " ");
        return String.valueOf(xM);
    }
}
