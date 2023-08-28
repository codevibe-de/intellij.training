package training.refactor.b_move;

public class SomeClass {

	private TargetClass target = new TargetClass();

	private final double defaultFactor = 4.2;

	public int calculateSomething(int n) {
		return calculateSomething(n, defaultFactor);
	}

	public int calculateSomething(int n, double factor) {
		return (int) (n * factor);
	}
}
