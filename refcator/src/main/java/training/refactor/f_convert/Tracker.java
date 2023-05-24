package training.refactor.f_convert;

// TASKS:
// - convert `total` to a field, which is initialized at field declaration level
// - fix the `getTotal()` method
// - convert the anonymous Runnable into an inner class with name `IncrementRunnable`
public class Tracker {

	public int trackVisit(int numberOfGuests) {
		int total = 0;
		total += numberOfGuests;
		return total;
	}

	public int getTotal() {
		// TODO
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
