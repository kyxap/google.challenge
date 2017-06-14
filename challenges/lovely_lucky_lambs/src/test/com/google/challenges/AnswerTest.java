package com.google.challenges;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnswerTest {
    private com.google.challenges.Answer answer;

    @Before
    public void setUp() {
        answer = new Answer();
    }

    @Test
    public void test() {
        assertFalse(answer.answer(0) != 0);
    }

    @Test
    public void minMin1() {
        Assert.assertEquals(3, answer.minMinions(10));
    }

    @Test
    public void maxMin1() {
        Assert.assertEquals(4, answer.maxMinions(10));
    }

    @Test
    public void rezMinMaxFromExemple() {
        Assert.assertEquals(1, answer.answer(10));
    }

    @Test
    public void rezMinMax1and1() {
        Assert.assertEquals(0, answer.answer(1));
    }

    @Test
    public void rezMinMax0and0() {
        Assert.assertEquals(0, answer.answer(0));
    }

    @Test
    public void rezMinMax11() {
        Assert.assertEquals(1, answer.answer(11));
    }

    @Test
    public void rezMinMax10in9() {
        Assert.assertEquals(12, answer.answer(1000000000));
    }

    @Test
    public void min10in9() {
        Assert.assertEquals(30, answer.minMinions(1000000000));
    }

    @Test
    public void max10in9() {
        Assert.assertEquals(42, answer.maxMinions(1000000000));
    }

    @Test
    public void rezFromExp143() {
        Assert.assertEquals(3, answer.answer(143));
    }

    @Test
    public void rezFromMin() {
        Assert.assertEquals(3, answer.minMinions(10));
    }

    @Test
    public void rezFromMax10() {
        Assert.assertEquals(4, answer.maxMinions(10));
    }

    @Test
    public void rezMinMax13() {
        Assert.assertEquals(4, answer.minMinions(13));
    }

    @Test
    public void rezMinMax111() {
        Assert.assertEquals(10, answer.minMinions(988));
    }

    @Test
    public void rezMinMax222() {
        Assert.assertEquals(13, answer.minMinions(7167));
    }

    @Test
    public void rezMinMax22() {
        Assert.assertEquals(8, answer.minMinions(312));
    }

    @Test
    public void minMin666() {

        Assert.assertEquals(9, answer.minMinions(666));
    }

    @Test
    public void minMin6616() {

        Assert.assertEquals(12, answer.minMinions(6616));
    }

    @Test
    public void max777() {
        Assert.assertEquals(23, answer.maxMinions(77777));
    }


    @Test
    public void max555() {
        Assert.assertEquals(17, answer.maxMinions(5555));
    }

}
