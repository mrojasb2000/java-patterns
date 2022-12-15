package org.example.functional.Streams;

import java.util.stream.IntStream;

public class Grouping {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        long counted = IntStream.rangeClosed(0, 1_000_000_000)
                .parallel()
                .filter(i -> i % 2 == 0)
                .count();
        long duration = System.currentTimeMillis() - startTime;
        System.out.printf("the number the events %d time for execution %d", counted, duration);

    }
}
