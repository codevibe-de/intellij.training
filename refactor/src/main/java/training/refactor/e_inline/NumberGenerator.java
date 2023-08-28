package training.refactor.e_inline;

// TODO inline method `getLast()`
// TODO inline the local variable `defaultIncrement`
public class NumberGenerator {

    private int last = 0;

    public static final int MULTIPLIER = 2;

    public int next() {
        int defaultIncrement = 20;
        int next = (getLast() + defaultIncrement) * MULTIPLIER;
        this.last = next;
        return next;
    }

    private int getLast() {
        return last;
    }
}
