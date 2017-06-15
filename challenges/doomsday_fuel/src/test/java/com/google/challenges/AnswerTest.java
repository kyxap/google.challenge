package com.google.challenges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AnswerTest {
    private Answer a;

    @Before
    public void setUp() {
        a = new Answer();
    }

    @Test
    public void testFromExample1() {
        int[][] m = {{0,1,0,0,0,1},{4,0,0,3,2,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        Assert.assertArrayEquals(new int[]{7, 6, 8, 21},a.answer(m));
    }

    @Test
    public void testFromExample2() {
        int[][] m = {{0, 1, 0, 0, 0, 1}, {4, 0, 0, 3, 2, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        Assert.assertArrayEquals(new int[]{0, 3, 2, 9, 1},a.answer(m));
    }


}
