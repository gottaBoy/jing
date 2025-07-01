package com.gottaboy.jing.suanfa;

import java.util.*;

public class Stats {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Double line = sc.nextDouble();
            list.add(line);
        }
        int N = list.size();
        int sum = 0;
        for (Double item : list) {
            sum += item;
        }
        double avg = sum / N;
        sum = 0;
        for (Double x : list) {
            sum += (x - avg) * (x - avg);
        }
        double std = Math.sqrt(sum / N);
        System.out.printf("%.2f\n", avg);
        System.out.printf("%.2f\n", std);
    }

    public static void jihe() {
        Iterator<Double> iterator = queue.iterator();
        Collection<Double> collection = new ArrayList<>();
        Queue<Double> queue = new LinkedList<>();
    }
}
