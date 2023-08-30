package training.refactor.f_convert;

// TODO extract `total` to a field, which is initialized at field declaration level
// TODO fix the `getTotal()` method
// TODO convert the anonymous Runnable into an inner class with name `IncrementRunnable`
// TODO then move `IncrementRunnable` into a top-level class
public class Tracker {

    public int trackVisit(int numberOfGuests) {
        int total = 0;
        total += numberOfGuests;
        return total;
    }

    public int getTotal() {
        return 0;
    }

    public Runnable getIncrementByOneRunnable() {
        return new Runnable() {
            @Override
            public void run() {
                trackVisit(1);
            }
        };
    }
}
