package com.gottaboy.jing.suanfa;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomSeq {

    public static void main(String[] args) {
        //打印N个(1o,hi)之间的随机值
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        RandomGenerator gen = RandomGenerator.getDefault();
        double x = 0.0;
        for (int i = 0; i < N; i++)
             x = gen.nextDouble(lo, hi);
            System.out.printf("%.2f\n", x);
    }
}

