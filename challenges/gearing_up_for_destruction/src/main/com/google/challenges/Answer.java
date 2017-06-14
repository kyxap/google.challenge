package com.google.challenges;

//gearing_up_for_destruction

import java.util.ArrayList;
import java.util.List;

public class Answer {

    public static int[] answer(int[] pegs) {

        int firstGearSize = lastGearSize(pegs) * 2;
        int divisor = 1;

        if ((pegs.length % 2 == 0)) {
            if (firstGearSize % 3 == 0) {
                firstGearSize /= 3;
            } else {
                divisor = 3;
            }
        }
        return allGearsFit(firstGearSize, divisor, pegs);
    }

    private static int[] allGearsFit(int firstGearSize, int divisor, int[] pegs) {
        //find incorrect vallues
        float prevR = ((float) firstGearSize) / ((float) divisor);
        for (int i = 0; i < pegs.length - 2; i++) {
            int width = pegs[i + 1] - pegs[i];
            if (prevR < 0 || prevR > (width - 1)) return new int[]{-1, -1};
            prevR = width - prevR;
        }
        if (firstGearSize > 1){
            return new int[]{firstGearSize, divisor};
        }
        else return new int[]{-1,-1};

    }

    //find y
    public static int lastGearSize(int[] pegs){
        int sign;
        if (pegs.length % 2 == 0){
            sign = 1;
        } else  sign = -1;

        List<Integer> listDist = new ArrayList<>();
        for (int i = 0; i < pegs.length - 1; i++) {
            listDist.add(pegs[i + 1] - pegs[i]);
        }
        int y= 0;
        //odd    y = (d(1) - d(2) + d(3) - d(4))/1  ## [general form: sign = -1, divisor = 1]
        //even    y = (d(1) - d(2) + d(3))/3   ## [general form: sign = +1, divisor = 3]
        int c = 1;
        for (int i = 0; i<listDist.size(); i++) {
            if (i == listDist.size() - 1) {
                y = y + (sign) * listDist.get(i);
            } else if (c % 2 == 0) {
                y -= listDist.get(i);
            } else y += listDist.get(i);
            c++;
        }
        return y;
    }
}


