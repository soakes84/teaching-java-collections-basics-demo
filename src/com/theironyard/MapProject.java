package com.theironyard;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by spenceroakes on 9/25/17.
 */
public class MapProject {

    static Map<Integer, Long> fibonacciNums = new HashMap<>();

    public static void initMap () {
        fibonacciNums.put(0, 0l);
        fibonacciNums.put(1, 1l);
    }

    public static long calcFibonacci (int index) {
        if (fibonacciNums.containsKey(index)) {
            return fibonacciNums.get(index);
        }
        long response = calcFibonacci(index - 1) + calcFibonacci(index - 2);
        fibonacciNums.put(index, response);
        return response;
    }
}
