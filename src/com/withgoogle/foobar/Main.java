package com.withgoogle.foobar;

import com.withgoogle.foobar.level2_1.Answer;

public class Main {

    public static void main(String[] args) {
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
    }
}



