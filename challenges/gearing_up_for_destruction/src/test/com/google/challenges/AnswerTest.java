package com.google.challenges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnswerTest {
    private com.google.challenges.Answer a;

    @Before
    public void setUp() {
        a = new Answer();
    }

    @Test
    public void test1() {
        Assert.assertArrayEquals(new int[]{12, 1}, a.answer(new int[]{4, 30, 50}));
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(new int[]{-1, -1}, a.answer(new int[]{4, 17, 50}));
    }

    @Test
    public void test3() {
        Assert.assertArrayEquals(new int[]{-1, -1}, a.answer(new int[]{4, 30, 50, 80, 100}));
    }

    @Test
    public void test4() {
        Assert.assertArrayEquals(new int[]{26, 3}, a.answer(new int[]{4, 17}));
    }

    @Test
    public void test5() {
        Assert.assertArrayEquals(new int[]{8, 1}, a.answer(new int[]{18, 40, 100, 150}));
    }

    @Test
    public void test6() {
        Assert.assertArrayEquals(new int[]{-1, -1}, a.answer(new int[]{20, 40, 60, 100}));
    }

    @Test
    public void test7() {
        Assert.assertArrayEquals(new int[]{-1, -1}, a.answer(new int[]{20, 40, 60, 90}));
    }

    @Test
    public void test8() {
        Assert.assertArrayEquals(new int[]{40, 3}, a.answer(new int[]{20, 40, 60, 80}));
    }
}
