package de.codevibe.counter;

import java.util.HashMap;
import java.util.Map;

public class Counter {

    private Map<String, Integer> countsMap;

    public Counter() {
        countsMap = new HashMap<>();
    }

    public int increment(String name) {
        return countsMap.compute(name, (k, v) -> v == null ? 1 : v + 1);
    }

    public int get(String name) {
        return countsMap.getOrDefault(name, 0);
    }

    public int decrement(String name) {
        Integer newValue = countsMap.computeIfPresent(name, (k, v) -> v <= 1 ? null : v - 1);
        return newValue == null ? 0 : newValue;
    }

    public void clear(String name) {
        countsMap.remove(name);
    }
}
