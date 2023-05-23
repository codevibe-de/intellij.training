package training.refactor.e_inline;

// TASKS:
// - inline method `getLast()`
// - inline the local variable `defaultIncrement`
public class NumberGenerator {

    private int last = 0;

    public int next() {
        int defaultIncrement = 20;
        int next = getLast() + defaultIncrement;
        this.last = next;
        return next;
    }

    private int getLast() {
        return last;
    }
}
