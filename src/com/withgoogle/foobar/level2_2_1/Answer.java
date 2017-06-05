package com.withgoogle.foobar.level2_2_1;

//power_hungry

import java.math.BigInteger;
import java.util.*;

public class Answer {
    public static String answer(int[] xs) {

        List<Integer> listAll = new ArrayList<>();
        List<Integer> listNeg = new ArrayList<>();
        List<Integer> listPos = new ArrayList<>();
        int sum = 0;
        Arrays.sort(xs);
        for (Integer x : xs){
            //System.out.print(x + ", ");
            listAll.add(x);
            sum+=x;
            if (x < 0){
                listNeg.add(x);
            }else listPos.add(x);
        }
        Collections.sort(listPos, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        });

        Collections.sort(listNeg, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        });

        Collections.sort(listAll, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        });

        int negCount = 0;
        if (listNeg.size() % 2 != 0){
            negCount = listNeg.size() - 1;
        }

        //find minim and delet it
        else if (listNeg.size() != 0 && listNeg.size() % 2 == 0){
            negCount = listNeg.size();
            int min = listAll.get(listAll.size()-1);
            if (min < 0) {
                min*=-1;
            }
            for (int x : listAll){
                if (x >= 0 && x < min){
                    min = x;
                }
            }
            //System.out.println("min> "+ min);
            listAll.remove(listAll.indexOf(min));
            listAll.add(0,0);
        }

        BigInteger rez = new BigInteger("1");

        if (listAll.size() == 1){
            rez = new BigInteger(listAll.get(0).toString());
        } else {
            for (int i = listAll.size()-1; i > 0; i--){
                //System.out.println(listAll.get(i));
                if (listAll.get(i) < 0 && negCount >= 1){
                    //System.out.println("neg>>" + negCount);
                    negCount--;
                    //System.out.println("neg>>" + negCount);
                    rez = rez.multiply(new BigInteger(String.valueOf(listAll.get(i))));

                } else if (listAll.get(i) < 0 && negCount <= 0){
                    //System.out.println("br");
                    //System.out.println("zero>" + listAll.get(0));
                }else if (rez.longValue() == 1 && i == 1 && listAll.get(i) == 0){
                    rez = rez.multiply(new BigInteger(String.valueOf("0")));
                } else if (listAll.get(i) == 0){
                } else {
                    rez = rez.multiply(new BigInteger(String.valueOf(listAll.get(i))));
                }
            }
        }


        //System.out.print(String.valueOf("= " + rez + " "));
        return String.valueOf(rez);
    }
}
