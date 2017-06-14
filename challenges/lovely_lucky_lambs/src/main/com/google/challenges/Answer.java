package com.google.challenges;

public class Answer {
    public static int answer(int total_lambs) {
        if (total_lambs < 10 || total_lambs > 1000000000){
            return 0;
        } else return maxMinions(total_lambs) - minMinions(total_lambs);
    }

    static int minMinions(int total_lambs) {
        int fib = 0;
        int sum = 0;
        int fibCount = 0;
        while (sum + fib * 2 <= total_lambs) {
            if (fib == 0){
                fib = 1;
            } else fib = fib * 2;
            sum += fib;
            fibCount++;
        }
        if (total_lambs - sum >= fib + fib / 2 ) {
            return fibCount +1;
        } else return fibCount;
    }

    static int maxMinions(int total_lambs) {
        int fib = 0;
        int prevFib = 1;
        int sum = 0;
        int fibCount = 0;
        while (sum + fib + prevFib <= total_lambs) {
            fib = fib + prevFib;
            prevFib = fib - prevFib;
            sum += fib;
            fibCount++;
        }
        return fibCount;
    }
}