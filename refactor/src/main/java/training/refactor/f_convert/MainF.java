package training.refactor.f_convert;

public class MainF {

	public static void main(String[] args) {
		var tracker = new Tracker();
		tracker.getIncrementByOneRunnable().run();
		System.out.println(tracker.getTotal());
	}

}
