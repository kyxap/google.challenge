package com.google.challenges;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AnswerTest {
    private com.google.challenges.Answer a;

    @Before
    public void setUp() {
        a = new Answer();
    }

    @Test
    public void test1() {
        assertTrue(a.answer(new int[]{2, 0, 2, 2, 0}).equals("8"));
    }

    @Test
    public void test2() {
        assertTrue(a.answer(new int[]{-2, -3, 4, -5}).equals("60"));
    }

    @Test
    public void test3() {
        assertTrue(a.answer(new int[]{0,-1,-2,-3,5}).equals("30"));
    }

    @Test
    public void test4() {
        assertTrue(a.answer(new int[]{0,2,2,3,5}).equals("60"));
    }

    @Test
    public void test5() {
        assertTrue(a.answer(new int[]{0,0,0,0,-5}).equals("0"));
    }

    @Test
    public void test6() {
        assertTrue(a.answer(new int[]{1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,
                1000,1000,1000,1000}).equals("1000000000000000000000000000000000000000000000000000000000"));
    }

    @Test
    public void test7() {
        assertTrue(a.answer(new int[]{2,2,2,-2,-5}).equals("40"));
    }

    @Test
    public void test8() {
        assertTrue(a.answer(new int[]{0,0,0,0,5}).equals("5"));
    }
}

