package de.codevibe.counter;

public class CounterApp {

    public static void main(String[] args) {
        var counter = new Counter();
        var n = "visiting";
        counter.increment(n);
        counter.increment(n);
        System.out.println(counter.get(n));
        counter.decrement(n);
        System.out.println(counter.get(n));
        counter.decrement(n);
    }
}
