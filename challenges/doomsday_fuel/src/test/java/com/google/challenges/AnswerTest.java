package com.google.challenges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AnswerTest {
    private Answer a;

    @Before
    public void setUp() {
        //a = new Answer();
    }

    @Test
    public void testFromExample1() {
        int[][] m = {{0,1,0,0,0,1},{4,0,0,3,2,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        a = new Answer(m);
        Assert.assertArrayEquals(new int[]{7, 6, 8, 21},a.answer(m));
        //Assert.assertArrayEquals(new boolean[]{false, false, true, true, true, true},a.getTerminalStates());
        //Assert.assertArrayEquals(new int[][]{{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,1,0,0,0,1},{4,0,0,3,2,0}}, a.getOrderedM());
    }

    @Ignore
    @Test
    public void testFromExample2() {
        int[][] m = {{0, 1, 0, 0, 0, 1}, {4, 0, 0, 3, 2, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        a = new Answer(m);
        //Assert.assertArrayEquals(new int[]{0, 3, 2, 9, 1},a.answer(m));
    }


}
