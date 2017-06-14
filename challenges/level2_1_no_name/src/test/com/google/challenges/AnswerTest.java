package com.google.challenges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnswerTest {
    private com.google.challenges.Answer ans;

    @Before
    public void setUp() {
        ans = new Answer();
    }

    @Test
    public void test1() {
        assertTrue(ans.answer(1,1).equals("1"));
    }

    @Test
    public void test2() {
        assertTrue(ans.answer(99999,99999).equals("19999400005"));
    }

    @Test
    public void test3() {
        assertTrue(ans.answer(3,2).equals("9"));
    }

    @Test
    public void test4() {
        assertTrue(ans.answer(2,3).equals("8"));
    }

    @Test
    public void test5() {
        assertTrue(ans.answer(8,1).equals("36"));
    }

    @Test
    public void test6() {
        assertTrue(ans.answer(3,2).equals("9"));
    }

    @Test
    public void test7() {
        assertTrue(ans.answer(5,10).equals("96"));
    }

    @Test
    public void test8() {
        assertTrue(ans.answer(2,3).equals("8"));
    }

    @Test
    public void test9() {
        assertTrue(ans.answer(4,4).equals("25"));
    }

    @Test
    public void test10() {
        assertTrue(ans.answer(3,3).equals("13"));
    }

    @Test
    public void test11() {
        assertTrue(ans.answer(1,3).equals("4"));
    }

    @Test
    public void test12() {
        assertTrue(ans.answer(1,2).equals("2"));
    }
}

