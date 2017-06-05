package com.withgoogle.foobar;

//import com.withgoogle.foobar.level2_1.Answer;
//import com.withgoogle.foobar.level2_2.Answer;
import com.withgoogle.foobar.level2_2_1.Answer;

public class Main {

    public static void main(String[] args) {
        /*
        //Level 2_1
        Answer ans = new Answer();
        System.out.println("rez: " + ans.answer(1,1).equals("1"));
        System.out.println("rez: " + ans.answer(1,2).equals("2"));
        System.out.println("rez: " + ans.answer(1,3).equals("4"));
        System.out.println("rez: " + ans.answer(3,3).equals("13"));
        System.out.println("rez: " + ans.answer(4,4).equals("25"));
        System.out.println("rez: " + ans.answer(2,3).equals("8"));
        System.out.println("rez: " + ans.answer(5,10).equals("96"));
        System.out.println("rez: " + ans.answer(3,2).equals("9"));
        System.out.println("rez: " + ans.answer(8,1).equals("36"));
        System.out.println("rez: " + ans.answer(2,3).equals("8"));
        System.out.println("rez: " + ans.answer(3,2).equals("9"));
        System.out.println("rez: " + ans.answer(99999,99999).equals("19999400005"));
         */

        /*
        //Level 2_2
        Answer ans = new Answer();
        System.out.println("\n");
        for (int x: ans.answer(new int[]{4, 30, 50})){

            System.out.print(x + " ");
        }
        System.out.println("\n");
        for (int x: ans.answer(new int[]{4, 17, 50})) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        for (int x: ans.answer(new int[]{4, 30, 50, 80, 100})){
            System.out.print(x + " ");
        }
        System.out.println("\n");
        for (int x: ans.answer(new int[]{4, 30, 50})){
            System.out.print(x + " ");
        }
        System.out.println("\n");
        for (int x: ans.answer(new int[]{4, 17})) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        for (int x: ans.answer(new int[]{18, 40, 100, 150})) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        for (int x: ans.answer(new int[]{20, 40, 60, 100})) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        for (int x: ans.answer(new int[]{20, 40, 60, 90})) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        for (int x: ans.answer(new int[]{20, 40, 60, 80})) {
            System.out.print(x + " ");
        }
        */

        //Level 2_2 (bug)
        Answer a = new Answer();
        System.out.println(a.answer(new int[]{2, 0, 2, 2, 0}).equals("8"));
        System.out.println("=================================");
        System.out.println(a.answer(new int[]{-2, -3, 4, -5}).equals("60"));

        System.out.println("=================================");
        System.out.println(a.answer(new int[]{0,-1,-2,-3,5}).equals("30"));

        System.out.println("=================================");
        System.out.println(a.answer(new int[]{0,2,2,3,5}).equals("60"));

        System.out.println("=================================");
        System.out.println(a.answer(new int[]{0,0,0,0,-5}).equals("0"));

        System.out.println("=================================");
        System.out.println(a.answer(new int[]{1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000}).equals("1000000000000000000000000000000000000000000000000000000000"));

        System.out.println("=================================");
        System.out.println(a.answer(new int[]{2,2,2,-2,-5}).equals("40"));


        System.out.println("=================================");
        System.out.println(a.answer(new int[]{0,0,0,0,5}).equals("5"));
    }
}



